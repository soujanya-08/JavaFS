package com.wipro.bookingms.kafka;

import com.wipro.bookingms.dto.BookingEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class BookingProducer {
	@Autowired
    KafkaTemplate<String, BookingEvent> kafkaTemplate;

    public void sendBookingEvent(BookingEvent event) {
        kafkaTemplate.send("booking-topic", event);
    }
}