package com.sdw.web.server.client;

import com.sdw.web.server.UserServiceImpl;
import com.sdw.web.server.UserServiceImplService;

/**
 * Created by shendawei on 16/9/28.
 */
public class UserClient {
    public static void main(String[] args) {
        //创建一个用于产生UserServiceImpl实例的工厂，UserServiceImplService类是wsimport工具生成的。
        //UserServiceImplService有几个构造函数，可以直接new一个UserServiceImplService实例对象，默认构造函数无参。
        UserServiceImplService serviceFactory = new UserServiceImplService();
        //创建UserServiceImpl实例，UserServiceImpl类是wsimport工具生成的。
        //UserServiceImpl没有构造函数，是server端的webservice实现类，可由UserServiceImplService工厂类获取。
        UserServiceImpl userServiceImpl = serviceFactory.getUserServiceImplPort();

        //调用UserService提供的接口方法
        System.out.println("调用UserServiceImpl的getUser(3)方法: " + userServiceImpl.getUser(3));
        System.out.println("调用UserServiceImpl的getUsers()方法: " + userServiceImpl.getUsers());
        System.out.println("调用UserServiceImpl的getAllNames()方法: " + userServiceImpl.getAllNames());
    }
}
