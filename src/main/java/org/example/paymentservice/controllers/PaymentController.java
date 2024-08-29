package org.example.paymentservice.controllers;

import org.example.paymentservice.dtos.InitiatePaymentDTO;
import org.example.paymentservice.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDTO initiatePaymentDTO){
        return paymentService.initiatePayment(initiatePaymentDTO.getOrderId(),
                initiatePaymentDTO.getAmount(),
                initiatePaymentDTO.getEmail(),
                initiatePaymentDTO.getPhoneNumber());
    }
}
