package com.readrecords.backend.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.ReadRecords;
import com.readrecords.backend.repository.ReadRecordsRepository;

import jakarta.transaction.Transactional;

@Service
public class BackendServiceImpl implements BackendService{
  @Autowired
  ReadRecordsRepository repository;
  @Override
  public List<ReadRecords> findAll(){
    Iterator<ReadRecords> iterator = repository.findAll().iterator();
    List<ReadRecords> AllReadRecords= new ArrayList<>();
    while(iterator.hasNext()){
      ReadRecords readRecords = iterator.next();
      AllReadRecords.add(readRecords);
    }
    return AllReadRecords;
  }
  @Override
  @Transactional
  public void createReadRecords(ReadRecords records) {
    // TODO Auto-generated method stub
    
  }
}
