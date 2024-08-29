package org.example.paymentservice.services;

import org.example.paymentservice.paymentgateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String orderId,Long amount,String email, String phoneNumber) {
        //Order order  = orderService.getOrderDetails(orderId);
        //Order service is a different microservice
        //How to communicate wiht microservice - Via resttemplate will make a rest call to order service microservice via api
        //Long amount = 10000

        return paymentGateway.generatePaymentLink(orderId,amount,email,phoneNumber);
    }
}
