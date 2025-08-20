import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appHighlightStrikeThru]'
})
export class HighlightStrikeThru {

  constructor(private strikeThru:ElementRef) {
      this.strikeThru.nativeElement.style.backgroundColor ='yellow';
      this.strikeThru.nativeElement.style.textDecoration ='line-through';
   }

}
