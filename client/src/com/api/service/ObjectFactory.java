
package com.api.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.api.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserResponse_QNAME = new QName("http://server.web.sdw.com/", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("http://server.web.sdw.com/", "getUser");
    private final static QName _GetUsers_QNAME = new QName("http://server.web.sdw.com/", "getUsers");
    private final static QName _GetAllNamesResponse_QNAME = new QName("http://server.web.sdw.com/", "getAllNamesResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://server.web.sdw.com/", "getUsersResponse");
    private final static QName _GetAllNames_QNAME = new QName("http://server.web.sdw.com/", "getAllNames");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.api.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetAllNamesResponse }
     * 
     */
    public GetAllNamesResponse createGetAllNamesResponse() {
        return new GetAllNamesResponse();
    }

    /**
     * Create an instance of {@link GetAllNames }
     * 
     */
    public GetAllNames createGetAllNames() {
        return new GetAllNames();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getAllNamesResponse")
    public JAXBElement<GetAllNamesResponse> createGetAllNamesResponse(GetAllNamesResponse value) {
        return new JAXBElement<GetAllNamesResponse>(_GetAllNamesResponse_QNAME, GetAllNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.web.sdw.com/", name = "getAllNames")
    public JAXBElement<GetAllNames> createGetAllNames(GetAllNames value) {
        return new JAXBElement<GetAllNames>(_GetAllNames_QNAME, GetAllNames.class, null, value);
    }

}
