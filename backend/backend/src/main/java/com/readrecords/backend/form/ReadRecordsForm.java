package com.readrecords.backend.form;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReadRecordsForm {
  @NotNull
  private String book_name;
  @NotNull
  private String author;
  // 日付として妥当かバリデーションを行いたいが、自作クラスが必要そうなので一旦先送り
  private Date start_date;
  private Integer read_count;
  private String genre;
  private Integer priority;
  @Max(100)
  private String memo;
}
