import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'commaDatePipe'
})

export class CommaDatePipe implements PipeTransform {
  transform(value: number[], ...args: unknown[]): string| null {
   if (!Array.isArray(value) || value.length < 3) return null;

    const [year, month, day] = value;

    // Format with leading zeros
    const dd = String(day).padStart(2, '0');
    const mm = String(month).padStart(2, '0');

    return `${dd}-${mm}-${year}`;
  }

}
