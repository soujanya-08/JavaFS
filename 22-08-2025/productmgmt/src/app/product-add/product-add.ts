import { ChangeDetectorRef, Component } from '@angular/core';
import { ProductService } from '../product-service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product-add',
  imports: [FormsModule],
  templateUrl: './product-add.html',
  styleUrl: './product-add.css'
})
export class ProductAdd {

  constructor(private productService:ProductService,private router:Router, private cdr:ChangeDetectorRef) { }
  name:string = '';
  category:string = '';
  price:number =0;
  qty:number=0;

submit() {
  this.productService.addProduct({ name: this.name, category: this.category, price:this.price,qty:this.qty  }).subscribe(response => {
    console.log('Product added successfully:', response);
    this.cdr.detectChanges();
    this.name = '';
    this.category = '';
    this.price=0;
    this.router.navigate(['/productlist']); 

  }, (error)=> {
    console.error('Error adding product:', error);
  });
}
}
