package com.readrecords.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.readrecords.backend.entity.ReadRecords;

@Repository
public interface ReadRecordsRepository extends CrudRepository<ReadRecords, Integer> {
  @Modifying
  @Query("select * from readrecords where book_name = :book_name")
  Optional<ReadRecords> findByBookname(String book_name);
  @Modifying
  @Query("select * from readrecords where author = :author")
  Optional<ReadRecords> findByAuthor(String author);
  // ISBNをカラムに追加したら実装するようにする
  // @Query("select * from readrecords where ISBN = :ISBN")
  // ptional<ReadRecords>  findByISBN(String ISBN);
}
