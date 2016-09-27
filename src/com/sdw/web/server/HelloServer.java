package com.sdw.web.server;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shendawei on 16/9/13.
 */
public class HelloServer extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //设置响应内容类型
        resp.setContentType("text/html");

        //设置响应内容
        PrintWriter out = resp.getWriter();
        out.println("<p>" + "这是HelloServer" + "</p>");
    }
}
