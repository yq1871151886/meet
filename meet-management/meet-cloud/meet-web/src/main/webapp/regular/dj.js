$(function () {
    getVenue();
    getMeetingType();
    /*getTopic();*/
});

function addyiti() {
    var djformhtml = $("#yiti").html();
    $("#djform").append(djformhtml);
}


function getVenue() {
    $.ajax({
        url: 'http://localhost:8003/regular/getVenue',
        type: 'post',
        dataType: 'json',
        success: function (res) {
            var venuehtml = "";
            var venuelist = res.data;
            for (var i = 0; i < venuelist.length; i++) {
                venuehtml += '<option value="' + venuelist[i].venueId + '">' + venuelist[i].venueName + '</option>';
            }
            /*alert(venuehtml)*/
            $("#venueId").html(venuehtml);
            layui.form.render("select");
        }
    })
}

function getMeetingType() {
    $.ajax({
        url: 'http://localhost:8003/regular/getMeetingType',
        type: 'post',
        dataType: 'json',
        success: function (res) {
            var typehtml = "";
            var typelist = res.data;
            for (var i = 0; i < typelist.length; i++) {
                /* alert(typelist[i].meetingName);*/
                typehtml += '<option value="' + typelist[i].meetingId + '">' + typelist[i].meetingName + '</option>';
            }
            $("#meetingId").html(typehtml);
            layui.form.render("select");
        }
    })
}

function getTopic() {
    $.ajax({
        url: 'http://localhost:8003/regular/getTopic',
        type: 'post',
        dataType: 'json',
        success: function (res) {
            var topichtml = "";
            var topiclist = res.data;
            for (var i = 0; i < topiclist.length; i++) {
                /* alert(typelist[i].meetingName);*/
                topichtml += '<option value="' + topiclist[i].topicId + '">' + typelist[i].topicName + '</option>';
            }
            $("#topicId").html(topichtml);
            layui.form.render("select");
        }
    })
}

