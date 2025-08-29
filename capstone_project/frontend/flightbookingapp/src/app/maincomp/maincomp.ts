import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FlightDTO } from '../flight-dto';
import { HttpClient } from '@angular/common/http';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatTableModule } from '@angular/material/table';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-maincomp',
  imports: [ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    FormsModule,MatDatepickerModule,MatTableModule, CommonModule],
  templateUrl: './maincomp.html',
  styleUrl: './maincomp.css'
})
export class Maincomp {
searchForm: FormGroup;
  flights: FlightDTO[] = [];
  displayedColumns = ['flightNumber', 'airline', 'source', 'destination', 'travelDate', 'price'];

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.searchForm = this.fb.group({
      source: [''],
      destination: [''],
      travelDate: [new Date()]
    });
}
search() {
    const { source, destination, travelDate } = this.searchForm.value;
    const dateStr = travelDate.toISOString().split('T')[0]; // yyyy-MM-dd
    this.http.get<FlightDTO[]>(
      `/bookings/search?source=${source}&destination=${destination}&travelDate=${dateStr}`
    ).subscribe(data => this.flights = data);
  }
}
