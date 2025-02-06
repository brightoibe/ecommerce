/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.payments.Cart;
import com.ecommerce.users.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class PaymentService {
    
    private final static List<Cart> CART_LIST=new ArrayList<>();
    
    private final static PaymentService INSTANCE=new PaymentService();
    
    private PaymentService(){
        
    }
    
    public static PaymentService getInstance() {
        return INSTANCE;
    }
    public Cart findOrCreateShoppingCart(User user){
        Cart crt=null;
        String cartID="CART"+user.getUserID();
        crt=findExistingCart(cartID);
        if(crt==null){
            crt=new Cart(cartID, user);
            CART_LIST.add(crt);
        }
        return crt;
    }
    
    public Cart findExistingCart(String cartID){
        Cart ct=null;
        for(Cart cart: CART_LIST){
            if(cart.getCartID().equalsIgnoreCase(cartID)){
                ct=cart;
            }
        }
        return ct;
    }
    
    
}
