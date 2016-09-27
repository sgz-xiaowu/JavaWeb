package com.sdw.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shendawei on 16/9/26.
 */
@WebServlet(name = "HelloWorld")
public class HelloWorld extends HttpServlet {

    private String message;
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        message = "Hello world, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); 子类实现方法，就无需调用这个错误提示方法

        //设置响应内容类型
        resp.setContentType("text/html");

        //设置响应内容
        PrintWriter out = resp.getWriter();
        out.write(message);
        out.println("<p>" + message + "</p>");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
