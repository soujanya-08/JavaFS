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
airports = ['Delhi', 'Mumbai', 'Chennai', 'Bangalore', 'Hubli'];

filteredSources: string[] = [];
filteredDestinations: string[] = [];
  constructor(
    private fb: FormBuilder,
    private flightService: FlightSearchService,
    private router: Router
  ) {
    this.searchForm = this.fb.group({
  source: ['', Validators.required],
  destination: ['', Validators.required],
  travelDate: ['', Validators.required]
},
{
    validators: this.sourceDestinationValidator
  });
this.searchForm.get('source')?.valueChanges.subscribe(value => {
  this.filteredSources = this.filterAirports(value);
});

this.searchForm.get('destination')?.valueChanges.subscribe(value => {
  this.filteredDestinations = this.filterAirports(value);
});

  }
  sourceDestinationValidator(form: FormGroup) {
  const source = form.get('source')?.value;
  const destination = form.get('destination')?.value;

  return source && destination && source === destination
    ? { sameLocation: true }
    : null;
}
  filterAirports(query: string): string[] {
  const lower = query?.toLowerCase() || '';
  return this.airports.filter(a => a.toLowerCase().includes(lower));
}

  search() {
    if (this.searchForm.invalid) {
    this.searchForm.markAllAsTouched();
    alert("Please fill all required fields before searching");
    return;
  }
  if (this.searchForm.hasError('sameLocation')) {
    alert("Source and Destination cannot be the same!");
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
swapSourceDestination() {
  const source = this.searchForm.get('source')?.value;
  const destination = this.searchForm.get('destination')?.value;
  this.searchForm.patchValue({
    source: destination,
    destination: source
  });
   this.filteredSources = [];
  this.filteredDestinations = [];
}
  bookFlight(flight: FlightDTO) {
    this.router.navigate(['/flight', flight.id]);
  }
}
