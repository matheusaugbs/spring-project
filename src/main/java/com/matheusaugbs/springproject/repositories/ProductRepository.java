package com.matheusaugbs.springproject.repositories;

import com.matheusaugbs.springproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
