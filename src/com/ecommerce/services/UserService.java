/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.usermanagement.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class UserService {
    
    private static List<User> registeredUserList;
    
    private static UserService userServiceInstance;
    
    private UserService(){
        registeredUserList=new ArrayList<User>();
    }
    public static UserService getInstance() {
        if (userServiceInstance == null) {
            userServiceInstance = new UserService();
        }
        return userServiceInstance;
    }
    
}
