import { IProduct } from "./iproduct";

export interface IOrder {
    id?: number;
  orderDate: number[];
  product: IProduct;
  qtyPurchased: number;
}
