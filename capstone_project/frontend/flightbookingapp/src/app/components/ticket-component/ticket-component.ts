import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import jsPDF from 'jspdf';
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
  downloadTicket() {
    const doc = new jsPDF();

    doc.setFontSize(18);
    doc.text('Flight Booking Ticket', 20, 20);

    doc.setFontSize(12);
    doc.text(`Booking ID: ${this.booking.bookingId}`, 20, 40);
    doc.text(`Passenger Name: ${this.booking.passengerName}`, 20, 50);
    doc.text(`Flight Number: ${this.booking.flightNumber}`, 20, 60);
    doc.text(`Amount: ₹${this.booking.amount}`, 20, 70);
    doc.text(`Status: ${this.booking.status}`, 20, 80);

    doc.text('Have a safe and happy journey!', 20, 100);

    // save file
    doc.save(`ticket-${this.booking.bookingId}.pdf`);
  }
   goHome() {
    this.router.navigate(['/']); 
  }
}
