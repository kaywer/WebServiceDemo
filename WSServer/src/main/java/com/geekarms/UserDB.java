package com.geekarms;

import com.geekarms.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kaywer on 2017/2/8.
 */
public class UserDB {
    public static AtomicInteger idCount = new AtomicInteger(0);

    public static List<User> list = new ArrayList<>();

    public static Integer generateId(){
        return idCount.addAndGet(1);
    }

}
