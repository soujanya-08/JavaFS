package com.wipro.flightpaymentms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.flightpaymentms.entity.Payment;
import com.wipro.flightpaymentms.service.PaymentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/flightpayment")
@Tag(name = "Flight Payment API", description = "Payment operations")
public class FlightPaymentController {
	@Autowired
    PaymentService service;
	
	@PostMapping
	@Operation(summary = "Add payment details")
	public Payment makePayment(@RequestBody Payment paymentRequest) {
	    System.out.println("Incoming booking request: " + paymentRequest);

	    if (paymentRequest.getBookingId() == null || paymentRequest.getBookingId().isEmpty()) {
	        throw new RuntimeException("Booking ID must be provided!");
	    }

	    if (paymentRequest.getAmount() == null || paymentRequest.getAmount() <= 0) {
	        throw new RuntimeException("Invalid payment amount!");
	    }

	    return service.processPayment(paymentRequest, paymentRequest.getAmount());
	}
	 
    @GetMapping("/{id}")
    @Operation(summary = "Get payment details by ID")
    public Payment get(@PathVariable Long id) {
        return service.getPayment(id);
    }
}