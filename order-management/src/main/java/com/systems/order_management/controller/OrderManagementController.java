package com.systems.order_management.controller;

import com.systems.order_management.dtos.OrderDto;
import com.systems.order_management.entities.Order;
import com.systems.order_management.service.OrderManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis/v1")
public class OrderManagementController {
    @Autowired
    private OrderManagementService orderManagementService;

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return orderManagementService.getOrder(id);
    }

    @PostMapping("/orders")
    public ResponseEntity<Void> createOrder(OrderDto orderDto) {
        return orderManagementService.createOrder(orderDto);
    }
}
