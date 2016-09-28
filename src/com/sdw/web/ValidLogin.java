package com.sdw.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shendawei on 16/9/28.
 */
@WebServlet(name = "ValidLogin", urlPatterns = "/valid-login")
public class ValidLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //valid
        String username = request.getParameter("username"); //field与html->input name.value对应。
        String password = request.getParameter("password"); //field与html->input name.value对应。
        if ("shendawei".equals(username) && "123456".equals(password)) {
            log("验证成功，进入welcome界面");
            System.out.println("验证成功，进入welcome界面");
//            request.getRequestDispatcher("welcome").forward(request, response); //jsp页面跳转方式
            response.sendRedirect("welcome"); //servlet页面跳转方式
        } else {
            log("验证失败，返回login界面");
            System.out.println("验证失败，返回login界面");
            response.sendRedirect("login");
        }
    }
}
