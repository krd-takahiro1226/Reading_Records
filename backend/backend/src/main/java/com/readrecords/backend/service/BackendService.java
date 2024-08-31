package com.readrecords.backend.service;

import java.util.List;

import com.readrecords.backend.entity.ReadRecords;

public interface BackendService {
  public List<ReadRecords> findAll();
}
