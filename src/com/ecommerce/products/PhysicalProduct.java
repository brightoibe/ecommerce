/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author The Bright
 */
public class PhysicalProduct extends Product {
    
    private int weight;
    private String color;
    
    public PhysicalProduct(String productID, String productName,double productPrice, List<Category> categoryList, int weight, String color) {
        super(productID, productName,productPrice,categoryList);
        this.weight=weight;
        this.color=color;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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


        return String.format("%s | %s | %s | %s | %s", productID, productName, formattedPrice, weight, color);
    }
}
