<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/1
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
     function a(){
        $.post({
          url: "${pageContext.request.contextPath}/a1",
          data: {"name":$("#username").val()},
          success: function (data){
            alert(data);
          }
        })
     }
    </script>
  </head>
  <body>
    用户名：<input type="text" id="username" onblur="a()"/>
  </body>
</html>
