package com.systems.order_management.client;

import com.systems.order_management.dtos.ItemDto;
import com.systems.order_management.entities.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-client", url = "http://localhost:8090/apis/v1")
public interface InventoryClient {

    @GetMapping("/items/{id}")
    ItemDto getItem(@PathVariable Long id);

    @PostMapping("/decrease-stock")
    void decreaseStock(@RequestParam Order order);
}
