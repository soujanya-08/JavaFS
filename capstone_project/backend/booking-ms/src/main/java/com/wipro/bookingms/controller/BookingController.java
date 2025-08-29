package com.wipro.bookingms.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.entity.BookFlight;
import com.wipro.bookingms.service.BookingService;

@RestController
@RequestMapping("/bookings")
@Tag(name = "Booking API", description = "Booking operations")
public class BookingController {

	@Autowired
    BookingService bookingService;

    @PostMapping("/create")
    @Operation(summary = "Create booking for a flight")
    public BookFlight createBooking(@RequestParam Long flightId,
                                 @RequestParam String passengerName,
                                 @RequestParam String email) {
        return bookingService.createBooking(flightId, passengerName, email);
    }
    
    @GetMapping("/search/all")
    @Operation(summary = "Get all flights available")
    public List<FlightDTO> getAllFlights() {
        return bookingService.getAllFlights();
    }
}