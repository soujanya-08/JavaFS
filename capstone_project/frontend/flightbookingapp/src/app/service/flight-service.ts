import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { FlightDTO } from '../interfaces/flight-dto';
import { BASE_URL } from './util/appurl';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  private readonly apiUrl = BASE_URL+ '/flight/flight/search';

  constructor(private http: HttpClient) {}

  searchFlights(
    source: string, 
    destination: string,
    travelDate: string
  ): Observable<FlightDTO[]> {
    const params = new HttpParams()
      .set('source', source)
      .set('destination', destination)
      .set('travelDate', travelDate);

    return this.http.get<FlightDTO[]>(this.apiUrl, { params });
  }
}
