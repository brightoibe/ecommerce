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
    private static ProductService productServiceInstance;

    private ProductService() {
        productList = new ArrayList<Product>();
    }

    private void restockProductInventory() {
        productList.clear(); // Clear existing inventory before restocking
        Random random = new Random();

        // List of products with user-friendly IDs
        Product product1 = new Product("PRD101", "Dell XPS 13", 1200.00);
        product1.addProductCategory(Category.ELECTRONICS);
        
        Product product2 = new Product("PRD102", "Samsung Galaxy S23", 999.99);
        Product product3 = new Product("PRD103", "Sony WH-1000XM5", 349.99);
        Product product4 = new Product("PRD104", "Clean Code", 39.99);
        Product product5 = new Product("PRD105", "Nike Sportswear T-Shirt", 29.99);
        Product product6 = new Product("PRD106", "Keurig K-Elite", 149.99);
        Product product7 = new Product("PRD107", "Apple MacBook Air", 999.00);
        Product product8 = new Product("PRD108", "Bose QuietComfort 45", 299.99);
        Product product9 = new Product("PRD109", "Java: The Complete Reference", 49.99);
        Product product10 = new Product("PRD110", "Adidas Running Shoes", 89.99);
        Product product11 = new Product("PRD111", "Samsung 55-inch QLED TV", 899.99);
        Product product12 = new Product("PRD112", "Levi's Denim Jacket", 79.99);
        Product product13 = new Product("PRD113", "iPhone 14 Pro Max", 1099.99);
        Product product14 = new Product("PRD114", "Apple iPad Pro", 1199.00);
        Product product15 = new Product("PRD115", "Sony PlayStation 5", 499.99);
        Product product16 = new Product("PRD116", "Nintendo Switch OLED", 349.99);
        Product product17 = new Product("PRD117", "Samsung Galaxy Watch 6", 249.99);
        Product product18 = new Product("PRD118", "Amazon Kindle Paperwhite", 139.99);
        Product product19 = new Product("PRD119", "GoPro Hero 11", 399.99);
        Product product20 = new Product("PRD120", "DJI Mini 3 Pro Drone", 799.99);
        Product product21 = new Product("PRD121", "Canon EOS R5", 3799.00);
        Product product22 = new Product("PRD122", "Razer BlackWidow V4 Keyboard", 149.99);
        Product product23 = new Product("PRD123", "Logitech MX Master 3", 99.99);
        Product product24 = new Product("PRD124", "MSI Gaming Laptop", 1899.99);
        Product product25 = new Product("PRD125", "Beats Studio Buds", 149.99);
        Product product26 = new Product("PRD126", "JBL Flip 6 Bluetooth Speaker", 129.99);
        Product product27 = new Product("PRD127", "Instant Pot Duo 7-in-1", 99.99);
        Product product28 = new Product("PRD128", "Dyson V15 Detect Vacuum", 699.99);
        Product product29 = new Product("PRD129", "Microsoft Surface Laptop 5", 1299.99);
        Product product30 = new Product("PRD130", "Apple AirPods Pro 2", 249.99);

        // Create inventory with user-friendly IDs
        List<Product> products = Arrays.asList(
                product1, product2, product3, product4, product5, product6, product7, product8, product9, product10,
                product11, product12, product13, product14, product15, product16, product17, product18, product19, product20,
                product21, product22, product23, product24, product25, product26, product27, product28, product29, product30
        );

        for (Product product : products) {
            String inventoryID = "INV" + product.getProductID();
            int stockCount = random.nextInt(10) + 1; // Random stock between 1 and 10
            LocalDate restockDate = LocalDate.now();

            Inventory inventory = new Inventory(inventoryID, product, stockCount, restockDate);
            product.setInventory(inventory); // Assuming Product has a method to set Inventory
        }

        productList.addAll(products);
        System.out.println("Product inventory has been restocked with " + productList.size() + " products.");

    }

}
