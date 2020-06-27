<%--
  Created by IntelliJ IDEA.
  User: 杨作运
  Date: 2020/6/23
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin_add3</title>
</head>
<body>
<h2>添加员工薪资</h2>

<form action="adminadd4" method="post">
    姓名:<input type="text" name="s.name"><br>
    应发工资:<input type="text" name="s.sum" ><br>
    奖金:<input type="text" name="s.bonus" ><br>
    扣除:<input type="text" name="s.cost" ><br>
    实发工资:<input type="text" name="s.fact" ><br>
    <input type="submit" value="添加">
    <input type="reset" value="重置">

</form>
</body>
</html>
