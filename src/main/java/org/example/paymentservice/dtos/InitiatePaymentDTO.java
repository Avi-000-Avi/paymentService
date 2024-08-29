package org.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDTO {
    private String email;
    private String phoneNumber;
    private Long amount;// Amount should come from order service but as we don't have order service we will take it as input
    private String orderId;
}
