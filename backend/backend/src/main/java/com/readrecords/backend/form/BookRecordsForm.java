package com.readrecords.backend.form;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BookRecordsForm {
  @NotNull
  private String book_name;
  @NotNull
  private String author;
  private String genre;
  private Date publication_year;
  private String publisher;
}
