package com.wipro.bookingms.service;
import java.util.List;

import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.entity.BookFlight;

public interface BookingService {
	BookFlight createBooking(BookFlight bookingRequest);
	BookFlight getBookingById(String id);
	BookFlight getBooking(Long id);
	List<FlightDTO> getAllFlights();
}