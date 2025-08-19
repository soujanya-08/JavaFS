import { NgClass, NgStyle } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-ex2',
  imports: [NgClass, NgStyle],
  templateUrl: './ex2.html',
  styleUrl: './ex2.css'
})
export class Ex2 {
flag1:boolean=false;
flag2:boolean=true;
getNgClass() {
    return 'div3';
  }
}
