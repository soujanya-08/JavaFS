package com.wipro.flightpaymentms.service;

import com.wipro.flightpaymentms.entity.Payment;

public interface PaymentService {
    Payment getPayment(Long id);
    Payment processPayment(Payment paymentRequest, double amountFromBooking);
    
}