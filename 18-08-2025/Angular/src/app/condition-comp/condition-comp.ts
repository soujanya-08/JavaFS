import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-condition-comp',
  imports: [FormsModule],
  templateUrl: './condition-comp.html',
  styleUrl: './condition-comp.css'
})
export class ConditionComp {
  flag:boolean= false

  toggle(){
    this.flag = !this.flag;
  }
  countries:string[] =[];
  load(){
    this.countries=["India", "Japan","South Africa","Germany"];
  }

  color:string ="Black";

}
