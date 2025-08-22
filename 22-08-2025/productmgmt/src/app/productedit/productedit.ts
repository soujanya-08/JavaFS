import { ChangeDetectorRef, Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product-service';
import { IProduct } from '../iproduct';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-productedit',
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit {
constructor(private activatedRoute:ActivatedRoute,
    private productService:ProductService,
    private router:Router, private cdr:ChangeDetectorRef

  ) {}
  id:string | null = null;
  product:IProduct = {

    name: '',
    category: '',
    price:0,
    qty:0
  };
  ngOnInit()
  {
     this.id = this.activatedRoute.snapshot.paramMap.get('id');
      if (this.id) {
        this.productService.findProduct(this.id).subscribe(product => {
          console.log(product);
          this.product = product;
          this.cdr.detectChanges();
        });
      }
    }
     save()
     {
      this.productService.saveProduct(this.product).subscribe({
        next: (product) => {
          console.log('Product saved successfully:', product);
          this.cdr.detectChanges();
          this.router.navigate(['/productlist']);

        },
        error: (error) => {
          console.error('Error saving product:', error);
        }
     });
    }
}
