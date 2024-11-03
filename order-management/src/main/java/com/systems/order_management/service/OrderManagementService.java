package com.systems.order_management.service;

import com.systems.order_management.dtos.OrderDto;
import com.systems.order_management.entities.Order;
import com.systems.order_management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrderManagementService {

    @Autowired
    private OrderRepository orderManagementRepository;

    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        //TODO: add exception
        Order order = orderManagementRepository.findById(id).orElseThrow();
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    public ResponseEntity<Void> createOrder(OrderDto orderDto) {
        //TODO: business logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
