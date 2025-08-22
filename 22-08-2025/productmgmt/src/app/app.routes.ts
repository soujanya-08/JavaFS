import { Routes } from '@angular/router';
import { ProductList } from './product-list/product-list';
import { ProductAdd } from './product-add/product-add';
import { Productedit } from './productedit/productedit';
import { ProductDelete } from './product-delete/product-delete';
import { PurchaseComp } from './purchase-comp/purchase-comp';
import { OrderHistoryComp } from './order-history-comp/order-history-comp';

export const routes: Routes = [
    {path:'', component:ProductList},
    { path: 'productlist', component: ProductList },
 { path: 'productadd', component: ProductAdd },
{ path: 'productedit/:id', component: Productedit },
{ path: 'productdelete/:id', component: ProductDelete },
{ path: 'purchase', component: PurchaseComp },
  { path: 'orderhistory', component: OrderHistoryComp },
];
