package com.bhavnacorp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhavnacorp.controller.OrderController;
import com.bhavnacorp.model.OrderEntity;
import com.bhavnacorp.repository.OrderRepository;
import com.bhavnacorp.vo.InventoryEntity;
import com.bhavnacorp.vo.ResponseTemplate;

@Service
public class OrderService {
	private static final Logger logger = LogManager.getLogger(OrderService.class);
	
	@Autowired
	OrderRepository orderRepository;
	@Autowired
	RestTemplate restTemplate;

	public OrderEntity saveOrder(OrderEntity orderEntity)
	{
		logger.info(" Inside saveOrder method in OrderService ");
		return orderRepository.save(orderEntity);
	}

	public ResponseTemplate getOrderWithInventory(Long orderId) {
		
		ResponseTemplate responseTemplate = new ResponseTemplate();
		logger.info(" Inside getOrderWithInventory method in OrderService ");
		OrderEntity orderEntity =orderRepository.findByOrderId(orderId);
		System.out.println(" OrderEntity  is "+orderEntity);
		InventoryEntity inventoryEntity = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/"+orderEntity.getInventoryId(), InventoryEntity.class);
		responseTemplate.setOrderEntity(orderEntity);
		responseTemplate.setInventoryEntity(inventoryEntity);
		
		return responseTemplate;
	}
}
