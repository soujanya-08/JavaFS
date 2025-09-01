import { Component } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule } from '@angular/forms';
import { PaymentService } from '../../service/payment-service';
import { ActivatedRoute, Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { BookingService } from '../../service/booking-service';
import { Payment } from '../../interfaces/payment';
@Component({
  selector: 'app-payment-component',
  imports: [FormsModule, CommonModule],
  templateUrl: './payment-component.html',
  styleUrl: './payment-component.css'
})
export class PaymentComponent {
flight: any;
  passenger: any;

  paymentDetails: Payment = {
    bookingId: '', 
    senderName: '',
    accountNumber: '',
    cvv: '',
    mode: 'CREDIT_CARD',
    amount: 0
  };

  constructor(
    private paymentService: PaymentService,
    private bookingService: BookingService,  
    private router: Router
  ) {
    const nav = this.router.getCurrentNavigation();
    const state = nav?.extras.state as any;

    if (state) {
      this.flight = state.booking.flightNumber;
      this.passenger = state.booking.passengerName;
      this.paymentDetails.bookingId = state.booking.bookingId;
      this.paymentDetails.amount = state.booking.amount;
      console.log(this.paymentDetails);
    }
  }

  proceedPayment() {
  this.paymentService.makePayment(this.paymentDetails).subscribe({
    next: (res) => {
      const checkStatus = () => {
        this.bookingService.getBookingById(res.bookingId).subscribe(booking => {
          if (booking.status === 'SUCCESS') {
            alert('Payment Successful!');
            this.router.navigate(['/ticket'], { state: { booking } });
          } else {
            setTimeout(checkStatus, 2000);
          }
        });
      };
      checkStatus();
    },
    error: (err) => {
      console.error('Payment Error:', err);
      alert('Payment Error');
    }
  });
}

}