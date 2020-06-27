<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>admin_show4</title>
</head>
<body>
<div align="right">
    <form action="adminquery4" method="post">
        请输入关键字进行模糊查询:<input type="text" name="que"><input type="submit" value="查询">
    </form>

</div>
<h2 align="center">查看员工信息</h2>
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
                <th><a href="admin_update2.jsp?name=<s:property value="name"/>">修改</a></th>
                <th><a href="admindelete4?s.name=<s:property value="name"/>">删除</a></th>
            </tr>

        </s:iterator>
    </table>
    <h3 align="center"><a href="admin_add3.jsp">添加员工薪资</a></h3>
    <a href="admin_index.jsp">点击此处返回主页面</a>
</div>
</body>
</html>
