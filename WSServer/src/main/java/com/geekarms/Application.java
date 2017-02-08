package com.geekarms;


import com.geekarms.ws.service.UserServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by kaywer on 2017/2/8.
 */
public class Application {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:9000/ws/user", new UserServiceImpl());
        System.out.println("WebService Started..");
    }
}
