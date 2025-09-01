import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { FlightDTO } from '../../interfaces/flight-dto';

@Component({
  selector: 'app-passenger-details',
  imports: [ReactiveFormsModule],
  templateUrl: './passenger-details.html',
  styleUrl: './passenger-details.css'
})
export class PassengerDetails {
  passengerForm: FormGroup;
  flight: FlightDTO;

  constructor(private fb: FormBuilder, private router: Router) {
    const nav = this.router.getCurrentNavigation();
    this.flight = nav?.extras.state?.['flight'];
    this.passengerForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
    });
  }

  ngOnInit() {}

  onSubmit() {
    if (this.passengerForm.valid) {
      const details = this.passengerForm.value;
     this.router.navigate(['/proceedToPay'], {
     state: { 
    flight: this.flight, 
    passenger: details 
  }
});
    }
  }

}
