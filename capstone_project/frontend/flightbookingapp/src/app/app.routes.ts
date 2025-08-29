import { Routes } from '@angular/router';
import { SearchComponent } from './search/search';

export const routes: Routes = [
  { path: '', redirectTo: 'search', pathMatch: 'full' },
  { path: 'search', component: SearchComponent },
//   { path: 'flight/:id', component: FlightDetailsComponent },
//   { path: 'payment/:bookingId', component: PaymentComponent },
//   { path: 'confirmation', component: ConfirmationComponent },
  // Optionally, a fallback route
  { path: '**', redirectTo: 'search' }
];
