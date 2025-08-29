import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FlightDTO } from '../flight-dto';
import { BASE_URL } from './util/appurl';


@Injectable({
  providedIn: 'root'
})
export class FlightSearchService {
  private readonly apiUrl = BASE_URL+'/bookings/search'; // Adjust path accordingly

  constructor(private http: HttpClient) {}

  searchFlights(source: string, destination: string, travelDate: string): Observable<FlightDTO[]> {
    const params = new HttpParams()
      .set('source', source)
      .set('destination', destination)
      .set('travelDate', travelDate);
console.log(this.apiUrl);
    return this.http.get<FlightDTO[]>("http://localhost:9999", { params });
  }
}
