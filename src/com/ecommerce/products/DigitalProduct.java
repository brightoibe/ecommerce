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
public class DigitalProduct extends Product {
    private String licenseKey;
    private String downloadUrl;
    
     public DigitalProduct(String productID, String productName, double productPrice,List<Category> categoryList, String licenseKey, String downloadUrl) {
        super(productID, productName, productPrice,categoryList);
        this.licenseKey=licenseKey;
        this.downloadUrl=downloadUrl;
    }
    
    /**
     * @return the licenseKey
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * @param licenseKey the licenseKey to set
     */
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    /**
     * @return the downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * @param downloadUrl the downloadUrl to set
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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


        return String.format("%s | %s | %s", productID, productName, formattedPrice,licenseKey,downloadUrl);
    }

   
    
    
}
