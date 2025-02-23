/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ecommerce.util;

import com.ecommerce.exceptions.AuthenticationException;
import com.ecommerce.payments.Cart;
import com.ecommerce.products.Product;
import com.ecommerce.services.PaymentService;
import com.ecommerce.services.ProductService;
import com.ecommerce.services.UserService;
import com.ecommerce.users.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class EcommerceManagementTest {

    private UserService userService;
    private ProductService productService;
    private PaymentService paymentService;
    private User customerUser;

    @BeforeEach
    public void setUp() {
        userService = UserService.getInstance();
        productService = ProductService.getInstance();
        paymentService = PaymentService.getInstance();

        customerUser = UserService.registerUser("USR102", "davidmike", "67890", "David Mike", LocalDate.now(), "davidmike@yahoo.com", "CUSTOMER");
    }

    @Test
    public void testAddToCart() {
        Cart cart = paymentService.findOrCreateShoppingCart(customerUser);
        Product product = productService.getProduct("PRD101");
        cart.addToCart(product, 2);

        assertEquals(2, cart.getQuantity(product));
    }

    @Test
    public void testRemoveFromCart() {
        Cart cart = paymentService.findOrCreateShoppingCart(customerUser);
        Product product = productService.getProduct("PRD111");
        cart.addToCart(product, 5);
        cart.removeFromCart(product, 2);

        assertEquals(3, cart.getQuantity(product));
    }

    @Test
    public void testLoginUser() {
        try {
            User loggedInUser = UserService.loginUser("davidmike", "67890");
            assertNotNull(loggedInUser);
        } catch (AuthenticationException e) {
            fail("Login failed: " + e.getMessage());
        }
    }
}
