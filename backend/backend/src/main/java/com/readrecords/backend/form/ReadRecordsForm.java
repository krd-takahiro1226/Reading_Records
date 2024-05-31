package com.readrecords.backend.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReadRecordsForm {
  @NotNull
  private String book_name;
  @NotNull
  private String author;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date start_date;
  private Integer read_count;
  private String genre;
  private Integer priority;
  @Max(100)
  private String memo;
}
