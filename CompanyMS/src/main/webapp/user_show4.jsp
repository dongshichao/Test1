<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>user_show4</title>
</head>
<body>
<h2 align="center">查看个人薪资信息</h2>
<div align="center">
    <table border="1">
        <tr>
            <th>姓名</th>
            <th>应发工资</th>
            <th>奖金</th>
            <th>扣除</th>
            <th>实发工资</th>
        </tr>
        <s:iterator value="#session.salarylist">

            <tr>
                <th><s:property value="name"/></th>
                <th><s:property value="sum"/></th>
                <th><s:property value="bonus"/></th>
                <th><s:property value="cost"/></th>
                <th><s:property value="fact"/></th>
            </tr>

        </s:iterator>
    </table>

    <a href="user_index.jsp">点击此处返回主页面</a>
</div>
</body>
</html>
