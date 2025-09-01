import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CommonModule, CurrencyPipe } from '@angular/common';
import { FlightSearchService } from '../../service/flight-search';
import { FlightDTO } from '../../interfaces/flight-dto';

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
  source: ['', Validators.required],
  destination: ['', Validators.required],
  travelDate: ['', Validators.required]
});
  }

  search() {
    if (this.searchForm.invalid) {
    this.searchForm.markAllAsTouched(); // show errors
    alert("Please fill all required fields before searching");
    return;
  }
    const { source, destination, travelDate } = this.searchForm.value;

const dateObj = travelDate instanceof Date ? travelDate : new Date(travelDate);
const year  = dateObj.getFullYear();
const month = String(dateObj.getMonth() + 1).padStart(2, '0');
const day   = String(dateObj.getDate()).padStart(2, '0');
const qsDate = `${year}-${month}-${day}`;
  this.flightService.searchFlights(source, destination, qsDate).subscribe(results => {
this.router.navigate(['/search/results'], {
  queryParams: { source, destination, travelDate: qsDate }
});
    
});
  }

  bookFlight(flight: FlightDTO) {
    this.router.navigate(['/flight', flight.id]);
  }
}
