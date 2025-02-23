/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.payments;

import com.ecommerce.products.Product;
import com.ecommerce.users.User;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author The Bright
 */
public class Wishlist {
    
    private String wishListID;
    private User user;
    private List<Product> productList;
    //create get and set methods for properties
    
    public Wishlist(String wishListID, User user){
        this.wishListID=wishListID;
        this.user=user;
        productList=new ArrayList<Product>();
    }
    
    public String getWishListID() {
        return wishListID;
    }
    
    public User getUser() {
        return user;
    }
    
    public List<Product> getProductList() {
        return productList;
    }
    
    public void addProduct(Product product){
        productList.add(product);
    }
    
    public void removeProduct(Product product){
        productList.remove(product);
    }
    
    public String toString() {
        return "Wishlist{" + "wishListID=" + wishListID + ", user=" + user + ", productList=" + productList + '}';
    }
    

    
}
