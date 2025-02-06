/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.payments;

import com.ecommerce.products.Product;

/**
 *
 * @author The Bright
 */
public class CartItem {

    private String cartItemID;
    private Product product;
    private int quantity;

    public CartItem(String cartItemID, Product product, int quantity) {
        this.cartItemID = cartItemID;
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * @return the cartItemID
     */
    public String getCartItemID() {
        return cartItemID;
    }

    /**
     * @param cartItemID the cartItemID to set
     */
    public void setCartItemID(String cartItemID) {
        this.cartItemID = cartItemID;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product.getProductName() + ":" + product.getProductPrice() + ":" + quantity;
    }

}
