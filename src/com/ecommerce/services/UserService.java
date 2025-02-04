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

    /**
     * @return the registeredUserList
     */
    public static List<User> getRegisteredUserList() {
        return registeredUserList;
    }

    /**
     * @param aRegisteredUserList the registeredUserList to set
     */
    public static void setRegisteredUserList(List<User> aRegisteredUserList) {
        registeredUserList = aRegisteredUserList;
    }
    
    private static List<User> registeredUserList;
    
    private static UserService userServiceInstance;
    
    /*Made the constructor private so a UserService cannot be instanciated from outside
    the class.
    */
    
    private UserService(){
        registeredUserList=new ArrayList<User>();
    }
    /*
       This method ensures that only one instance of this class can exist
       at a time
    */
    public static UserService getInstance() {
        if (userServiceInstance == null) {
            userServiceInstance = new UserService();
        }
        return userServiceInstance;
    }
    
}
