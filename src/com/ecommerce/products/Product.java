/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class Product {
    
    
    protected String productID;
    protected String productName;
    protected String productCategory;
    protected double productPrice;
    protected String description;
    protected List<Review> reviews;
    protected Inventory inventory;
    protected List<Discount> discounts;
    
    
    public Product(String productID, String productName, String productCategory, double productPrice){
        this.productID=productID;
        this.productName=productName;
        this.productCategory=productCategory;
        this.productPrice=productPrice;
        reviews=new ArrayList<Review>();
        discounts=new ArrayList<Discount>();
        
    }
    

    /**
     * @return the productID
     */
    public String getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * @param productCategory the productCategory to set
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * @return the productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the reviews
     */
    public List<Review> getReviews() {
        return reviews;
    }

    /**
     * @param reviews the reviews to set
     */
    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the discounts
     */
    public List<Discount> getDiscount() {
        return discounts;
    }

    /**
     * @param discount the discounts to set
     */
    public void setDiscount(List<Discount> discount) {
        this.discounts = discount;
    }
    
    
    
}
