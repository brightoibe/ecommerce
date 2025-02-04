/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.usermanagement;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author The Bright
 */
public abstract class User {
    protected String userID;
    private String userName;
    protected String password_hash;
    protected String fullName;
    protected String gender;
    protected LocalDate dateOfBirth;
    protected String email;
    protected UserState userState;
    protected List<Role> roleList;
    protected List<Address> addressList;
    
    public User(String userID,String username, String pass, String fullname, LocalDate dateOfBirth, String email){
        this.userID=userID;
        
    }
    
    public User(String userID,String username, String pass, String fullname){
        this(userID,username,pass,fullname, null,null);
    }
    
    

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the password_hash
     */
    public String getPassword_hash() {
        return password_hash;
    }

    /**
     * @param password_hash the password_hash to set
     */
    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfBirth
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the userState
     */
    public UserState getUserState() {
        return userState;
    }

    /**
     * @param userState the userState to set
     */
    public void setUserState(UserState userState) {
        this.userState = userState;
    }
    
    
}
