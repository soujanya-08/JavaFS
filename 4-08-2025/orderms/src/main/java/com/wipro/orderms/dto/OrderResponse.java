package com.wipro.orderms.dto;

import com.wipro.orderms.entity.Order;

import lombok.Data;

@Data
public class OrderResponse {
	private Order order;
	private Payment payment;

}
