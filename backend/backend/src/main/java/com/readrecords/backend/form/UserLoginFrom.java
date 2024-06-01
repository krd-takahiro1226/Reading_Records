package com.readrecords.backend.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserLoginFrom {
  @NotNull
  @Max(50)
  private String user_name;
  @NotNull
  @Max(255)
  private String password;
  
}
