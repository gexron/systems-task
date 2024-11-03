package com.systems.order_management.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.systems.order_management.entities.OrderItem;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {

    private Long id;

    private List<OrderItem> orderItems;

    private LocalDateTime creationDate;

    private Double totalCost;
}
