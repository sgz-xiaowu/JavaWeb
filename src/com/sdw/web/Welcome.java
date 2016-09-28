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
@WebServlet(name = "Welcome", urlPatterns = "/welcome")
public class Welcome extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=gbk");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>我的欢迎页面</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h>欢迎页面</h>");
        out.println("<p>Welcome, 恭喜您，登录成功！</p>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
