package com.systems.inventory.controller;

import com.systems.inventory.dtos.ItemDto;
import com.systems.inventory.dtos.OrderDto;
import com.systems.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/v1")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/items/{id}")
    public ItemDto getItem(@PathVariable Long id) {
        return inventoryService.getItem(id);
    }

    @PostMapping("/decrease-stock")
    public ResponseEntity<Void> decreaseStock(@RequestParam OrderDto order) {
        return inventoryService.decreaseStock(order);
    }
}
