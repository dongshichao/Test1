<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>adimin_upload</title>
</head>
<body>
<form action="upload3" method="post" enctype="multipart/form-data">
    请选择文件:<input type="file" name="d.docu"><br>
    请选择上传时间:<input type="date" name="d.date"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
