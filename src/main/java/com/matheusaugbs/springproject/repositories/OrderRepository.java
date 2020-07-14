package com.matheusaugbs.springproject.repositories;

import com.matheusaugbs.springproject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
