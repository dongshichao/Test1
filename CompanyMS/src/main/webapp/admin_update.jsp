<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>admin_update</title>
</head>
<body>
<h2>修改员工信息</h2>
<form action="adminupdate" method="post">
    <s:iterator value="#session.employeelist.{?#this.id==#parameters.id[0]}">
        <input type="hidden" name="e.id" value="<s:property value="id"/>"><br>
        姓名:<input type="text" name="e.name" value="<s:property value="name"/>"><br>
        <input type="hidden" name="e.password" value="<s:property value="password"/>"><br>
        年龄:<input type="text" name="e.age" value="<s:property value="age"/>"><br>
        性别:<input type="radio" name="e.sex" value="男" checked="checked"/>男
        <input type="radio" name="e.sex" value="女"/>女<br>
        权限:<input type="radio" name="e.limitation" value="admin"/>管理员
        <input type="radio" name="e.limitation" value="user" checked="checked"/>普通用户<br>
    </s:iterator>
    <input type="submit" value="修改个人信息">
</form>
</body>
</html>
