package com.wipro.paymentmicro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.paymentmicro.entity.Payment;
import com.wipro.paymentmicro.repo.PayRepo;
import com.wipro.paymentmicro.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PayRepo payRepo;

	@Override
	public void save(Payment pay) {
		payRepo.save(pay);
		
	}

	@Override
	public List<Payment> findAll() {
		
		return payRepo.findAll();
	}

	@Override
	public void update(Payment pay) {
		payRepo.save(pay);
	}

	@Override
	public void delete(int id) {
		payRepo.deleteById(id);
	}

	@Override
	public Payment findById(int id) {
		Optional<Payment> pay=payRepo.findById(id);
		if(!pay.isEmpty())
		{
			return pay.get();
		}
		return null;
	}
	

}
