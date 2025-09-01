package com.wipro.flightms.controller;
import com.wipro.flightms.entity.Flight;
import com.wipro.flightms.service.FlightService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
@Tag(name = "Flight API", description = "Flight management operations")
public class FlightController {
	@Autowired
    FlightService flightService;

    @GetMapping("/search")
    @Operation(summary = "Search flights by source, destination and travel date")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flights retrieved successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid request parameters")
    })
    public List<Flight> searchFlights(@RequestParam String source,
                                      @RequestParam String destination,
                                      @RequestParam String travelDate) {
        return flightService.searchFlights(source, destination, LocalDate.parse(travelDate));
    }

    @PostMapping
    @Operation(summary = "Add a new flight")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Flight added successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid flight details")
    })
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }
    @GetMapping
    @Operation(summary = "Get all available flights")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flights retrieved successfully")
    })
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
    @GetMapping("/{id}")
    @Operation(summary = "Get flight by ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flight retrieved successfully"),
        @ApiResponse(responseCode = "404", description = "Flight not found")
    })
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Update flight details")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flight updated successfully"),
        @ApiResponse(responseCode = "404", description = "Flight not found"),
        @ApiResponse(responseCode = "400", description = "Invalid update details")
    })
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight updatedFlight) {
        return flightService.updateFlight(id, updatedFlight);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a flight by ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Flight deleted successfully"),
        @ApiResponse(responseCode = "404", description = "Flight not found")
    })
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }
}