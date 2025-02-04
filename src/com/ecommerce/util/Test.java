/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.util;

import com.ecommerce.services.UserService;
import com.ecommerce.usermanagement.User;
import java.time.LocalDate;

/**
 *
 * @author The Bright
 */
public class Test {
    public static void main(String[] arg){
       UserService userService=UserService.getInstance();
       User user1=userService.registerUser("101", "brightoibe3", "123456", "Bright Ibezim", LocalDate.now(), "brightoibe@yahoo.com", "ADMIN");
       //User user2=userService.registerUser("101", "brightoibe", "67890", "Don Pedro", LocalDate.now(), "donpedro@yahoo.com", "CUSTOMER");
       User user2=userService.registerUser("102", "brightoibe", "123456", "Bright Ibezim", LocalDate.now(), "brightoibe@yahoo.com", "ADMIN");
       System.out.println(user1.equals(user2));
       
    }
}
