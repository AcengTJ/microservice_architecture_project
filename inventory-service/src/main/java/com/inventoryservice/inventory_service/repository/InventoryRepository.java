/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.inventoryservice.inventory_service.repository;

import com.inventoryservice.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: InventoryRepository.java, v 0.1 2024‐08‐12 17:16 Aceng Exp $$
 */
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}