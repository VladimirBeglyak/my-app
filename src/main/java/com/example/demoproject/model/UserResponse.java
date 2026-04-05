package com.example.demoproject.model;

import java.util.UUID;

public record UserResponse(
    UUID id,
    String email
) {
  
}
