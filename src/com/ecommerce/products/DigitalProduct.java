/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.products;

/**
 *
 * @author The Bright
 */
public class DigitalProduct extends Product {
    private String licenseKey;
    private String downloadUrl;
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
    
    

    public DigitalProduct(String productID, String productName, String productCategory, double productPrice,String licenseKey, String downloadUrl) {
        super(productID, productName, productCategory, productPrice);
        this.licenseKey=licenseKey;
        this.downloadUrl=downloadUrl;
    }
    
    
    
}
