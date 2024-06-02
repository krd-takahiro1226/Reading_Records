package com.readrecords.backend.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class UserLogin {
  @Id
  private Integer user_id;
  private String user_name;
  private String email;
  private String password;
  private List<String> role;
  private Date created_at;
  private Date updated_at;
}
