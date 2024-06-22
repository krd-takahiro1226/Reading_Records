package com.readrecords.backend.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.readrecords.backend.entity.BookRecords;

@Repository
// 検索条件(and,orの組み合わせ)ごとに呼び出すメソッドが異なるためそれらに対応するメソッドを定義
public interface BookRecordsRepository extends CrudRepository<BookRecords, String> {
  @Modifying
  @Query(value="INSERT INTO book_records" + "VALUES(:ISBN, :book_name, :author, :genre, :publication_year, :publisher)",nativeQuery = true)
  void createReadRecords(@Param("ISBN") String ISBN
                        ,@Param("book_name") String book_name
                        ,@Param("author") String author
                        ,@Param("genre") String genre
                        ,@Param("publication_year") Date publication_year
                        ,@Param("publisher") String publisher);
  @Modifying
  @Query(value="select * from book_records" + "where book_name = :book_name",nativeQuery = true)
  Optional<BookRecords> findByBookname(@Param("book_name") String book_name);
  @Modifying
  @Query(value="select * from book_records" + "where author = :author",nativeQuery = true)
  Optional<BookRecords> findByAuthor(@Param ("author") String author);
  @Modifying
  @Query(value="select * from book_records" + "where book_name like :book_name",nativeQuery = true)
  Optional<BookRecords> findByPartialBookname(@Param("book_name") String book_name);
  @Modifying
  @Query(value="select * from book_records" + "where author like :author",nativeQuery = true)
  Optional<BookRecords> findByPartialAuthor(@Param("author") String author);
  @Modifying
  @Query(value="select * from book_records" + "where book_name = :book_name and author = :author",nativeQuery = true)
  Optional<BookRecords> findByBooknameAndAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from book_records" + "where book_name = :book_name and author like :author",nativeQuery = true)
  Optional<BookRecords> findByBooknameAndPartialAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from book_records" + "where book_name like :book_name and author = :author",nativeQuery = true)
  Optional<BookRecords> findByPartialBooknameAndAuthor(@Param("book_name") String book_name, @Param("author") String author);
  @Modifying
  @Query(value="select * from book_records" + "where book_name like :book_name and author like :author",nativeQuery = true)
  Optional<BookRecords> findByPartialBooknameAndPartialAuthor(@Param("book_name") String book_name, @Param("author") String author);
}
