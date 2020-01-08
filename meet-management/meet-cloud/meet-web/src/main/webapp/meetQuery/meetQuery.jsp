<%--
  Created by IntelliJ IDEA.
  User: KongLingbo
  Date: 2020/1/8
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="import" href="../common.html">
</head>
<body>
    <div class="container-fluid">
        <div class="panel panel-default" >
            <!-- Default panel contents -->
            <div class="panel-heading" style="background-color: #65a1df">会议查询</div>
            <div class="panel-body" >
                <div class="row">
                    <div >
                        会议分类：
                        <select>
                            <option>请选择</option>
                        </select>
                        会议类型：
                        <select>
                            <option>请选择</option>
                        </select>
                        会议时间：
                        <input type="date">
                        至
                        <input type="date">
                    </div>
                </div>
                <div class="row">
                    <div>
                        会议名称：
                        <select>
                            <option>请选择</option>
                        </select>
                        会议地点：
                        <select>
                            <option>请选择</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div>
                        通知状态：
                        <select>
                            <option>请选择</option>
                        </select>
                        承办人：
                        <select>
                            <option>请选择</option>
                        </select>
                        主持人：&nbsp;&nbsp;&nbsp;&nbsp;
                        <select>
                            <option>请选择</option>
                        </select>
                        密级：
                        <select>
                            <option>请选择</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-primary">查询</button>
            </div>
            <!-- Table -->
            <table id="meetTable" class="table table-bordered table-striped"></table>
        </div>
    </div>
</body>
<script>
    //dataTable初始化数据
    var shopTable  = $("#meetTable").DataTable({
        "autoWidth": true, //自适应宽度
        "info": true,//展示表格左下角信息,分页栏
        "lengthChange": false,//是否改变每页展示的条数
        "lengthMenu": [5,10],
        "ordering": false,//是否允许排序
        "searching": false,
        "paging": true,//是否允许开启本地分页
        "processing": true,//是否先处理状态
        "serverSide": true,//true是服务器模式，false是客户端模式
        "bServerSide": true,

        //展示商品
        "ajax":{
            url:"http://localhost:8009/meetQuery/shop",
            type:"post",
            async:false,
            dataType:"json",
            "dataSrc":function(result){
                return result.data;
            }
        },

        "columns":[
            {"data":"shopname","title":"序号"},
            {"data":"brandid","title":"会议名称"},
            {"data":"typeid","title":"会议类型"},
            {"data":"photo","title":"会议时间",render:function (data,type,row,meta) {
                    if(data != null){
                        return '<img src="'+data+'" width="150px">'
                    }else {
                        return "11"
                    }
                }},
            {"data":"price","title":"主持人"},
            {"data":"stock","title":"承办人"},
            {"data":"status","title":"通知状态"},
            {"data":"id","title":"操作",render:function (data,type,row,meta) {
                    var button = '<button type="button" class="btn btn-primary" onclick="addCarts(\'' + data + '\')">';
                    button += '<span>加入购物车</span></button>';
                    return button;
                }}
        ],
        "language":{
            "url": "commons/datatable/Chinese.json"
        }
    })
</script>
</html>
