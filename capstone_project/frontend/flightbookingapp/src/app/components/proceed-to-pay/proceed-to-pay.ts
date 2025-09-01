import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { BookingService } from '../../service/booking-service';

@Component({
  selector: 'app-proceed-to-pay',
  imports: [CommonModule],
  templateUrl: './proceed-to-pay.html',
  styleUrl: './proceed-to-pay.css'
})
export class ProceedToPay {
flight: any;
  passenger: any;

  constructor(
    private router: Router,
    private bookingService: BookingService
  ) {
    const nav = this.router.getCurrentNavigation();
    this.flight = nav?.extras.state?.['flight'];
    this.passenger = nav?.extras.state?.['passenger'];
  }

  goToPayment() {
    const bookingPayload = {
      flightNumber: this.flight.flightNumber,
      passengerName: this.passenger.name,
      email: this.passenger.email,
      amount: this.flight.price,
      status: 'PENDING'
    };

    this.bookingService.createBooking(bookingPayload).subscribe({
      next: (response) => {
        console.log('Booking created:', response);
        this.router.navigate(['/payment'], { state: { booking: response } });
      },
      error: (err) => {
        console.error('Booking failed:', err);
        alert('Failed to create booking. Try again!');
      }
    });
  }
}
