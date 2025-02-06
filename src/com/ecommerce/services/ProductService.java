/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.services;

import com.ecommerce.products.Category;
import com.ecommerce.products.DigitalProduct;
import com.ecommerce.products.PhysicalProduct;
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

        // Instanciate 20 Physical Products
        Product product1=new PhysicalProduct("PRD101", "Dell XPS 13", 1200.00, Arrays.asList(Category.ELECTRONICS), 5, "Black");
        Product product2=new PhysicalProduct("PRD102", "HP Spectre x360", 1100.00, Arrays.asList(Category.ELECTRONICS), 4, "Silver");
        Product product3=new PhysicalProduct("PRD103", "Lenovo ThinkPad X1 Carbon", 1300.00, Arrays.asList(Category.ELECTRONICS), 5, "Black");
        Product product4=new PhysicalProduct("PRD104", "MacBook Air M2", 1000.00, Arrays.asList(Category.ELECTRONICS), 4, "Space Gray");
        Product product5=new PhysicalProduct("PRD105", "Samsung Galaxy S23", 900.00, Arrays.asList(Category.ELECTRONICS), 2, "Phantom Black");
        Product product6=new PhysicalProduct("PRD106", "iPhone 14 Pro", 1100.00, Arrays.asList(Category.ELECTRONICS), 2, "Deep Purple");
        Product product7=new PhysicalProduct("PRD107", "Google Pixel 7", 700.00, Arrays.asList(Category.ELECTRONICS), 2, "Obsidian");
        Product product8=new PhysicalProduct("PRD108", "Sony WH-1000XM5 Headphones", 350.00, Arrays.asList(Category.ELECTRONICS), 1, "Black");
        Product product9=new PhysicalProduct("PRD109", "Bose QuietComfort 45 Headphones", 300.00, Arrays.asList(Category.ELECTRONICS), 1, "Black");
        Product product10=new PhysicalProduct("PRD110", "Apple Watch Series 8", 400.00, Arrays.asList(Category.ELECTRONICS), 1, "Midnight");
        Product product11=new PhysicalProduct("PRD111", "Nike Running Shoes", 100.00, Arrays.asList(Category.SPORTS), 2, "Black/White");
        Product product12=new PhysicalProduct("PRD112", "Adidas Soccer Ball", 30.00, Arrays.asList(Category.SPORTS), 1, "White/Black");
        Product product13=new PhysicalProduct("PRD113", "Wilson Tennis Racket", 150.00, Arrays.asList(Category.SPORTS), 1, "Black/Red");
        Product product14=new PhysicalProduct("PRD114", "Yoga Mat", 25.00, Arrays.asList(Category.SPORTS), 1, "Purple");
        Product product15=new PhysicalProduct("PRD115", "Dumbbell Set (10kg)", 80.00, Arrays.asList(Category.SPORTS), 2, "Black");
        Product product16=new PhysicalProduct("PRD116", "Levi's Jeans", 80.00, Arrays.asList(Category.FASHION), 2, "Blue");
        Product product17=new PhysicalProduct("PRD117", "Calvin Klein T-Shirt", 40.00, Arrays.asList(Category.FASHION), 1, "White");
        Product product18=new PhysicalProduct("PRD118", "Gucci Handbag", 2000.00, Arrays.asList(Category.FASHION), 1, "Brown");
        Product product19=new PhysicalProduct("PRD119", "Rolex Watch", 5000.00, Arrays.asList(Category.FASHION), 1, "Gold");
        Product product20=new PhysicalProduct("PRD120", "Ray-Ban Sunglasses", 150.00, Arrays.asList(Category.FASHION), 1, "Black");
        // Instaciate 10 DigitalProducts
        Product product21=new DigitalProduct("PRD107", "Microsoft Office 365", 149.99, Arrays.asList(Category.SOFTWARE), "OFF365-KEY", "https://microsoft.com/download");
        Product product22=new DigitalProduct("PRD108", "Adobe Creative Cloud", 59.99, Arrays.asList(Category.SOFTWARE), "ADOBE-KEY", "https://adobe.com/download");
        Product product23=new DigitalProduct("PRD109", "Grammarly Premium", 12.99, Arrays.asList(Category.SOFTWARE), "GRAM-KEY", "https://grammarly.com/download");
        Product product24=new DigitalProduct("PRD110", "Zoom Pro", 14.99, Arrays.asList(Category.SOFTWARE), "ZOOM-KEY", "https://zoom.us/download");
        Product product25=new DigitalProduct("PRD111", "NordVPN", 5.99, Arrays.asList(Category.SOFTWARE), "NORD-KEY", "https://nordvpn.com/download");
        Product product26=new DigitalProduct("PRD112", "Spotify Premium", 9.99, Arrays.asList(Category.SOFTWARE), "SPOT-KEY", "https://spotify.com/download");
        Product product27=new DigitalProduct("PRD113", "Netflix Premium", 15.99, Arrays.asList(Category.SOFTWARE), "NFLX-KEY", "https://netflix.com/download");
        Product product28=new DigitalProduct("PRD114", "Kindle Unlimited", 9.99, Arrays.asList(Category.SOFTWARE), "KIND-KEY", "https://amazon.com/kindle");
        Product product29=new DigitalProduct("PRD115", "Skillshare Premium", 19.99, Arrays.asList(Category.SOFTWARE), "SKIL-KEY", "https://skillshare.com/download");
        Product product30=new DigitalProduct("PRD116", "Masterclass Subscription", 14.99, Arrays.asList(Category.SOFTWARE), "MSTR-KEY", "https://masterclass.com/download");


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
