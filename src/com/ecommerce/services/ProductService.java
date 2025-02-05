/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.products.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class ProductService {
    private static List<Product> productList;
    private static ProductService productServiceInstance;
    
    private ProductService(){
        productList=new ArrayList<Product>();
    }
    
    private void restockProductInventory(){
        
    }
    
    
    
    
}
