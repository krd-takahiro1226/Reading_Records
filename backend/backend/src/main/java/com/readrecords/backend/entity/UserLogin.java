package com.readrecords.backend.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "user_login")
public class UserLogin {
  @Id
  private Integer user_id;
<<<<<<< HEAD
  private String username;
=======
  private String user_name;
>>>>>>> 137f863653f066361b4f19f867bbb109ffea9885
  private String email;
  private String password;
  private List<String> role;
  private Date created_at;
  private Date updated_at;
}
