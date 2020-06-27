<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>


    <title>My JSP 'admin_index.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body style="background-color: gray;">
<h3 align="right">欢迎您:<s:property value="#session.name" />&nbsp;<a href="index.jsp">退出登录</a></h3>
<h1 align="center">管理员界面</h1>
<h3 align="center"><a href="adminshow">点击进行员工信息管理</a></h3>
<h3 align="center"><a href="adminshow2">点击进行公告管理</a></h3>
<h3 align="center"><a href="adminshow3">点击进行文件管理</a></h3>
<h3 align="center"><a href="adminshow4">点击进行薪资管理</a></h3>


<s:debug/>

</body>
</html>