package com.readrecords.backend.service;

import java.util.List;
import java.util.Optional;

import com.readrecords.backend.entity.ReadRecords;

public interface BackendService {
  public List<ReadRecords> findAll();
  // ISBNをカラムに追加したら実装するようにする
  // public Optional<ReadRecords>  findByISBN(String ISBN);
}
