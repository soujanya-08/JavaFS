import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ticket-component',
  imports: [CommonModule],
  templateUrl: './ticket-component.html',
  styleUrl: './ticket-component.css'
})
export class TicketComponent {
booking: any;
  flight: any;
  passenger: any;

  constructor(private router: Router) {
    const nav = this.router.getCurrentNavigation();
    const state = nav?.extras.state as any;

    if (state) {
      this.booking = state.booking;
      this.flight = state.flight;
      this.passenger = state.passenger;
    }
  }
   goHome() {
    this.router.navigate(['/']); // or ['/search'] depending on your app flow
  }
}
