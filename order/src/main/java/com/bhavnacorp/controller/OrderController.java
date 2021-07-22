package com.bhavnacorp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavnacorp.model.OrderEntity;
import com.bhavnacorp.service.OrderService;
import com.bhavnacorp.vo.ResponseTemplate;
@RestController
@RequestMapping("/orders")
public class OrderController {
	private static final Logger logger = LogManager.getLogger(OrderController.class);
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/")
	public OrderEntity saveOrder(@RequestBody OrderEntity orderEntity)
	{
		logger.info(" Inside saveOrder method in OrderController ");
		return orderService.saveOrder(orderEntity);
	}
	
	@GetMapping("/{orderId}")
	public ResponseTemplate getOrderWithInventory(@PathVariable("orderId") Long orderId)
	{
		logger.info(" Inside getOrderWithInventory method in OrderController ");
		return orderService.getOrderWithInventory(orderId);
	}
	
	

}
