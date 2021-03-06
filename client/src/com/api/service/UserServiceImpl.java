
package com.api.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserServiceImpl", targetNamespace = "http://server.web.sdw.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.api.service.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetUserResponse")
    @Action(input = "http://server.web.sdw.com/UserServiceImpl/getUserRequest", output = "http://server.web.sdw.com/UserServiceImpl/getUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.api.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetUsersResponse")
    @Action(input = "http://server.web.sdw.com/UserServiceImpl/getUsersRequest", output = "http://server.web.sdw.com/UserServiceImpl/getUsersResponse")
    public List<User> getUsers();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllNames", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetAllNames")
    @ResponseWrapper(localName = "getAllNamesResponse", targetNamespace = "http://server.web.sdw.com/", className = "com.api.service.GetAllNamesResponse")
    @Action(input = "http://server.web.sdw.com/UserServiceImpl/getAllNamesRequest", output = "http://server.web.sdw.com/UserServiceImpl/getAllNamesResponse")
    public List<String> getAllNames();

}
