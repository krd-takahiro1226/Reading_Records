package com.readrecords.backend.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ReadRecords {
  private String book_name;
  private String author;
  private Date start_date;
  private Date end_date;
  private Integer read_count;
  private String genre;
  private Integer priority;
  private String memo;
}
