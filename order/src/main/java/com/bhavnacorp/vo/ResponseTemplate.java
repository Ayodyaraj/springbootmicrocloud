package com.bhavnacorp.vo;

import com.bhavnacorp.model.OrderEntity;

public class ResponseTemplate {
	
	private OrderEntity orderEntity;
	public OrderEntity getOrderEntity() {
		return orderEntity;
	}
	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}
	public InventoryEntity getInventoryEntity() {
		return inventoryEntity;
	}
	public void setInventoryEntity(InventoryEntity inventoryEntity) {
		this.inventoryEntity = inventoryEntity;
	}
	private InventoryEntity inventoryEntity;

}
