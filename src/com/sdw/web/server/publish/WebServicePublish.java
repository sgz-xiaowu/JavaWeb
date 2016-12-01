package com.sdw.web.server.publish;

import com.sdw.web.server.UserServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by shendawei on 16/9/28.
 */
public class WebServicePublish {
    public static void main(String[] args) {
        //定义WebService的发布地址，这个地址就是提供给外界访问Webervice的URL地址
        //URL地址格式为：http://ip:端口号/xxxx
        //浏览器访问接口地址 http://ip:端口号/xxxx?wsdl
        String address = "http://127.0.0.1:8900/server";
        Endpoint.publish(address, new UserServiceImpl());
        System.out.println("Web service发布成功！");
    }
}
