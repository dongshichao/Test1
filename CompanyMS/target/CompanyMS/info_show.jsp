<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>info_show</title>
</head>
<body>
<s:iterator value="#session.boardlist">

    <s:if test="id==#parameters.id[0] ">

        <s:property value="content"/>

    </s:if>

</s:iterator>
<s:debug/>
</body>
</html>
