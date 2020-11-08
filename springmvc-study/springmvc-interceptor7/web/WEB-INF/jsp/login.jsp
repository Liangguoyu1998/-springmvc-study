<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/1
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/toLogin" method="post">
    用户名:<input type="text" name="username" id="username"><br/>
    密码:<input type="password" name="password" id="password"><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>

