package com.geekarms.ws.interfaces;

import com.geekarms.ws.adapter.MapUserAdapter;
import com.geekarms.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;

/**
 * Created by kaywer on 2017/2/8.
 */
@WebService
public interface UserService {
    @WebMethod
    User findById(int id);

    @WebMethod
    List<User> findAll();

    @WebMethod
    @XmlJavaTypeAdapter(MapUserAdapter.class) Map<Integer, User> findUserMap();

    @WebMethod
    User addUser(String name, int age);

}
