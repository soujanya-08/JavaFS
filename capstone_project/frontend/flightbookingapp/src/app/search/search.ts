import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { FlightDTO } from '../flight-dto';
import { FlightSearchService } from '../flight-search';
import { CommonModule, CurrencyPipe } from '@angular/common';
import { decodedTextSpanIntersectsWith } from 'typescript';

@Component({
  selector: 'app-flight-search',
  imports:[CurrencyPipe, ReactiveFormsModule, CommonModule],
  templateUrl: './search.html',
  styleUrls: ['./search.css']
})
export class SearchComponent {
  searchForm: FormGroup;
  flights: FlightDTO[] = [];

  displayedColumns = ['flightNumber', 'airline', 'travelDate', 'price', 'action'];

  constructor(
    private fb: FormBuilder,
    private flightService: FlightSearchService,
    private router: Router
  ) {
    this.searchForm = this.fb.group({
      source: [''],
      destination: [''],
      travelDate: [new Date()]
    });
  }

  search() {
    const { source, destination, travelDate } = this.searchForm.value;

const dateObj = travelDate instanceof Date ? travelDate : new Date(travelDate);
const year  = dateObj.getFullYear();
const month = String(dateObj.getMonth() + 1).padStart(2, '0');
const day   = String(dateObj.getDate()).padStart(2, '0');
const qsDate = `${year}-${month}-${day}`;
//const qsDate = dateObj.toISOString().split('T')[0];

    this.flightService.searchFlights(source, destination, qsDate)
      .subscribe(data => this.flights = data);
      console.log(source,destination, travelDate);
  }

  bookFlight(flight: FlightDTO) {
    this.router.navigate(['/flight', flight.id]);
  }
}
