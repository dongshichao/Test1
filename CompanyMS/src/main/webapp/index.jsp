<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<body style="background-color: gray;">
<s:fielderror/><br>
<div align="center">
    <h3>欢迎来到登录页面</h3>
    <form action="login" method="post">
        姓名:<input type="text" name="e.name"><br><br>
        密码:<input type="password" name="e.password"><br><br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>