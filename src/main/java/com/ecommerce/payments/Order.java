/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.payments;

import com.ecommerce.products.Discount;
import com.ecommerce.users.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author The Bright
 */
public class Order {
    
    private String orderID;
    private User user;
    private List<OrderItem> itemList;
    private Discount discount;

    /**
     * @return the discount
     */
    public Discount getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    
    public Order(String orderID, User user,List<OrderItem> itemList){
        this.orderID=orderID;
        this.user=user;
        this.itemList=itemList;
        
    }

    public Order(String orderID, User user, Set<CartItem> cartItemsSet){
        this.orderID=orderID;
        this.user=user;
        itemList=new ArrayList<OrderItem>();
        for(CartItem cartItem:cartItemsSet){
            OrderItem orderItem=new OrderItem(cartItem.getCartItemID()+"ORDITM",this,cartItem.getProduct(),cartItem.getQuantity());
            itemList.add(orderItem);
        }
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

    public double getOrderTotalWithoutDiscount(){
        double total=0;
        for(OrderItem orderItem:itemList){
            total+=orderItem.getPrice();
        }
        return total;
    }
    public double applyDiscountTotal(Discount discount){
        double total=getOrderTotalWithoutDiscount();

        double discountAmount=total*(discount.getPercentage()/100);
        total-=discountAmount;
        return total;
    }
    
    
}
