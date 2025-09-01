package com.wipro.flightpaymentms.kafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;import com.wipro.flightpaymentms.dto.BookingEvent;

import java.util.concurrent.ConcurrentHashMap;

//@Component
public class PaymentConsumer {

//    public static final ConcurrentHashMap<String, Double> bookingAmountMap = new ConcurrentHashMap<>();
//
//    @KafkaListener(topics = "booking-topic", groupId = "payment-group")
//    public void consumeBookingEvent(BookingEvent event) {
//        System.out.println("Received booking event: " + event);
//        bookingAmountMap.put(event.getBookingId(), event.getAmount());
//    }
    
}