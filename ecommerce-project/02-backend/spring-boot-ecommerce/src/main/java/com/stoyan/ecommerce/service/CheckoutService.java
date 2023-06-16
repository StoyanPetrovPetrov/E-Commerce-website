package com.stoyan.ecommerce.service;

import com.stoyan.ecommerce.dto.PaymentInfo;
import com.stoyan.ecommerce.dto.Purchase;
import com.stoyan.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
