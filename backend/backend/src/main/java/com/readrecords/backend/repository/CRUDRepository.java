package com.readrecords.backend.repository;

import com.readrecords.backend.entity.ReadRecords;
import org.springframework.data.repository.CrudRepository;


public interface CRUDRepository extends CrudRepository<ReadRecords, Long> {
}
