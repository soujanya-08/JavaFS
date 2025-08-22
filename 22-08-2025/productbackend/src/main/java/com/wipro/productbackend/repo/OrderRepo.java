package com.wipro.productbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.productbackend.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
