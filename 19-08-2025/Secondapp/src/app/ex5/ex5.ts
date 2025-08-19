import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-ex5',
  imports: [],
  templateUrl: './ex5.html',
  styleUrl: './ex5.css'
})
export class Ex5 {
@Input() imgSrc: string ="";
  @Input() name: string ="";
  @Input() desc: string ="";
}
