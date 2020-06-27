package com.jmdx.bingo.servlet;

import com.jmdx.bingo.sql.MysqlDBConn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;


public class Login extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setHeader("Content-type","text/html;charset=UTF-8");
        String name = request.getParameter("username");
        String pwd = request.getParameter("password");
        String user = login(name,pwd);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write("<h1>你好， "+user+"</h1>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
    public String login (String id,String passwd) {
        Integer uId = Integer.valueOf(id);
        Integer uPasswd = Integer.valueOf(passwd);
        String sql = "select name from student where id = ? and stu_id = ?";
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,uId);
        map.put(2,uPasswd);
        MysqlDBConn conn = new MysqlDBConn();
        ResultSet res = conn.Query(sql,map);
        String uName = conn.getResult(res);
        return uName;
    }
}

