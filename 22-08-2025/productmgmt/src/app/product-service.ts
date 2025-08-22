import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IProduct } from './iproduct';
import { IOrder } from './iorder';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private http:HttpClient){}

  
  getProduct():Observable<IProduct[]>  {
    let url:string="http://localhost:9000/product"
    return this.http.get<IProduct[]>(url);
  }

  addProduct(product: IProduct): Observable<IProduct> {
    let url:string="http://localhost:9000/product"
    return this.http.post<IProduct>(url, product);
  }
  deleteProduct(id: string): Observable<void> {
    let url:string=`http://localhost:9000/product/${id}`;
    return this.http.delete<void>(url);
  }

  findProduct(id: string): Observable<IProduct> {
    let url:string=`http://localhost:9000/product/${id}`;
    return this.http.get<IProduct>(url);
  }

  saveProduct(product: IProduct): Observable<IProduct> {
    console.log("save clicked----",product);
    //let url:string=`http://localhost:9000/product/${product.id}`;
    let url:string=`http://localhost:9000/product`;
    return this.http.put<IProduct>(url, product);

}
placeOrder(productId: number, qty: number): Observable<IOrder> {
  return this.http.post<IOrder>(`http://localhost:9000/order?productId=${productId}&qty=${qty}`, {});
}

getOrderHistory(): Observable<IOrder[]> {
  return this.http.get<IOrder[]>(`http://localhost:9000/order/history`);
}
}
