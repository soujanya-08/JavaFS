import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ctf'
})
export class CtfPipe implements PipeTransform {

  transform(value: number, ...args: number[]): string {
    if(value === null || value === undefined || isNaN(value)){
      return '';
    }
    const farenheit = (value *9/5)+32;
    return `${farenheit}F`;
  }

}
