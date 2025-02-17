/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.users;

import java.time.LocalDate;

/**
 *
 * @author The Bright
 */
public class Admin extends User {
    private final static String PERMISSIONS="manage_user,manage_products,generate_reports";
    public Admin(String userID, String userName, String password_hash, String fullname, LocalDate dateOfBirth, String email) {
        super(userID, userName, password_hash, fullname, dateOfBirth, email);
    }
    private String getPermission(){
        return PERMISSIONS;
    }
    
}
