/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.payments;

import com.ecommerce.products.Product;
import com.ecommerce.users.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author The Bright
 */
public class Cart {
    
    private String cartID;
    private User user;
    private Set<CartItem> cartItemSet; 
    
    public Cart(String cartID, User user){
        this.cartID=cartID;
        this.user=user;
        cartItemSet = new HashSet<CartItem>();
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
    public Set<CartItem> getCartItemSet() {
        return cartItemSet;
    }

    /**
     * @param productList the cartItemList to set
     */
    public void setCartItemSet(Set<CartItem> productSet) {
        this.cartItemSet = productSet;
    }
    
     public void addToCart(Product product, int quantity){
            CartItem cartItem=getCartItem(product);
            if(cartItem==null){
                cartItem=createCartItem(product, quantity);
                cartItemSet.add(cartItem);
            }else{
                cartItem.setQuantity(cartItem.getQuantity()+quantity);
            }

            System.out.println("Cart Item added: "+cartItem);
     }
     
     public void removeFromCart(Product product, int quantity){
         CartItem cartItem=findOrCreateCartItem(product, quantity);
         if(cartItem.getQuantity()>0 && cartItem.getQuantity()>=quantity){
             cartItem.setQuantity(cartItem.getQuantity()-quantity);
         }else{
             return;
         }
            System.out.println("Cart Item removed: "+cartItem);
         
     }
     
     private CartItem createCartItem(Product product, int quantity){
         CartItem item=new CartItem("CRTITM"+product.getProductID(),product, quantity);
         cartItemSet.add(item);
         return item;
         
     }

public CartItem getCartItem(Product product){
         CartItem cartItem=null;
         for(CartItem item: cartItemSet){
             if(item.getProduct().getProductID().equalsIgnoreCase(product.getProductID())){
                 cartItem=item;
             }
         }
         return cartItem;
     }


     public CartItem findOrCreateCartItem(Product product, int quantity){
         //check if cart item already exists for the product
         //if not, create a new cart item and add it to the cartItemList
         //if yes, increment the quantity of the existing cart item by the quantity parameter
         //return the existing cart item or newly created cart item
         //return the cart item with updated quantity or newly created cart item if it doesn't exist in the cartItemList
         //Note: the productID is used to find the cart item in the cartItemList. The product ID is case insensitive.
         
         //find or create cart item based on product ID and quantity

         CartItem cartItem=null;
            for(CartItem item: cartItemSet){
                if(item.getProduct().getProductID().equalsIgnoreCase(product.getProductID())){
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
         for(CartItem item: cartItemSet){
             productTotalPrice=item.getProduct().getProductPrice()*item.getQuantity();
             totalPrice+=productTotalPrice;
         }
         //format totalPrice to 2 decimal places double
         totalPrice = Double.parseDouble(String.format("%.2f", totalPrice));
         
         return totalPrice;
     }


          @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart{");
        sb.append("cartID='").append(cartID).append('\'');
        sb.append(", user=").append(user.getUserName());
        sb.append(", cartItems=\n");
        sb.append("Cart Items:\n");
        for (CartItem item : cartItemSet) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public double getQuantity(Product product){
        double quantity=0;
        for(CartItem item: cartItemSet){
            if(item.getProduct().getProductID().equalsIgnoreCase(product.getProductID())){
                quantity=item.getQuantity();
            }
        }
        return quantity;
    }
     
    
    
    
    
    
}
