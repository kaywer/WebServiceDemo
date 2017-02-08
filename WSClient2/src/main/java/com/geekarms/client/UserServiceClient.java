package com.geekarms.client;

import com.geekarms.ws.interfaces.UserService;
import com.geekarms.ws.service.UserServiceImplService;

/**
 * Created by kaywer on 2017/2/8.
 */
public class UserServiceClient {
    private static UserService service = null;

    private UserServiceClient(){}

    public static UserService getInstance(){
        if (service == null){
            synchronized (UserServiceClient.class){
                if (service == null){
                    UserServiceImplService implService = new UserServiceImplService();
                    service = implService.getUserServiceImplPort();
                }
            }
        }
        return service;
    }
}
