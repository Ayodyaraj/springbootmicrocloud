package com.bhavnacorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavnacorp.model.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

	OrderEntity findByOrderId(Long orderId);

}
