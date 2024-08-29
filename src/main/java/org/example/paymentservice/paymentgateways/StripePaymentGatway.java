package org.example.paymentservice.paymentgateways;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentGatway implements PaymentGateway {

    @Override
    public String generatePaymentLink(String orderId, Long amount, String email, String phoneNumber) {
        return null;
    }
}
