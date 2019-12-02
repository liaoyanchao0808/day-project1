package com.lyc.servlet;

import com.lyc.dao.UserDao;
import com.lyc.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String error ="";
        String success ="";
        System.out.println("success");
        try {
            //获取数据
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            //验证账户名和密码
            if(username == null || "".equals(username)
                && password == null || "".equals(password)){
                throw new RuntimeException("账户名或密码不能为空");
            }
            //调用dao来操作数据库
            UserDao userDao = new UserDao();
            User user = new User();
            ArrayList<User> list = userDao.loginUser(user);
            if(list == null && list.size()<1){
                throw new RuntimeException("账户名不存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
            error = e.getMessage();
        }

        if("".equals(error)){
            //表示取到数据
            req.getRequestDispatcher("queryServlet").forward(req,resp);
        }else {
            PrintWriter out = resp.getWriter();
            out.println("<script type='text/javascript'>alert('信息错误:"+error+"');history.back();</script>");


        }


    }
}
