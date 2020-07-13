package com.matheusaugbs.springproject.repositories;

import com.matheusaugbs.springproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
