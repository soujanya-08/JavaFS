import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Payment } from '../interfaces/payment';
import { BASE_URL } from './util/appurl';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  private apiUrl = BASE_URL+ '/flightpayment/flightpayment';

  constructor(private http: HttpClient) {}

  makePayment(payment: Payment): Observable<Payment> {
    return this.http.post<Payment>(this.apiUrl, payment);
  }
}
