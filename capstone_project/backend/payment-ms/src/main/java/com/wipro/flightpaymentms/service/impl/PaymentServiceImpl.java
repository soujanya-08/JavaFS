package com.wipro.flightpaymentms.service.impl;
import com.wipro.flightpaymentms.entity.Payment;
import com.wipro.flightpaymentms.repo.PaymentRepository;
import com.wipro.flightpaymentms.service.PaymentService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
    PaymentRepository repo;

    @Override
    public Payment processPayment(Payment payment) {
        payment.setStatus("SUCCESS"); // mock rule for now
        return repo.save(payment);
    }

    @Override
    public Payment getPayment(Long id) {
        return repo.findById(id).orElseThrow();
    }
}