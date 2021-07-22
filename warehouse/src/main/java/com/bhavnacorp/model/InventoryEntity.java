package com.bhavnacorp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InventoryEntity {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Long inventoryId;
	private String inventoryName;
	private String inventoryAddress;
	public Long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	public String getInventoryAddress() {
		return inventoryAddress;
	}
	public void setInventoryAddress(String inventoryAddress) {
		this.inventoryAddress = inventoryAddress;
	}
	

}
