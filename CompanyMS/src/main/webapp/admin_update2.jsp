<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>admin_update2</title>
</head>
<body>
<h2>修改员工薪资</h2>
<form action="adminupdate4" method="post">
<s:iterator value="#session.salarylist.{?#this.name==#parameters.name[0]}">
    <input type="hidden" name="s.name" value="<s:property value="name"/>"><br>
    应发工资:<input type="text" name="s.sum" value="<s:property value="sum"/>"><br>
    奖金:<input type="text" name="s.bonus" value="<s:property value="bonus"/>"><br>
    扣除:<input type="text" name="s.cost" value="<s:property value="cost"/>"><br>
    实发工资:<input type="text" name="s.fact" value="<s:property value="fact"/>"><br>
    <input type="submit" value="修改">
</s:iterator>
</form>
</body>
</html>
