/**
 * aniboys.id
 * Copyright (c) 2017-2024 All Rights Reserved.
 */
package com.inventoryservice.inventory_service.controller;

import com.inventoryservice.inventory_service.dto.InventoryResponse;
import com.inventoryservice.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Aceng <acengtjhin69@aniboys.id>
 * @version $Id: InventoryController.java, v 0.1 2024‐08‐12 17:19 Aceng Exp $$
 */

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
