package com.wipro.paymentmicro.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.paymentmicro.entity.Payment;
import com.wipro.paymentmicro.service.PaymentService;

@RestController
@RequestMapping("/pay")
public class PaymentController {

	@Autowired
	PaymentService payService;
	
	@PostMapping
	ResponseEntity<String>save(@RequestBody Payment p ) {
		HttpHeaders headers= new HttpHeaders();
		headers.add("created-at", LocalDate.now().toString()); 
		payService.save(p);
		return ResponseEntity				
				.status(201)
				.headers(headers)
				.body("Data Saved Successfully");
		
	}
	
	@PutMapping
	ResponseEntity<String> update(@RequestBody Payment pay) {
		
		payService.update(pay);
		return ResponseEntity.status(200).body("Data modified successfully");
	}
	
	@GetMapping
	ResponseEntity<List<Payment>> findAll(){
		
		List<Payment> pay = payService.findAll();
		HttpHeaders header= new HttpHeaders();
		header.add("search-time", LocalDateTime.now().toString()); 
		HttpStatusCode httpStatus = null;
		if(pay.size()==0) {
			httpStatus = HttpStatusCode.valueOf(404);
		}
		else {
			httpStatus = HttpStatusCode.valueOf(200);
		}
		return ResponseEntity.status(httpStatus).headers(header).body(pay);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<?> findById(@PathVariable int id) {
		HttpStatusCode httpStatus = null;
		Payment pay = payService.findById(id);
		HttpHeaders header= new HttpHeaders();
		header.add("search-time", LocalDateTime.now().toString()); 
		if(pay== null) {
			httpStatus = HttpStatusCode.valueOf(404);
			return ResponseEntity.status(httpStatus).headers(header).body("Data not found");
		}
		else {
			httpStatus = HttpStatusCode.valueOf(200);
			return ResponseEntity.status(httpStatus).headers(header).body(pay);
		}
		
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> delete(@PathVariable int id) {
		payService.delete(id);
		return ResponseEntity.status(200).body("Data deleted successfully");
	}
}
