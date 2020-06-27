<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/22
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>user_index</title>
</head>
<body style="background-color: gray;">
<h3 align="right">欢迎您:<s:property value="#session.name" />&nbsp;<a href="index.jsp">退出登录</a></h3>
<h1 align="center">用户界面</h1>
<h3 align="center"><a href="usershow">点击进行个人信息管理</a></h3>
<h3 align="center"><a href="usershow2">点击查看公告</a></h3>
<h3 align="center"><a href="usershow3">点击下载文件</a></h3>
<h3 align="center"><a href="usershow4">点击查看个人薪资</a></h3>
<s:debug/>

</body>
</html>
