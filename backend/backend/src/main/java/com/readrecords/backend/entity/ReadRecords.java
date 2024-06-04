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
  // 将来的にISBNを主キーとするが、一旦今は書籍名を主キーとする
  // ISBNを主キーとする場合は、新しくEntityクラスに追加して差し替える形がいいか、今のを修正するのがいいかは要検討
  @Id
  private Integer book_id;
  private String book_name;
  private String author;
  private Integer user_id;
  private Date start_date;
  private Date end_date;
  private Integer read_count;
  private String genre;
  private Integer priority;
  private String memo;
}
