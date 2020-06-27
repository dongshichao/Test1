<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>admin_show3</title>
</head>
<body>
<div align="right">
    <form action="adminquery3" method="post">
        请输入关键字进行模糊查询:<input type="text" name="que"><input type="submit" value="查询">
    </form>

</div>
<h2 align="center">文件管理</h2>
<div align="center">
    <table border="1">

        <s:iterator value="doculist">


            <tr>
                <th><s:property value="id"/></th>
                <th><s:property value="docuname"/></th>
                <th><s:property value="date"/></th>
                <th><a href="admindelete3?d.id=<s:property value="id"/>">删除</a></th>
                <th><a href="download3?filename=<s:property value="docuFileName"/>">下载</a></th>
            </tr>

        </s:iterator>
    </table>
    <h3 align="center"><a href="admin_upload.jsp">上传新文件</a></h3>
    <a href="admin_index.jsp">点击此处返回主页面</a>
</div>
</body>
</html>
