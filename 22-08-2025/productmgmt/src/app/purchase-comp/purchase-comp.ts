import { Component } from '@angular/core';
import { IProduct } from '../iproduct';
import { ProductService } from '../product-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-purchase-comp',
  imports: [CommonModule, FormsModule],
  templateUrl: './purchase-comp.html',
  styleUrl: './purchase-comp.css'
})
export class PurchaseComp {
products: IProduct[] = [];
  selectedProductId: number | null = null;
  purchaseQty: number = 0;
  message: string = '';

  constructor(private productService: ProductService) {}

  ngOnInit(): void {
    this.productService.getProduct().subscribe(data => {
      this.products = data;
    });
  }

  placeOrder() {
    if (!this.selectedProductId) {
      this.message = "Please select a product";
      return;
    }

    const selectedProduct = this.products.find(p => p.id === this.selectedProductId);
    if (selectedProduct && this.purchaseQty > selectedProduct.qty) {
      this.message = "Cannot order more than available stock!";
      return;
    }

    this.productService.placeOrder(this.selectedProductId!, this.purchaseQty).subscribe({
      next: (order) => {
        this.message = `Order placed successfully for ${order.qtyPurchased} ${order.product.name}(s)!`;
        this.purchaseQty = 0;
      },
      error: (err) => {
        this.message = "Error placing order!";
        console.error(err);
      }
    });
  }
}
