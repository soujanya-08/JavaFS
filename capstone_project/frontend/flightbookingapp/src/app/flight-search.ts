import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FlightDTO } from './flight-dto';


@Injectable({
  providedIn: 'root'
})
export class FlightSearchService {
  private readonly apiUrl = '/api/bookings/search'; // Adjust path accordingly

  constructor(private http: HttpClient) {}

  searchFlights(source: string, destination: string, travelDate: string): Observable<FlightDTO[]> {
    const params = new HttpParams()
      .set('source', source)
      .set('destination', destination)
      .set('travelDate', travelDate);

    return this.http.get<FlightDTO[]>(this.apiUrl, { params });
  }
}
