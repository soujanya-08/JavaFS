package com.wipro.paymentmicro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.paymentmicro.entity.Payment;
@Repository
public interface PayRepo extends JpaRepository<Payment,Integer>{

}
