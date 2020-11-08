<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/1
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script type="text/javascript" src="statics/js/jquery-3.4.1.js"></script>
    <script>
        $(function(){
            $("#username").blur(function(){
                if($("#username").val()==null || $("#username").val().trim()===""){
                    alert("用户名不能为空");
                }
            });
            $("#password").blur(function(){
                if($("#password").val()==null || $("#password").val().trim()===""){
                    alert("密码不能为空");
                }
            });
            $("#btn").click(function(){
                var username = $("#username").val();
                var password = $("#password").val();
                $.ajax({
                    url:"${pageContext.request.contextPath}/login",
                    data:{
                        "username":username,
                        "password":password
                    },
                    success:function (data) {
                        if(data === "用户名不能为空" || data === "密码不能为空"){
                            alert(data);
                        }
                        console.log(data);
                    }
                });
                // $.ajax("/login",{"username":username,"password":password},function (data) {
                //     alert(data);
                // });

            });
        })
    </script>
</head>
<body>
用户名：<input type="text" name="username" id="username"/><br/>
密&nbsp;&nbsp;码<input type="password" name="password" id="password"/><br/>
<input type="button" id="btn" value="登录">
</body>
</html>
