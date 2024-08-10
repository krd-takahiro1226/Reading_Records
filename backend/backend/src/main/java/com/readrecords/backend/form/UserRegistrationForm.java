package com.readrecords.backend.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Data
public class UserRegistrationForm {
  @NotNull
  @Size(max = 50)
  private String username;
  @NotNull
  @Email
  private String email;
  @NotNull
  @Size(max = 255)
  private String password;
  @NotNull
  @Size(max = 255)
  private String confirmPassword;
}
