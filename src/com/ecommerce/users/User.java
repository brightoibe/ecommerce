/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author The Bright
 */
public class User {
    
    protected String userID;
    protected String userName;
    protected String password_hash;
    protected String fullName;
    protected String gender;
    protected LocalDate dateOfBirth;
    protected String email;
    protected UserState userState;
    protected List<Role> roleList;
    protected List<Address> addressList;
    protected boolean loggedIn=false;

    /**
     * @return the loggedIn
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * @param loggedIn the loggedIn to set
     */
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the roleList
     */
    public List<Role> getRoleList() {
        return roleList;
    }

    /**
     * @param roleList the roleList to set
     */
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    /**
     * @return the addressList
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /**
     * @param addressList the addressList to set
     */
    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
    
    
    public User(String userID,String userName, String password_hash, String fullname, LocalDate dateOfBirth, String email){
        this.userID=userID;
        this.userName=userName;
        this.password_hash=password_hash;
        this.fullName=fullname;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
        roleList=new ArrayList<Role>();
        addressList=new ArrayList<Address>();
        
        
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;

        // Case-insensitive comparison for username, email, or userID
        return (this.getUserName() != null && this.getUserName().equalsIgnoreCase(other.getUserName())) ||
               (email != null && email.equalsIgnoreCase(other.email)) ||
               (userID != null && userID.equalsIgnoreCase(other.userID));
    }
     @Override
    public int hashCode() {
        // Important: If you override equals(), you MUST override hashCode()
        // A simple implementation is usually sufficient:
        //int hash=0;
        //if(em !=)
        return Objects.hash(getUserName() != null ? getUserName().toLowerCase() : null,
                           email != null ? email.toLowerCase() : null,
                           userID != null ? userID.toLowerCase() : null);


        // Or a slightly more robust but slightly more complex version (prime number usage):
        // int result = 17;
        // result = 31 * result + (username == null ? 0 : username.toLowerCase().hashCode());
        // result = 31 * result + (email == null ? 0 : email.toLowerCase().hashCode());
        // result = 31 * result + (userID == null ? 0 : userID.toLowerCase().hashCode());
        // return result;
    }
    
    public void addRole(Role role){
        this.getRoleList().add(role);
    }
    public void removeRole(Role role){
        this.getRoleList().remove(role);
    }
    public void addAddress(Address address){
        this.getAddressList().add(address);
    }
    public void removeAddress(Address address){
        this.getAddressList().remove(address);
    }
    
    @Override
    public String toString() {
        return userName + ": " + fullName;
    }
    
    
}
