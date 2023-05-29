package com.stoyan.ecommerce.dto;

import com.stoyan.ecommerce.entity.Address;
import com.stoyan.ecommerce.entity.Customer;
import com.stoyan.ecommerce.entity.Order;
import com.stoyan.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem>orderItems;
}
