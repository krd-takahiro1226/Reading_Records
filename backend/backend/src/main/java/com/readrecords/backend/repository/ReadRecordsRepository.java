package com.readrecords.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.readrecords.backend.dto.UserReadRecordsDto;
import com.readrecords.backend.entity.ReadRecords;

@Repository
public interface ReadRecordsRepository extends CrudRepository<ReadRecords, Integer> {
  @Query(name = "UserReadRecordsDto.getReadRecordsByUserId", nativeQuery = true)
  List<UserReadRecordsDto> getReadRecordsByUserId(@Param("user_id") String user_id);
}
