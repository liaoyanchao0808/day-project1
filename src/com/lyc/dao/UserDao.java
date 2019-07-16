package com.lyc.dao;

import com.lyc.entity.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {
    private static final String DRIVER_CLSS = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/huluhua?useUnicode=true&characterEncoding=utf8";
    private static final String username = "root";
    private static final String password = "huluhua";

    //获取链接对象
     public Connection getConnection(){
         try {
             Class.forName(DRIVER_CLSS);
             return DriverManager.getConnection(url,username,password);
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return null;
     }

     //关闭资源
    public void closeAll(Connection conn, PreparedStatement pre, ResultSet rs){
        try {
            if(rs != null) rs.close();
            if(pre != null) pre.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //用户登录
    public ArrayList<User> loginUser(User user){
        ArrayList<User> list = new ArrayList<>();
        //User user = new User();
        Connection conn =null;
         PreparedStatement pre =null;
         ResultSet rs =null;

        try {
            //获取连接数据
            conn = this.getConnection();
            //进行预编译 执行sql语句
            pre = conn.prepareStatement("select * from user where username =? and password =?");
            //设置占位符
            pre.setString(1,user.getUsername());
            pre.setString(2,user.getPassword());
            //执行sql 返回结果集
            rs = pre.executeQuery();
            while (rs.next()){
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getNString("password"));
                user.setAge(rs.getInt("age"));
                user.setSex(rs.getString("sex"));
                user.setHobbys(rs.getString("hobbys"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddrs(rs.getString("addrs"));
                list.add(user);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeAll(conn,pre,rs);
        }
            return null;
    }

    //新用户注册
    public int registerUser(User user){
        Connection conn =null;
        PreparedStatement pre =null;
        ResultSet rs =null;

        try {
            //获取链接
            conn = this.getConnection();
            //进行预编译 执行sql语句
            pre = conn.prepareStatement("insert into user (username ,password) values (?,?)");
            //设置占位符
            pre.setString(1,user.getUsername());
            pre.setString(2,user.getPassword());
            //执行sql 返回受影响的行数
            int rows = pre.executeUpdate();
            return rows;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeAll(conn,pre,rs);
        }
        return 0;
    }

    //校验用户名
    public ArrayList<User> verifyUser(User user){
        ArrayList<User> list = new ArrayList<>();
        Connection conn =null;
         PreparedStatement pre =null;
         ResultSet rs =null;

        try {
            //获取连接数据
            conn = this.getConnection();
            //进行预编译 执行sql语句
            pre = conn.prepareStatement("select count(*) from user where username =?");
            //设置占位符
            pre.setString(1,user.getUsername());
            //执行sql 返回结果集
            rs = pre.executeQuery();
            while (rs.next()){
               user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getNString("password"));
                user.setAge(rs.getInt("age"));
                user.setSex(rs.getString("sex"));
                user.setHobbys(rs.getString("hobbys"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddrs(rs.getString("addrs"));
                list.add(user);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.closeAll(conn,pre,rs);
        }
        return null;
    }
}

