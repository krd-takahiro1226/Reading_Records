package com.readrecords.backend.service;

import java.util.List;
import java.util.Optional;

import com.readrecords.backend.entity.ReadRecords;

public interface BackendService {
  public List<ReadRecords> findAll();
  void createReadRecords(ReadRecords records);
  void updateReadRecordsByBookId(ReadRecords records, Integer book_id);
  void deleteReadRecordsByBookId (Integer book_id);
  public Optional<ReadRecords> findByBookname(String book_name);
  public Optional<ReadRecords> findByAuthor(String author);
  public Optional<ReadRecords> findByPartialBookname(String book_name);
  public Optional<ReadRecords> findByPartialAuthor(String author);
  public Optional<ReadRecords> findByBooknameAndAuthor(String book_name, String author);
  public Optional<ReadRecords> findByPartialBooknameAndAuthor(String book_name, String author);
  public Optional<ReadRecords> findByBooknameAndPartialAuthor(String book_name, String author);
  public Optional<ReadRecords> findByPartialBooknameAndPartialAuthor(String book_name, String author);
  // ISBNをカラムに追加したら実装するようにする
  // public Optional<ReadRecords>  findByISBN(String ISBN);
}
