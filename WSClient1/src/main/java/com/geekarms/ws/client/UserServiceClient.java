package com.geekarms.ws.client;

import com.geekarms.interfaces.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

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
                    JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
                    svr.setServiceClass(UserService.class);
                    svr.setAddress("http://localhost:9000/ws/user");
                    service = (UserService) svr.create();
                }
            }
        }
        return service;
    }


}
