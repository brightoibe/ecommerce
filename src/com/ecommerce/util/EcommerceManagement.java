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
import com.ecommerce.users.AuthenticationException;
import com.ecommerce.users.User;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class EcommerceManagement {

    public static void main(String[] arg) {
        UserService userService = UserService.getInstance();
        ProductService productService = ProductService.getInstance();

        //Registering an ADMIN User
        User adminUser = userService.registerUser("USR101", "johndoe", "123456", "John Doe", LocalDate.now(), "johndoe@yahoo.com", "ADMIN");
        User customerUser = userService.registerUser("USR102", "davidmike", "67890", "David Mike", LocalDate.now(), "davidmike@yahoo.com", "CUSTOMER");
        User sellerUser = userService.registerUser("USR103", "donpedro", "14151A*400", "Don Pedro", LocalDate.now(), "brightoibe@yahoo.com", "SELLER");

        //Customer David Mike login workflow
        User logedInUser;
        try {
           logedInUser=userService.loginUser("davidmike", "67890");
        } catch (AuthenticationException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Customer David Mike changes his password
        userService.resetPassword(customerUser,"Pass1word");
        
        
        //Customer David Mike attempts to login with old password
        try {
           logedInUser=userService.loginUser("davidmike", "67890");
        } catch (AuthenticationException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Customer David Mike attempts to login with new password
        try {
           logedInUser=userService.loginUser("davidmike", "Pass1word");
        } catch (AuthenticationException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Display all products in the Ecommerce shop
        productService.showProducts();
        
        List<Product> searchResults;
        
        //Display only SPORTS accessories
        //searchResults=productService.findProducts(Category.SPORTS);
        //productService.showProducts(searchResults);
        
        
        
        
        
    }
}
