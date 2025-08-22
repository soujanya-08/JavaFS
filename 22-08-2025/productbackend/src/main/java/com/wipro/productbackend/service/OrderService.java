package com.wipro.productbackend.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.productbackend.entity.Order;
import com.wipro.productbackend.entity.Product;
import com.wipro.productbackend.repo.OrderRepo;
import com.wipro.productbackend.repo.ProductRepo;

@Service
public class OrderService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
     OrderRepo orderRepo;

    public Order placeOrder(int productId, int qty) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (qty > product.getQty()) {
            throw new RuntimeException("Not enough stock available");
        }

        product.setQty(product.getQty() - qty);
        productRepo.save(product);

        Order order = new Order();
        order.setOrderDate(LocalDateTime.now());
        order.setProduct(product);
        order.setQtyPurchased(qty);

        return orderRepo.save(order);
    }

    public List<Order> getOrderHistory() {
        return orderRepo.findAll();
    }
}
