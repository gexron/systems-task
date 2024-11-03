package com.systems.inventory.repository;

import com.systems.inventory.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Item, Long> {
}
