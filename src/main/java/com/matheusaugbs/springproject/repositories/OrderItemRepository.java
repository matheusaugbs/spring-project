package com.matheusaugbs.springproject.repositories;

import com.matheusaugbs.springproject.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
