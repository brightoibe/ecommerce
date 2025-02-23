/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.util;

import com.ecommerce.products.Category;
import com.ecommerce.products.Product;
import com.ecommerce.services.ProductService;
import com.ecommerce.services.UserService;
import static com.ecommerce.services.UserService.checkPassword;
import com.ecommerce.users.AuthenticationException;
import com.ecommerce.users.User;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The Bright
 */
public class Test {
    public static void main(String[] arg){
       //UserService userService=UserService.getInstance();
       //User user1=userService.registerUser("101", "brightoibe3", "123456", "Bright Ibezim", LocalDate.now(), "brightoibe@yahoo.com", "ADMIN");
       //User user2=userService.registerUser("101", "brightoibe", "67890", "Don Pedro", LocalDate.now(), "donpedro@yahoo.com", "CUSTOMER");
       //User user2=userService.registerUser("102", "brightoibe", "123456", "Bright Ibezim", LocalDate.now(), "brightoibe@yahoo.com", "ADMIN");
       //UserService.resetPassword(user2, "333333");
       //System.out.println(checkPassword(UserService.hashPassword("123456"), user2.getPassword_hash()));
        /*try {
            System.out.println(userService.loginUser("brightoibe", "123456"));
            UserService.resetPassword(user2, "333333");
            System.out.println(UserService.loginUser("brightoibe", "123456"));
            //userService.log("output"+checkPassword(UserService.hashPassword("123456"), user2.getPassword_hash()));
        } catch (AuthenticationException ex) {
            UserService.log(ex.getMessage());
       }*/
        
        ProductService productService=ProductService.getInstance();
        List<Product> searchResult=productService.findProducts(Category.SOFTWARE);
        productService.showProducts(searchResult);
       
    }
}
