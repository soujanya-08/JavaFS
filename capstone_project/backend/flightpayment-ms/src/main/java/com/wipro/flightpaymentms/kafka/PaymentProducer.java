package com.wipro.flightpaymentms.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.wipro.flightpaymentms.dto.PaymentEvent;

@Component
public class PaymentProducer {
	
	@Autowired
    KafkaTemplate<String, PaymentEvent> kafkaTemplate;

    public void sendPaymentEvent(PaymentEvent event) {
        kafkaTemplate.send("payment-topic", event);
        System.out.println("Payment Event sent: " + event);
    }
}

