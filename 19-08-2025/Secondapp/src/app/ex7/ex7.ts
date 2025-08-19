import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IFruit } from '../ifruit';

@Component({
  selector: 'app-ex7',
  imports: [],
  templateUrl: './ex7.html',
  styleUrl: './ex7.css'
})
export class Ex7 {
@Input() fruit!:IFruit;
@Output() remove = new EventEmitter<string>();
onRemove() {
    console.log("Clicked-"+this.fruit.name);
    this.remove.emit(this.fruit.name);
}
}
