package com.systems.order_management.entities;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "ordered_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "item_ordered_stock")
    private Integer itemOrderedStock;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order orderId;
}
