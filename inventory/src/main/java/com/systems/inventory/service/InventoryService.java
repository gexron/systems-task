package com.systems.inventory.service;

import com.systems.inventory.dtos.ItemDto;
import com.systems.inventory.dtos.OrderDto;
import com.systems.inventory.entities.Item;
import com.systems.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public ItemDto getItem(Long id) {
        //TODO: add exception
        Item item = inventoryRepository.findById(id).orElseThrow();
        //TODO: convert to dto
        ItemDto itemDto = new ItemDto();
        return itemDto;
    }

    public ResponseEntity<Void> decreaseStock(OrderDto order) {
        //TODO: business logic
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
