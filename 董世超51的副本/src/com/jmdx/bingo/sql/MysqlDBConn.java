package com.jmdx.bingo.sql;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class MysqlDBConn {
    private PreparedStatement ps;
    private Connection conn;
    ResultSet res;
    public static final String url = "jdbc:mysql://localhost:3306/dsc51?useSSL=false";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "12213654";
    public MysqlDBConn() {
        ps = null;
        res = null;
        try {
            Class.forName(name);
            conn = DriverManager.getConnection(url,user,password);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public ResultSet Query(String sql,Map<Integer,Integer> map) {
        try {
            ps = conn.prepareStatement(sql);
            for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
                ps.setInt(entry.getKey(),entry.getValue());
            }
            res = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public String getResult(ResultSet result) {
        String uName = "";
        try {
            while (result.next()) {
                uName = result.getString("name");
//                System.out.println("name:"+userName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return uName;
    }

    public static void main(String[] args) {
        String sql = "select name from student where id = ? and stu_id = ?";
        MysqlDBConn conn = new MysqlDBConn();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,901);
        ResultSet res = conn.Query(sql,map);
//        System.out.println(res.toString());
        String str = conn.getResult(res);
        System.out.println(str);
    }
}

