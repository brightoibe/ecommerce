/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.products.Category;
import com.ecommerce.products.Inventory;
import com.ecommerce.products.Product;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author The Bright
 */
public class ProductService {

    private static List<Product> productList;
    private static final ProductService INSTANCE=new ProductService();

    private ProductService() {
        productList = new ArrayList<Product>();
        restockProductInventory();
    }
    public static ProductService getInstance() {
        return INSTANCE;
    }
    private void restockProductInventory() {
        productList.clear(); // Clear existing inventory before restocking
        Random random = new Random();

        // List of products with user-friendly IDs
        Product product1 = new Product("PRD101", "Dell XPS 13", 1200.00, Arrays.asList(Category.ELECTRONICS));
        Product product2 = new Product("PRD102", "Samsung Galaxy S23", 999.99, Arrays.asList(Category.ELECTRONICS));
        Product product3 = new Product("PRD103", "Sony WH-1000XM5", 349.99, Arrays.asList(Category.ELECTRONICS));
        Product product4 = new Product("PRD104", "Clean Code", 39.99, Arrays.asList(Category.BOOKS));
        Product product5 = new Product("PRD105", "Nike Sportswear T-Shirt", 29.99, Arrays.asList(Category.CLOTHING));
        Product product6 = new Product("PRD106", "Wireless Mouse", 30.0, Arrays.asList(Category.ELECTRONICS, Category.ACCESSORIES));
        Product product7 = new Product("PRD107", "Sony Headphones", 80.0, Arrays.asList(Category.ELECTRONICS, Category.AUDIO));
        Product product8 = new Product("PRD108", "Apple Smartwatch", 200.0, Arrays.asList(Category.ELECTRONICS, Category.WEARABLES));
        Product product9 = new Product("PRD109", "HP Laser Printer", 180.0, Arrays.asList(Category.ELECTRONICS, Category.OFFICE_SUPPLIES));
        Product product10 = new Product("PRD110", "TP-Link Router", 100.0, Arrays.asList(Category.ELECTRONICS, Category.NETWORKING));
        Product product11 = new Product("PRD111", "Seagate External Hard Drive", 120.0, Arrays.asList(Category.ELECTRONICS, Category.STORAGE));
        Product product12 = new Product("PRD112", "SanDisk Flash Drive", 20.0, Arrays.asList(Category.ELECTRONICS, Category.STORAGE));
        Product product13 = new Product("PRD113", "Logitech Webcam", 90.0, Arrays.asList(Category.ELECTRONICS, Category.ACCESSORIES));
        Product product14 = new Product("PRD114", "Rode Microphone", 110.0, Arrays.asList(Category.AUDIO, Category.ACCESSORIES));
        Product product15 = new Product("PRD115", "JBL Speakers", 70.0, Arrays.asList(Category.AUDIO));
        Product product16 = new Product("PRD116", "Xbox Game Controller", 60.0, Arrays.asList(Category.GAMING, Category.ACCESSORIES));
        Product product17 = new Product("PRD117", "Anker Power Bank", 40.0, Arrays.asList(Category.ELECTRONICS, Category.ACCESSORIES));
        Product product18 = new Product("PRD118", "Epson Projector", 300.0, Arrays.asList(Category.OFFICE_SUPPLIES, Category.ELECTRONICS));
        Product product19 = new Product("PRD119", "Canon Scanner", 220.0, Arrays.asList(Category.OFFICE_SUPPLIES, Category.ELECTRONICS));
        Product product20 = new Product("PRD120", "Wacom Graphic Tablet", 150.0, Arrays.asList(Category.ELECTRONICS, Category.ART_SUPPLIES));
        Product product21 = new Product("PRD121", "Samsung Smart TV", 400.0, Arrays.asList(Category.ELECTRONICS, Category.HOME_APPLIANCES));
        Product product22 = new Product("PRD122", "Oculus VR Headset", 350.0, Arrays.asList(Category.GAMING, Category.ELECTRONICS));
        Product product23 = new Product("PRD123", "DJI Drone", 500.0, Arrays.asList(Category.ELECTRONICS, Category.GADGETS));
        Product product24 = new Product("PRD124", "Philips Smart Light", 50.0, Arrays.asList(Category.HOME_APPLIANCES, Category.SMART_HOME));
        Product product25 = new Product("PRD125", "Yale Smart Lock", 120.0, Arrays.asList(Category.SMART_HOME, Category.HOME_SECURITY));
        Product product26 = new Product("PRD126", "Fitbit Fitness Tracker", 100.0, Arrays.asList(Category.ELECTRONICS, Category.WEARABLES));
        Product product27 = new Product("PRD127", "Hikvision CCTV Camera", 250.0, Arrays.asList(Category.HOME_SECURITY, Category.ELECTRONICS));
        Product product28 = new Product("PRD128", "Nest Smart Thermostat", 200.0, Arrays.asList(Category.SMART_HOME, Category.HOME_APPLIANCES));
        Product product29 = new Product("PRD129", "Anker Wireless Charger", 30.0, Arrays.asList(Category.ELECTRONICS, Category.ACCESSORIES));
        Product product30 = new Product("PRD130", "Xiaomi Electric Scooter", 800.0, Arrays.asList(Category.ELECTRONICS, Category.TRANSPORT));

        // Create inventory with user-friendly IDs
        List<Product> products = Arrays.asList(
                product1, product2, product3, product4, product5, product6, product7, product8, product9, product10,
                product11, product12, product13, product14, product15, product16, product17, product18, product19, product20,
                product21, product22, product23, product24, product25, product26, product27, product28, product29, product30
        );

        for (Product product : products) {
            product.restockInventory(random.nextInt(10) + 1, LocalDate.now());

        }

        productList.addAll(products);
        System.out.println("Product inventory has been restocked with " + productList.size() + " products.");

    }

}
