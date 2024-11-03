package com.systems.order_management.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private String category;
    private Integer stock;
    private Double price;
}
