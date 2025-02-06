/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

import java.util.List;

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
}
