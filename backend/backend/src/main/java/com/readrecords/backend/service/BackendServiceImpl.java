package com.readrecords.backend.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
    repository.createReadRecords(records.getBook_name(), 
                                records.getAuthor(), 
                                records.getStart_date() , 
                                0, 
                                records.getGenre(), 
                                records.getPriority(), 
                                records.getMemo());
  }
/**
 * @param records 更新後のレコード内容
 * @param book_id 更新対象のbook_id
*/
  @Override
  @Transactional
  public void updateReadRecordsByBookId(ReadRecords records, Integer book_id) {
    Optional<ReadRecords> previousRecord = repository.findById(book_id);
    if(previousRecord.isPresent()){
      repository.save(records);
    } 
  }

  @Override
  @Transactional
  public void deleteReadRecordsByBookId(Integer book_id) {
    repository.deleteById(book_id);
    
  } 

  @Override
  public Optional<ReadRecords> findByBookname(String book_name) {
    return repository.findByBookname(book_name);
  }

  @Override
  public Optional<ReadRecords> findByAuthor(String author) {
    return repository.findByAuthor(author);
  }
}
