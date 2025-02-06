/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.payments;

import com.ecommerce.products.Product;
import com.ecommerce.users.User;
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
        CartItem cartItem=findOrCreateCartItem(product, quantity);
        cartItem.setQuantity(cartItem.getQuantity()+quantity);
     }
     
     public void removeFromCart(Product product, int quantity){
         CartItem cartItem=findOrCreateCartItem(product, quantity);
         if(cartItem.getQuantity()>0 && cartItem.getQuantity()>quantity){
             cartItem.setQuantity(cartItem.getQuantity()-quantity);
         }else{
             return;
         }
         
     }
     
     private CartItem createCartItem(Product product, int quantity){
         CartItem item=new CartItem("CRTITM"+this.getCartID(),product, quantity);
         cartItemList.add(item);
         return item;
         
     }
     public CartItem findOrCreateCartItem(Product product, int quantity){
         CartItem cartItem=null;
         for(CartItem item: cartItemList){
             if(item.getProduct().equals(product)){
                 cartItem=item;
             }
         }
         if(cartItem==null){
             cartItem=createCartItem(product, quantity);
         }
         return cartItem;
     }
     
     public double getTotalPrice(){
         double totalPrice=0;
         double productTotalPrice=0;
         for(CartItem item: cartItemList){
             productTotalPrice=item.getProduct().getProductPrice()*item.getQuantity();
             totalPrice+=productTotalPrice;
         }
         return totalPrice;
     }
     
    
    
    
    
    
}
