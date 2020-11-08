<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/1
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test2</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                $.post("${pageContext.request.contextPath}/a2",function(data){
                    //将json集合中的json对象转为json的字符串形式
                    var s = JSON.stringify(data[0]);
                    console.log(s);
                    //输出下标为1,2的json对象
                    console.log(data[1]);
                    console.log(data[2]);
                    //将json的字符串转换为json对象
                    var parse = JSON.parse(s);
                    console.log(parse);
                    var html = "";
                    for(let i=0;i<data.length;i++){
                        html += '<tr>'+
                            '<td>'+data[i].name+'</td>'+
                            '<td>'+data[i].age+'</td>'+
                            '<td>'+data[i].sex+'</td>'+
                            '</tr>';
                    }
                    console.log(html);
                    $("#content").html(html);
                    var content = $("#content tr:even");
                    var content2 = $("#content tr:odd");
                    content.css("backgroundColor","lightgreen");
                    content2.css("backgroundColor","lightblue");

                    console.log(content);
                    console.log(content[0]);
                    for(let j=0;j<content.length;j++){
                        console.log(content[j]);
                    }
                })
            })
        })
    </script>
    <style>
        /*设置奇数行颜色*/
        /*table tbody tr:nth-child(odd)*/
        /*{*/
        /*    background: #0000ff;*/
        /*}*/
        /*设置偶数行颜色*/
        /*table tbody tr:nth-child(even)*/
        /*{*/
        /*    background: #00ccff;*/
        /*}*/
    </style>
</head>
<body>
<input type="button" value="加载数据" id="btn">
<table border="1px">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <tbody id="content">

    </tbody>
</table>
</body>
</html>
