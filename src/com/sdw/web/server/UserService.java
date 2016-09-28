package com.sdw.web.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by shendawei on 16/9/28.
 *
 * 定义SEI(WebService EndPoint Interface(终端))
 */
//使用@WebService注解标注WebServiceI接口
@WebService
public interface UserService {
    //使用@WebMethod注解标注WebServiceI接口中的方法
    @WebMethod
    User getUser(int uid);
    @WebMethod
    List<User> getUsers();
    @WebMethod
    List<String> getAllNames();
}
