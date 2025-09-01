package com.wipro.bookingms.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.bookingms.dto.FlightDTO;
import com.wipro.bookingms.entity.BookFlight;
import com.wipro.bookingms.service.BookingService;
import com.wipro.bookingms.service.FlightClient;

@RestController
@RequestMapping("/booking")
@Tag(name = "Booking API", description = "Booking operations")
public class BookingController {

	@Autowired
    BookingService bookingService;

	@Autowired
	FlightClient flightClient;
	
	@GetMapping("/search")
	@Operation(summary = "Search flights by source, destination and travel date")
	@ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flights retrieved successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid request parameters")
    })
    public List<FlightDTO> searchFlights(@RequestParam String source,
                                         @RequestParam String destination,
                                         @RequestParam String travelDate) {
        return flightClient.searchFlights(source, destination, travelDate);
    }
    @PostMapping
    @Operation(summary = "Create a Flight Booking")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Booking created successfully"),
        @ApiResponse(responseCode = "500", description = "Internal Server Error while creating booking")
    })
    public ResponseEntity<?> createBooking(@RequestBody BookFlight bookingRequest) {
        try {
            BookFlight booking = bookingService.createBooking(bookingRequest);
            return new ResponseEntity<>(booking, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error creating booking: " + e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Booking by ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Booking retrieved successfully"),
        @ApiResponse(responseCode = "404", description = "Booking not found")
    })
    public ResponseEntity<?> getBooking(@PathVariable String id) {
        try {
            BookFlight booking = bookingService.getBookingById(id);
            return new ResponseEntity<>(booking, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Booking not found: " + e.getMessage(),
                    HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/search/all")
    @Operation(summary = "Get all flights available")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "All flights retrieved successfully")
    })
    public List<FlightDTO> getAllFlights() {
        return bookingService.getAllFlights();
    }
}