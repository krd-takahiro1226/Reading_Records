package com.readrecords.backend.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserLoginForm {
  @NotNull
  @Max(50)
<<<<<<< HEAD
  private String username;
=======
  private String user_name;
>>>>>>> 137f863653f066361b4f19f867bbb109ffea9885
  @NotNull
  @Max(255)
  private String password;
  
}
