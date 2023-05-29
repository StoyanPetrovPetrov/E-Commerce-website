package com.stoyan.ecommerce.service;

import com.stoyan.ecommerce.dto.Purchase;
import com.stoyan.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
