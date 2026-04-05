package com.example.demoproject.controller;

import com.example.demoproject.model.UserResponse;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class DemoController {

  @GetMapping
  public ResponseEntity<List<UserResponse>> getUsers() {
    return ResponseEntity.of(Optional.of(List.of(new UserResponse(UUID.randomUUID(), "test2@gamil.com"))));
  }
}

