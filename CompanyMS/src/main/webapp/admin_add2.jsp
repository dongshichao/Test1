<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin_add2</title>
</head>
<body>
<h2>发布新公告</h2>

<form action="adminadd2" method="post">
    标题:<input type="text" name="b.title"><br>
    公告内容:<br>
    <textarea rows="10" cols="50" name="b.content" ></textarea><br>
    日期:<input type="date" name="b.date"><br>
    <input type="submit" value="添加">


</form>
</body>
</html>
