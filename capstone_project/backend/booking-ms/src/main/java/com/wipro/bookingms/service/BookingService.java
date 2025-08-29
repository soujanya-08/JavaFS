package com.wipro.bookingms.service;
import java.util.List;

import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.entity.BookFlight;

public interface BookingService {
	BookFlight createBooking(Long flightId, String passengerName, String email);
	BookFlight getBooking(Long id);
	List<FlightDTO> getAllFlights();
}