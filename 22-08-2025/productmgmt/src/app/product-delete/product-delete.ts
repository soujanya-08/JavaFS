import { ChangeDetectorRef, Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from '../product-service';

@Component({
  selector: 'app-product-delete',
  imports: [],
  templateUrl: './product-delete.html',
  styleUrl: './product-delete.css'
})
export class ProductDelete {

  id:string | null = null;
  constructor(private activeRoute:ActivatedRoute,private productService:ProductService,private router:Router,private cdr:ChangeDetectorRef) {
   }
   ngOnInit() {
         this.id = this.activeRoute.snapshot.paramMap.get('id');
         this.productService.deleteProduct(this.id!).subscribe(response => {
           console.log('Product deleted successfully');
           this.cdr.detectChanges();
           this.router.navigate(['/productlist']);
         }  , error => {
           console.error('Error deleting product:', error);
         }  );
   }
}
