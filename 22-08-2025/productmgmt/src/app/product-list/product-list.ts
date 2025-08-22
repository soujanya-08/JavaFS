import { ChangeDetectorRef, Component } from '@angular/core';
import { ProductService } from '../product-service';
import { Router, RouterLink } from '@angular/router';
import { IProduct } from '../iproduct';

@Component({
  selector: 'app-product-list',
  imports: [RouterLink],
  templateUrl: './product-list.html',
  styleUrl: './product-list.css'
})
export class ProductList {

  constructor(private productService:ProductService,private router:Router,private cdr:ChangeDetectorRef) { }

  products: IProduct[] = [];


  ngOnInit() {
    this.productService.getProduct().subscribe((data: IProduct[]) => {
      this.products = data;
      console.log('Products fetched successfully:', data);
      this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching products:', error);
    });

}

  addProduct() {
    this.router.navigate(['/productadd']);

  }
}
