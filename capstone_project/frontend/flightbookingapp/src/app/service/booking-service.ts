import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BookingResponse } from '../interfaces/booking-response';
import { BASE_URL } from './util/appurl';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
   private readonly apiUrl = BASE_URL+ '/booking/booking';
  constructor(private http: HttpClient) {}

  createBooking(payload: any): Observable<any> {
    return this.http.post(`${this.apiUrl}`, payload);
  }

  getBookingById(id: string): Observable<BookingResponse> {
    return this.http.get<BookingResponse>(`${this.apiUrl}/${id}`);
  }
}
