package com.readrecords.backend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "read_records")
public class ReadRecords {
  @Id
  private Integer record_id;
  private String ISBN;
  private Integer user_id;
  private Date start_date;
  private Date end_date;
  private Integer read_count;
  private Integer priority;
  private String memo;
}
