package com.wipro.bookingms.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.bookingms.dto.BookingEvent;
import com.wipro.bookingms.dto.PaymentEvent;
import com.wipro.bookingms.entity.BookFlight;
import com.wipro.bookingms.repo.BookFlightRepo;

@Component
public class BookingConsumer {

	 @Autowired
	 BookFlightRepo bookFlightRepo;
	    @KafkaListener(topics = "payment-topic", groupId = "booking-group")
	    public void consumePaymentEvent(PaymentEvent event) {
	        System.out.println("Received payment update in BookingMS: " + event);

	        BookFlight booking = bookFlightRepo.findByBookingId(event.getBookingId());

	        if (booking != null) {
	            booking.setStatus(event.getStatus());
	            bookFlightRepo.save(booking);
	            System.out.println("Booking updated with payment status: " + booking);
	        } else {
	            System.err.println("Booking not found for ID: " + event.getBookingId());
	        }
	    }
	    @KafkaListener(topics = "payment-topic", groupId = "booking-group")
		public void updateBookingStatus(PaymentEvent event) {
		    bookFlightRepo.findAll().stream()
		            .filter(b -> b.getBookingId().equals(event.getBookingId()))
		            .findFirst()
		            .ifPresent(b -> {
		                b.setStatus(event.getStatus());
		                bookFlightRepo.save(b);
		                System.out.println("Booking updated with payment status: " + b);
		            });
		}
}