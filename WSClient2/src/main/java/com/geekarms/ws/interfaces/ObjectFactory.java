
package com.geekarms.ws.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.geekarms.ws.interfaces package. 
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

    private final static QName _AddUser_QNAME = new QName("http://interfaces.ws.geekarms.com/", "addUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://interfaces.ws.geekarms.com/", "addUserResponse");
    private final static QName _FindAll_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findAllResponse");
    private final static QName _FindById_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findByIdResponse");
    private final static QName _FindUserMap_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findUserMap");
    private final static QName _FindUserMapResponse_QNAME = new QName("http://interfaces.ws.geekarms.com/", "findUserMapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.geekarms.ws.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindUserMap }
     * 
     */
    public FindUserMap createFindUserMap() {
        return new FindUserMap();
    }

    /**
     * Create an instance of {@link FindUserMapResponse }
     * 
     */
    public FindUserMapResponse createFindUserMapResponse() {
        return new FindUserMapResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link MapUserType }
     * 
     */
    public MapUserType createMapUserType() {
        return new MapUserType();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findUserMap")
    public JAXBElement<FindUserMap> createFindUserMap(FindUserMap value) {
        return new JAXBElement<FindUserMap>(_FindUserMap_QNAME, FindUserMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.ws.geekarms.com/", name = "findUserMapResponse")
    public JAXBElement<FindUserMapResponse> createFindUserMapResponse(FindUserMapResponse value) {
        return new JAXBElement<FindUserMapResponse>(_FindUserMapResponse_QNAME, FindUserMapResponse.class, null, value);
    }

}
