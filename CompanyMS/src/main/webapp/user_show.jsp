<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>user_show</title>
</head>
<body>
<h2 align="center">查看和修改个人信息</h2>
<div align="center">
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>password</th>
            <th>sex</th>
            <th>age</th>

            <th>limitation</th>
        </tr>
        <s:iterator value="#session.employeelist">


            <tr>
                <th><s:property value="id"/></th>
                <th><s:property value="name"/></th>
                <th><s:property value="password"/></th>
                <th><s:property value="sex"/></th>
                <th><s:property value="age"/></th>

                <th><s:property value="limitation"/></th>

                <th><a href="user_update.jsp?id=<s:property value="id"/>">修改</a></th>

            </tr>

        </s:iterator>
    </table>

    <a href="user_index.jsp">点击此处返回主页面</a>
        <s:debug/>
</div>
</body>
</html>
