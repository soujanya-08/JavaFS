import { Component } from '@angular/core';
import { IOrder } from '../iorder';
import { ProductService } from '../product-service';
import { CommonModule, DatePipe } from '@angular/common';
import { CommaDatePipe } from '../comma-date-pipe-pipe';

@Component({
  selector: 'app-order-history-comp',
  imports: [DatePipe, CommonModule,CommaDatePipe],
  templateUrl: './order-history-comp.html',
  styleUrl: './order-history-comp.css'
})
export class OrderHistoryComp {
 orders: IOrder[] = [];

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.productService.getOrderHistory().subscribe(data => {
      this.orders = data;
      console.log(data);
    });
  }
}
