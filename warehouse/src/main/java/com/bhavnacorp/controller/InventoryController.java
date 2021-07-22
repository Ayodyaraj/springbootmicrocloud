package com.bhavnacorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.bhavnacorp.model.InventoryEntity;
import com.bhavnacorp.service.InventoryService;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	private static final Logger logger = LogManager.getLogger(InventoryController.class);
	
	@Autowired
	InventoryService inventoryService; 
	
	@PostMapping("/")
	public InventoryEntity saveInventory(@RequestBody InventoryEntity inventoryEntity )
   {
		logger.info(" Inside saveInventory method in InventoryController ");
		return inventoryService.saveInventory(inventoryEntity);
	}
	
	@GetMapping("/{inventoryId}")
	public InventoryEntity findByInventoryId(@PathVariable("inventoryId") Long inventoryId)
	{
		logger.info(" Inside findByInventoryId method in InventoryController ");
	  return inventoryService.findByInventoryId(inventoryId);
	}
}
