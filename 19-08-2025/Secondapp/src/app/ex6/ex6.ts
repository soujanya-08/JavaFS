import { Component, Input } from '@angular/core';
import { IFruit } from '../ifruit';

@Component({
  selector: 'app-ex6',
  imports: [],
  templateUrl: './ex6.html',
  styleUrl: './ex6.css'
})
export class Ex6 {
@Input() fruit!:IFruit;
}
