import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FlightSearchService } from '../../service/flight-search';
import { FormsModule } from '@angular/forms';
import { FlightDTO } from '../../interfaces/flight-dto';
@Component({
  selector: 'app-flight-list-component',
  imports: [CommonModule, FormsModule],
  templateUrl: './flight-list-component.html',
  styleUrl: './flight-list-component.css'
})
export class FlightListComponent {
flights: FlightDTO[] = [];
  filteredFlights: FlightDTO[] = [];

  filters = {
    indigo: false,
    spicejet: false,
    emirates: false,
    airIndia:false,
  };

  constructor(
    private route: ActivatedRoute,
    private flightService: FlightSearchService,
    private router: Router
  ) {}

  ngOnInit() {
    this.route.queryParams.subscribe(params => {
      const { source, destination, travelDate } = params;
      if (source && destination && travelDate) {
        this.flightService.searchFlights(source, destination, travelDate)
          .subscribe(
            data => {
              this.flights = data;
              this.filteredFlights = [...this.flights]; // start with all
            },
            err => console.error('Error response:', err)
          );
      }
    });
  }

  applyFilters() {
    let airlines: string[] = [];
    if (this.filters.indigo) airlines.push("Indigo");
    if (this.filters.spicejet) airlines.push("SpiceJet");
    if (this.filters.emirates) airlines.push("Emirates");
    if (this.filters.airIndia) airlines.push("AirIndia");

    if (airlines.length > 0) {
      this.filteredFlights = this.flights.filter(f => airlines.includes(f.airline));
    } else {
      this.filteredFlights = [...this.flights]; // no filter, show all
    }
  }

  onBook(flight: FlightDTO) {
    this.router.navigate(['/passenger-details'], { state: { flight } });
  }
}
