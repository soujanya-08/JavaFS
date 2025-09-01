package com.wipro.flightms.controller;
import com.wipro.flightms.entity.Flight;
import com.wipro.flightms.service.FlightService;
import io.swagger.v3.oas.annotations.Operation;
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
    public List<Flight> searchFlights(@RequestParam String source,
                                      @RequestParam String destination,
                                      @RequestParam String travelDate) {
        return flightService.searchFlights(source, destination, LocalDate.parse(travelDate));
    }

    @PostMapping
    @Operation(summary = "Add a new flight")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }
    @GetMapping
    @Operation(summary = "Get all available flights")
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
    @GetMapping("/{id}")
    @Operation(summary = "Get flight by ID")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Update flight details")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight updatedFlight) {
        return flightService.updateFlight(id, updatedFlight);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a flight by ID")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }
}