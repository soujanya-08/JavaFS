package com.wipro.productbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.productbackend.entity.Order;
import com.wipro.productbackend.service.OrderService;

@RestController
@RequestMapping("/order")
//@CrossOrigin(origins = "http://localhost:4200") // Angular port
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order placeOrder(@RequestParam int productId, @RequestParam int qty) {
        return orderService.placeOrder(productId, qty);
    }

    @GetMapping("/history")
    public List<Order> getOrderHistory() {
        return orderService.getOrderHistory();
    }
}

