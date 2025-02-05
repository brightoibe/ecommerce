/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerse.payments;

import com.ecommerce.usermanagement.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class Order {
    
    private String orderID;
    private User user;
    private List<OrderItem> itemList;
    
    public Order(String orderID, User user){
        this.orderID=orderID;
        this.user=user;
        itemList=new ArrayList<OrderItem>();
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the itemList
     */
    public List<OrderItem> getItemList() {
        return itemList;
    }

    /**
     * @param itemList the itemList to set
     */
    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
    }
    
    
}
