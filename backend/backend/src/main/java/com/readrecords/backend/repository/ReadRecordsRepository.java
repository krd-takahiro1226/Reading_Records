package com.readrecords.backend.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.readrecords.backend.entity.ReadRecords;

@Repository
public interface ReadRecordsRepository extends CrudRepository<ReadRecords, Integer> {
  @Modifying
  @Query(value="INSERT INTO readrecords" + "VALUES(:ISBN, :user_id, :start_date, :end_date, :read_count, :priority, :memo)",nativeQuery = true)
  void createReadRecords(@Param("ISBN") String ISBN, 
                        @Param("user_id") String user_id, 
                        @Param("start_date") Date start_date, 
                        @Param("end_date") Date end_date, 
                        @Param("read_count") Integer read_count, 
                        @Param("priority") Integer priority, 
                        @Param("memo") String memo);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name = :book_name",nativeQuery = true)
  Optional<ReadRecords> findByBookname(@Param("book_name") String book_name);
  @Modifying
  @Query(value="select * from readrecords" + "where author = :author",nativeQuery = true)
  Optional<ReadRecords> findByAuthor(@Param ("author") String author);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name like :book_name",nativeQuery = true)
  Optional<ReadRecords> findByPartialBookname(@Param("book_name") String book_name);
  @Modifying
  @Query(value="select * from readrecords" + "where author like :author",nativeQuery = true)
  Optional<ReadRecords> findByPartialAuthor(@Param("author") String author);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name = :book_name and author = :author",nativeQuery = true)
  Optional<ReadRecords> findByBooknameAndAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name = :book_name and author like :author",nativeQuery = true)
  Optional<ReadRecords> findByBooknameAndPartialAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name like :book_name and author = :author",nativeQuery = true)
  Optional<ReadRecords> findByPartialBooknameAndAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from readrecords" + "where book_name like :book_name and author like :author",nativeQuery = true)
  Optional<ReadRecords> findByPartialBooknameAndPartialAuthor(@Param("book_name") String book_name, @Param("author") String author);
  // ISBNをカラムに追加したら実装するようにする
  // @Query("select * from readrecords where ISBN = :ISBN")
  // ptional<ReadRecords>  findByISBN(String ISBN);
}
