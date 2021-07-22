package com.bhavnacorp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavnacorp.model.InventoryEntity;
import com.bhavnacorp.repository.InventoryRepository;

@Service
public class InventoryService {
	private static final Logger logger = LogManager.getLogger(InventoryService.class);
	
	@Autowired
	InventoryRepository inventoryRepository;
	
	
	public InventoryEntity saveInventory(InventoryEntity inventoryEntity)
	{
		logger.info(" Inside saveInventory method in InventoryService ");
		return inventoryRepository.save(inventoryEntity);
	}
    
	
	public InventoryEntity findByInventoryId(Long inventoryId) {
		logger.info(" Inside findByInventoryId method in InventoryService ");
		return inventoryRepository.findByInventoryId(inventoryId);
	}
	
}
