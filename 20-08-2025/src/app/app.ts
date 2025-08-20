import { DatePipe, UpperCasePipe } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { CtfPipe } from './ctf-pipe';
import {HighlightStrikeThru} from './highlight-strike-thru';
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule,UpperCasePipe,DatePipe, CtfPipe, HighlightStrikeThru],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('fourthapp');
  inputText: string = '';
  selectedDate: Date | null = null;
  celsius:number = 20;
}
