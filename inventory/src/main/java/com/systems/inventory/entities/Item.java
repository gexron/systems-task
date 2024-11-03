package com.systems.inventory.entities;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "price")
    private Double price;
}
