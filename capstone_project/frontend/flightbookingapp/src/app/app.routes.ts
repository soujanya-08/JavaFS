import { Routes } from '@angular/router';
import { SearchComponent } from './components/search/search';
import { FlightListComponent } from './components/flight-list-component/flight-list-component';
import { PassengerDetails } from './components/passenger-details/passenger-details';
import { ProceedToPay } from './components/proceed-to-pay/proceed-to-pay';
import { PaymentComponent } from './components/payment-component/payment-component';
import { TicketComponent } from './components/ticket-component/ticket-component';

export const routes: Routes = [
  { path: '', redirectTo: '/search', pathMatch: 'full' },
  { path: 'search', component: SearchComponent },
  { path: 'search/results', component: FlightListComponent },
  {path:'passenger-details', component:PassengerDetails},
  { path: 'proceedToPay', component: ProceedToPay },
  {path:'payment', component:PaymentComponent},
  {path:'ticket', component:TicketComponent},
  { path: '**', redirectTo: 'search' }
];
