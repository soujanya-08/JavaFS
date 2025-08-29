package com.wipro.flightpaymentms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.flightpaymentms.entity.Payment;
import com.wipro.flightpaymentms.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
	@Autowired
    PaymentService service;

    @PostMapping
    public Payment pay(@RequestBody Payment payment) {
        return service.processPayment(payment);
    }

    @GetMapping("/{id}")
    public Payment get(@PathVariable Long id) {
        return service.getPayment(id);
    }
}