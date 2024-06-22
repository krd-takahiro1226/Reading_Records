package com.readrecords.backend.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "book_records")
public class BookRecords {
  @Id
  private String book_name;
  private String author;
  private String genre;
  private Date publication_year;
  private String publisher;

}
