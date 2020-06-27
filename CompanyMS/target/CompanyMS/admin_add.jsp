<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin_add</title>
</head>
<body>
<h2>添加员工</h2>

<form action="adminadd" method="post">
    姓名:<input type="text" name="e.name"><br>
    密码:<input type="password" name="e.password"><br>
    性别:
    <input type="radio" name="e.sex" value="男" checked="checked"/>男
    <input type="radio" name="e.sex" value="女"/>女
    <br>
    年龄:<input type="text" name="e.age"><br>
    权限:
    <input type="radio" name="e.limitation" value="admin"/>管理员
    <input type="radio" name="e.limitation" value="user" checked="checked"/>普通用户<br>
    <input type="submit" value="添加">


</form>
</body>
</html>
