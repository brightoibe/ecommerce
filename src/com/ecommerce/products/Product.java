/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author The Bright
 */
public class Product {
    
    
    protected String productID;
    protected String productName;
    protected Set<Category> productCategorys;
    protected double productPrice;
    protected String description;
    protected List<Review> reviews;
    protected Inventory inventory;
    protected List<Discount> discounts;
    
    
    public Product(String productID, String productName, double productPrice){
        this.productID=productID;
        this.productName=productName;
        this.productCategorys=new HashSet<Category>();
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
     * @return the productCategorys
     */
    public Set<Category> getProductCategory() {
        return productCategorys;
    }

    /**
     * @param productCategory add product to new Category
     */
    public void addProductCategory(Category productCategory) {
        this.productCategorys.add(productCategory);
    }
    
    /**
     * @param productCategory remove product from Category
     */
    
    public void removeProductCategory(Category productCategory) {
        this.productCategorys.remove(productCategory);
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID.equalsIgnoreCase(product.productID); // Case-insensitive comparison
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID.toLowerCase()); // Consistent with equals (case-insensitive)
    }
    @Override
    public String toString() {
        // Format price with dollar sign based on locale
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US); // You can use a different locale if needed
        String formattedPrice = currencyFormat.format(productPrice); // Format the price

       /* If using BigDecimal for price:
         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US); // You can use a different locale if needed
         String formattedPrice = currencyFormat.format(this.productPrice); // Format the price
        */


        return String.format("%s | %s | %s", productID, productName, formattedPrice);
    }
    
    
}
