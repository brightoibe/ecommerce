/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerse.payments;

import com.ecommerce.usermanagement.User;
import java.util.List;

/**
 *
 * @author The Bright
 */
public class Order {
    private String orderID;
    private User user;
    private List<OrderItem> itemList;
    
}
