package com.readrecords.backend.service;

import java.util.List;

import com.readrecords.backend.dto.UserReadRecordsDto;

public interface ReadRecordsService {
  public List<UserReadRecordsDto> getReadRecordsByUserId(String user_id);
} 
