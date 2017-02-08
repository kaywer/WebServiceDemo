package com.geekarms.ws.service;

import com.geekarms.UserDB;
import com.geekarms.adapter.MapUserAdapter;
import com.geekarms.entity.User;
import com.geekarms.ws.interfaces.UserService;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by kaywer on 2017/2/8.
 */
@WebService
public class UserServiceImpl implements UserService{
    public User findById(int i) {
        Optional<User> userOptional = UserDB.list.stream().filter(user -> user.getId() == i).findFirst();
        if (userOptional.isPresent()){
            return userOptional.get();
        }
        return null;
    }

    public List<User> findAll() {
        return UserDB.list;
    }

    public @XmlJavaTypeAdapter(MapUserAdapter.class) Map<Integer, User> findUserMap() {
        return UserDB.list.stream().collect(Collectors.toMap(User::getId, Function.identity()));
    }

    public User addUser(String s, int age) {
        User user = new User(UserDB.generateId(), s, age);
        UserDB.list.add(user);
        return user;
    }

}
