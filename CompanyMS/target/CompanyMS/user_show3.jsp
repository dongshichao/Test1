<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>user_show3</title>
</head>
<body>
<div align="right">
    <form action="userquery3" method="post">
        请输入关键字进行模糊查询:<input type="text" name="que"><input type="submit" value="查询">
    </form>

</div>
<h2 align="center">查看和下载</h2>
<div align="center">
    <table border="1">

        <s:iterator value="doculist">


            <tr>
                <th><s:property value="id"/></th>
                <th><s:property value="docuname"/></th>
                <th><s:property value="date"/></th>
                <th><a href="download3?filename=<s:property value="docuname"/>">下载</a></th>
            </tr>

        </s:iterator>
    </table>

    <h3><a href="user_index.jsp">点击此处返回主页面</a></h3>
</div>
</body>
</html>
