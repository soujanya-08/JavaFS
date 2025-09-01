import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BASE_URL } from './util/appurl';
import { FlightDTO } from '../interfaces/flight-dto';

@Injectable({
  providedIn: 'root'
})
export class FlightSearchService {
  private readonly apiUrl = BASE_URL+'/booking/booking/search'; 

  constructor(private http: HttpClient) {}

  searchFlights(source: string, destination: string, travelDate: string): Observable<FlightDTO[]> {
    const params = new HttpParams()
      .set('source', source)
      .set('destination', destination)
      .set('travelDate', travelDate);
//console.log(this.apiUrl);http://localhost:9000/flight/flight
return this.http.get<FlightDTO[]>(this.apiUrl, { params })
    
  }
}
