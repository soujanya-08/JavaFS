package com.wipro.flightpaymentms.service;

import com.wipro.flightpaymentms.entity.Payment;

public interface PaymentService {
    Payment processPayment(Payment payment);
    Payment getPayment(Long id);
}