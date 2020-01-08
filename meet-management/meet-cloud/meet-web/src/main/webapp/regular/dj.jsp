<%--
  Created by IntelliJ IDEA.
  User: 暗夜精灵
  Date: 2020/1/8
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>

</style>
<link href="../commons/layui/css/layui.css" rel="stylesheet">

<script type="text/javascript" src="../commons/js/jquery-3.3.1.min.js"></script>


<body>

<div class="layui-card">
    <div class="layui-card-header" style="background-color: #5fd3ff"><font color="#f0ffff">例会登记</font></div>
    <div class="layui-card-body">
        <form class="layui-form" id="djform" action="">

            <%--//第一行--%>
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">会议类型</label>
                    <div class="layui-input-block">
                        <select id="meetingId" lay-verify="required">
                            <option value="1">市政府常务会</option>
                            <option value="2">市长办公会</option>
                        </select>
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">
                        <span class="layui-badge-dot"></span>会议时间
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" name="date" id="meetingTime">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">时分</label>
                    <div class="layui-input-inline">
                        <input type="text" class="layui-input" name="time" id="time">
                    </div>
                </div>
            </div>

           <%-- //第二行--%>
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">
                        <span class="layui-badge-dot"></span>会议名称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" name="meetingName"   class="layui-input">
                    </div>
                </div>

                <div class="layui-inline">
                    <label class="layui-form-label">密级</label>
                    <div class="layui-input-block">
                        <select id="securityClassification" lay-verify="required">
                            <option value="1">非密</option>
                            <option value="2">机密</option>
                        </select>
                    </div>
                </div>
            </div>

            <%--第三行--%>

            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">
                        <span class="layui-badge-dot"></span>主持人
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" name="emcee"  class="layui-input">
                    </div>
                </div>

                <div class="layui-inline">
                    <label class="layui-form-label">会议地点</label>
                    <div class="layui-input-block">
                        <select id="venueId" lay-verify="required">
                            <option value="1">市政府5号大楼会议室</option>
                            <option value="2">市政府北楼一会议室</option>
                        </select>
                    </div>
                </div>
            </div>

            <%--第四行--%>
                <div class="layui-form-item">
                    <div class="layui-inline">
                        <label class="layui-form-label">
                            <span class="layui-badge-dot"></span>承办人
                        </label>
                        <div class="layui-input-inline">
                            <input type="text" name="undertaker" class="layui-input">
                        </div>
                    </div>
                    <div class="layui-inline" >
                        <label class="layui-form-label">
                            <span class="layui-badge-dot"></span>发送通知
                        </label>
                        <div class="layui-input-block">
                            <input type="radio" name="notification" value="1" title="是" checked>
                            <input type="radio" name="notification" value="2" title="否">
                        </div>
                    </div>
                </div>

            <%--第五行--%>
                <div class="layui-form-item">
                    <div class="layui-inline">
                        <label class="layui-form-label">
                            <span class="layui-badge-dot"></span>反馈时间
                        </label>
                        <div class="layui-input-inline">
                            <input type="text" class="layui-input" id="feedbackTime">
                        </div>
                    </div>
                </div>
                <%--第六行--%>
                <div class="layui-form-item">
                    <label class="layui-form-label">材料备注</label>
                    <div class="layui-input-block">
                        <input type="text" name="materialNote" class="layui-input">
                    </div>
                </div>
                <div id="yiti">
                <%--分界线--%>
                <hr class="layui-bg-blue">

                <%--第七行--%>
                <div class="layui-form-item">
                    <label class="layui-form-label">议题名称</label>
                    <div class="layui-input-block">
                        <select name="topicId" lay-verify="required">
                            <option value=""></option>
                            <option value="0">111</option>
                            <option value="1">2222</option>
                        </select>
                    </div>
                </div>

                <%--第八行--%>
                <div class="layui-form-item">
                    <label class="layui-form-label">汇报人</label>
                    <div class="layui-input-block">
                        <input type="text" name="reporter" class="layui-input">
                    </div>
                </div>

                <%--第九行--%>
                <div class="layui-form-item">
                    <label class="layui-form-label">
                        参加议题讨论人员
                        <button type="button" onclick="addUser()" class="layui-btn layui-btn-primary layui-btn-sm">
                            <i class="layui-icon">&#xe654;</i>
                        </button>
                    </label>
                    <div class="layui-input-block">
                        <textarea name="userId" required lay-verify="required"  class="layui-textarea"></textarea>
                    </div>
                </div>
                </div>
        </form>
        <button type="button" onclick="addyiti()" class="layui-btn layui-btn-normal">添加议题</button>
        <center><button type="button" class="layui-btn layui-btn-normal">保存</button></center>
    </div>
</div>
</body>
<script type="text/javascript" src="../commons/layui/layui.all.js"></script>
<script type="text/javascript" src="dj.js"></script>
<script type="text/javascript">
    layui.use('laydate', function(){
        var laydate = layui.laydate;


        laydate.render({
            elem: '#meetingTime'
            ,theme: '#5fd3ff'
        });
        //时间选择器
        laydate.render({
            elem: '[name=time]'
            ,type: 'time'
            ,theme: '#5fd3ff'
        });

        //日期选择器
        laydate.render({
            elem: '#feedbackTime'
            ,type: 'datetime'
            ,theme: '#5fd3ff'
        });
    });

</script>
</html>
