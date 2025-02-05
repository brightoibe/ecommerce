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
public class Discount {
    
    private String discountId;
    private String discountName;
    private double percentage;
    private LocalDate startDate;
    private LocalDate endDate;
    
    public Discount(String discountId, String discountName, double percentage, LocalDate startDate, LocalDate endDate){
        this.discountId=discountId;
        this.discountName=discountName;
        this.percentage=percentage;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    /**
     * @return the discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    /**
     * @param discountId the discountId to set
     */
    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    /**
     * @return the discountName
     */
    public String getDiscountName() {
        return discountName;
    }

    /**
     * @param discountName the discountName to set
     */
    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    /**
     * @return the startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
}
