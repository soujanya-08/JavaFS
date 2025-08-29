package com.wipro.flightpaymentms.repo;
import com.wipro.flightpaymentms.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}