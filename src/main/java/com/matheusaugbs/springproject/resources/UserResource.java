package com.matheusaugbs.springproject.resources;

import com.matheusaugbs.springproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maicon", "maicon@gmail.com", "4002-8922", "123");
        return ResponseEntity.ok().body(u);
    }
}
