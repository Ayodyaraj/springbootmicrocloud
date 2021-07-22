package com.bhavnacorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhavnacorp.model.InventoryEntity;
@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {

	
InventoryEntity findByInventoryId(Long inventoryId);

}
