package com.wipro.bookingms.service.impl;
import com.wipro.bookingms.dto.BookingEvent;
import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.dto.PaymentEvent;
import com.wipro.bookingms.entity.BookFlight;
import com.wipro.bookingms.repo.BookFlightRepo;
import com.wipro.bookingms.service.BookingService;
import com.wipro.bookingms.service.FlightClient;
import com.wipro.bookingms.kafka.BookingProducer;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookFlightRepo bookFlightRepo;
	@Autowired
	FlightClient flightClient;

	@Autowired
	private BookingProducer bookingProducer;
	@Override
	public BookFlight createBooking(BookFlight booking) {
        booking.setBookingId(UUID.randomUUID().toString());
        booking.setStatus("PENDING");

        try {
        BookFlight saved = bookFlightRepo.save(booking);

        BookingEvent event = new BookingEvent(saved.getBookingId(), saved.getAmount(), saved.getStatus());
        bookingProducer.sendBookingEvent(event);

        return saved;
        
	} catch (Exception e) {
        throw new RuntimeException("Failed to save booking in DB: " + e.getMessage());
    }
    }
	
	
	@Override
    public BookFlight getBookingById(String id) {
        return bookFlightRepo.findByBookingId(id);    
    }
	
    @Override
    public BookFlight getBooking(Long id) {
        return bookFlightRepo.findById(id).orElseThrow();
    }
    @Override
    public List<FlightDTO> getAllFlights() {
        return flightClient.getAllFlights();
    }
}

