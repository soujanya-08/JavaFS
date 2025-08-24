package com.wipro.orderms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.orderms.dto.Payment;
import com.wipro.orderms.entity.Order;
import com.wipro.orderms.repo.OrderRepo;
import com.wipro.orderms.service.OrderService;
//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import com.wipro.orderms.service.PaymentConnectService;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
	RestTemplate restTemplate;
    
    @Autowired
	PaymentConnectService paymentConnectService;

    @Override
    public void save(Order order) {
        order.setOrderStatus("I");
        orderRepo.save(order);
        
       // RestTemplate  rest= new RestTemplate();
		//String url="http://localhost:9012/payment";
        String url="http://payment-ms/payment";
        Payment payment = new Payment();
        payment.setOrderId(order.getId());
        payment.setPaymentAmount(order.getOrderValue());
        payment.setPaymentStatus(true);

        try {
        //	ResponseEntity<Payment>   response= restTemplate.postForEntity(url, payment, Payment.class);
        	
        ResponseEntity<Payment> response = paymentConnectService.savePaymentData(payment);

        if (response.getStatusCode()== HttpStatusCode.valueOf(200)) {
            order.setOrderStatus("P");
        } 
        }catch(Exception ex){
        	order.setOrderStatus("C");
        }
        orderRepo.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }
  
    public String handleFallBack(Order order, Throwable t) {
        System.out.println("--System is down--");
        order.setOrderStatus("C");
        orderRepo.save(order);
        return "System is down";
    }
}
