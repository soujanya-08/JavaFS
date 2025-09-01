package com.wipro.flightpaymentms.service.impl;
import com.wipro.flightpaymentms.dto.PaymentEvent;
import com.wipro.flightpaymentms.entity.Payment;
import com.wipro.flightpaymentms.repo.PaymentRepository;
import com.wipro.flightpaymentms.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
    PaymentRepository paymentRepo;
	
	@Autowired
	KafkaTemplate<String, PaymentEvent> kafkaTemplate;
	
		@Override
	    public Payment processPayment(Payment paymentRequest, double amountFromBooking) {
			paymentRequest.setAmount(amountFromBooking);
	        paymentRequest.setStatus("SUCCESS");

	        Payment saved = paymentRepo.save(paymentRequest);

	        PaymentEvent event = new PaymentEvent(
	                saved.getBookingId(),
	                saved.getAmount(),
	                saved.getStatus()
	        );
	        kafkaTemplate.send("payment-topic", event);

	        return saved;
	    }

    @Override
    public Payment getPayment(Long id) {
        return paymentRepo.findById(id).orElseThrow();
    }

}