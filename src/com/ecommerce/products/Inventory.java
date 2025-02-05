/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

import java.time.LocalDate;

/**
 *
 * @author The Bright
 */
public class Inventory {
    
    private String inventoryID;
    private Product product;
    private int stockCount;
    private LocalDate restockDate;
    
    public Inventory(String inventoryID, Product product, int stockCount, LocalDate restockDate){
        this.inventoryID=inventoryID;
        this.product=product;
        this.stockCount=stockCount;
        this.restockDate=restockDate;
    }

    /**
     * @return the inventoryID
     */
    public String getInventoryID() {
        return inventoryID;
    }

    /**
     * @param inventoryID the inventoryID to set
     */
    public void setInventoryID(String inventoryID) {
        this.inventoryID = inventoryID;
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
     * @return the stockCount
     */
    public int getStockCount() {
        return stockCount;
    }

    /**
     * @param stockCount the stockCount to set
     */
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * @return the restockDate
     */
    public LocalDate getRestockDate() {
        return restockDate;
    }

    /**
     * @param restockDate the restockDate to set
     */
    public void setRestockDate(LocalDate restockDate) {
        this.restockDate = restockDate;
    }
    
}
