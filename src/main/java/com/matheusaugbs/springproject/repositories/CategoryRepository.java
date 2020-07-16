package com.matheusaugbs.springproject.repositories;

import com.matheusaugbs.springproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
