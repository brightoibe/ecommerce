/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerse.payments;

import com.ecommerce.products.Product;
import com.ecommerce.usermanagement.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class Cart {
    
    private String cartID;
    private User user;
    private List<CartItem> cartItemList;
    
    public Cart(String cartID, User user){
        this.cartID=cartID;
        this.user=user;
        cartItemList=new ArrayList<CartItem>();
    }

    /**
     * @return the cartID
     */
    public String getCartID() {
        return cartID;
    }

    /**
     * @param cartID the cartID to set
     */
    public void setCartID(String cartID) {
        this.cartID = cartID;
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
     * @return the cartItemList
     */
    public List<CartItem> getProductList() {
        return cartItemList;
    }

    /**
     * @param productList the cartItemList to set
     */
    public void setProductList(List<CartItem> productList) {
        this.cartItemList = productList;
    }
    
    public void addToCart(Product product, int quantity){
        
    }
    
    
    
}
