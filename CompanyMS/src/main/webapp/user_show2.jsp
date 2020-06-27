<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>user_show2</title>
</head>
<body>
<div align="right">
    <form action="userquery2" method="post">
        请输入关键字进行模糊查询:<input type="text" name="que"><input type="submit" value="查询">
    </form>

</div>
<h2 align="center">公告管理</h2>
<div align="center">
    <table border="1">

        <s:iterator value="boardlist">


            <tr>
                <th><s:property value="id"/></th>
                <th><a href="info_show.jsp?id=<s:property value="id"/>"><s:property value="title"/></a></th>
                <th><s:property value="date"/></th>
            </tr>

        </s:iterator>
    </table>
    <a href="user_index.jsp">点击此处返回主页面</a>
</div>
</body>
</html>
