package com.readrecords.backend.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readrecords.backend.dto.UserReadRecordsDto;
import com.readrecords.backend.repository.ReadRecordsRepository;

@Service
public class ReadRecordsServiceImpl implements ReadRecordsService{
  @Autowired
  ReadRecordsRepository readRecordsRepository;
  @Override
  public List<UserReadRecordsDto> getReadRecordsByUserId(String user_id) {
    Iterator <UserReadRecordsDto> iterator = readRecordsRepository.getReadRecordsByUserId(user_id).iterator();
    List<UserReadRecordsDto> userReadRecords = new ArrayList<>();
    while(iterator.hasNext()){
      UserReadRecordsDto userReadRecord = iterator.next();
      userReadRecords.add(userReadRecord);
    }
    return userReadRecords;
  }
}
