package com.sdw.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shendawei on 16/9/28.
 */
@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //进入登录页面
        response.setContentType("text/html; charset=gbk");

        //回应html页面
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("我的登录页面");
        out.println("</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>登录页面</p>");
        out.println("<form action=valid-login method=post>");
        out.println("用户名：<input type=text name=username>");
        out.println("密码：<input type=text name=password>");
        out.println("<input type=submit value=登录>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
