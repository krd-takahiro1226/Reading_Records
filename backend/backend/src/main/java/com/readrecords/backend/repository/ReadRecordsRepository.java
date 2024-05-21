package com.readrecords.backend.repository;

import com.readrecords.backend.entity.ReadRecords;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadRecordsRepository extends CrudRepository<ReadRecords, Integer> {
}
