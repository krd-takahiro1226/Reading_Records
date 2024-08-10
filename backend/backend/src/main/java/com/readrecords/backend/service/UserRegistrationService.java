package com.readrecords.backend.service;

public interface UserRegistrationService {
  String createUser(String username, String email, String password, String confirmPassword);
}
