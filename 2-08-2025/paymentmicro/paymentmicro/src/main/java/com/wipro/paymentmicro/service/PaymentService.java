package com.wipro.paymentmicro.service;

import java.util.List;

import com.wipro.paymentmicro.entity.Payment;

public interface PaymentService {
	void save(Payment pay);
	List<Payment> findAll();
	 void update(Payment pay);
	 Payment findById(int id);
	 void delete(int id);

}
