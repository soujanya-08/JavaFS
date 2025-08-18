import { Component } from '@angular/core';

@Component({
  selector: 'app-list-comp',
  imports: [],
  templateUrl: './list-comp.html',
  styleUrl: './list-comp.css'
})
export class ListComp {
  namesList:string[]= ["Spoorti", "Veer", "Arjun", "Rohit"]
}
