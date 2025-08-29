package com.wipro.bookingms.service.impl;
import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.entity.BookFlight;
import com.wipro.bookingms.repo.BookFlightRepo;
import com.wipro.bookingms.service.BookingService;
import com.wipro.bookingms.service.FlightClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookFlightRepo bookFlightRepo;
	@Autowired
	FlightClient flightClient;

    @Override
    public BookFlight createBooking(Long flightId, String passengerName, String email) {
        // Call Flight MS using Feign
        FlightDTO flight = flightClient.getFlightById(flightId);
        System.out.println(flight.getId());
        String bookingRef = "BKG" + System.currentTimeMillis();

        // Create booking record
        BookFlight booking = new BookFlight(
                null,
                bookingRef,
                flight.getFlightNumber(),
                passengerName,
                email,
                flight.getPrice(),
                "INITIATED"
        );

        return bookFlightRepo.save(booking);
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

