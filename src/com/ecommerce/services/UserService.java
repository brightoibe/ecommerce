/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.users.Admin;
import com.ecommerce.exceptions.AuthenticationException;
import com.ecommerce.users.Customer;
import com.ecommerce.users.Role;
import com.ecommerce.users.Sellers;
import com.ecommerce.users.User;
import com.ecommerce.users.UserState;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class UserService {
    
    private static List<User> registeredUserList;
    
    private static final UserService userServiceInstance=new UserService();

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
        return userServiceInstance;
    }
    public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hashedPassword); // Or convert to hex if you prefer
        } catch (NoSuchAlgorithmException e) {
            // Handle the exception (e.g., log it, throw a custom exception)
            System.err.println("SHA-256 algorithm not available.");
            return null; // Or throw an exception
        }
    }
    public static boolean checkPassword(String password, String storedHash) {
        String hashedPassword = hashPassword(password);
        return hashedPassword != null && hashedPassword.equals(storedHash);
    }
    public static User registerUser(String userID, String userName, String password, String fullname, LocalDate dateOfBirth, String email, String role){
        User user=null;
        Role userRole=null;
        if(role.equalsIgnoreCase("ADMIN")){
            user=createAdmin(userID, userName, password, fullname, dateOfBirth, email);
            userRole=new Role(role,role);
            user.addRole(userRole);
        }else if(role.equalsIgnoreCase("CUSTOMER")){
            user=createCustomer(userID, userName, password, fullname, dateOfBirth, email);
            userRole=new Role(role,role);
            user.addRole(userRole);
        }else if(role.equals("SELLER")){
            user=createSeller(userID, userName, password, fullname, dateOfBirth, email);
            userRole=new Role(role,role);
            user.addRole(userRole);
        }
        if(user!=null){
            user.setUserState(UserState.ACTIVE);
            //user.setLoggedIn(true);
            registeredUserList.add(user);
            log("User registered "+user);
        }
        return user;
    }
    
    public static User createCustomer(String userID,String userName, String password, String fullname, LocalDate dateOfBirth, String email){
        return new Customer(userID, userName, hashPassword(password), fullname, dateOfBirth, email);
        
    }
    public static User createAdmin(String userID,String userName, String password, String fullname, LocalDate dateOfBirth, String email){
        return new Admin(userID, userName,hashPassword(password),fullname,dateOfBirth,email);
    }
    public static User createSeller(String userID,String userName, String password, String fullname, LocalDate dateOfBirth, String email){
        return new Sellers(userID, userName, hashPassword(password), fullname, dateOfBirth, email);
    }
    public static User loginUser(String username,String password) throws AuthenticationException{
        User searchUser=null;
        for(User user: registeredUserList){
            if(username.equalsIgnoreCase(user.getUserName()) && checkPassword(password, user.getPassword_hash())){
                searchUser=user;
                log("Login successfull for "+username);
                searchUser.setLoggedIn(true);
                return searchUser;
            }
        }
        if(searchUser==null){
            throw new AuthenticationException("Invalid username or password "+username);
            
        }
        return searchUser;
    }
    public static void logoutUser(User user){
        user.setLoggedIn(false);
        log("User logged out successfully "+user);
    }
    
    public static void resetPassword(User user, String newPassword){
        String newhash_password="";
        if(user.isLoggedIn()){
            newhash_password=hashPassword(newPassword);
            user.setPassword_hash(newhash_password);
            log("Password rest successfully please check your email "+ user);
        }else{
            log("User session has expired please login "+user);
        }
    }
    
    public static void log(String message){
        System.out.println(message);
    }
    public static User findUser(String username){
        User searchUser=null;
        
        for(User user: registeredUserList){
            if(username.equalsIgnoreCase(user.getUserName())){
                searchUser=user;
            }
        }
        return searchUser;
    }
    
    
    
    
    
    
   
    
}
