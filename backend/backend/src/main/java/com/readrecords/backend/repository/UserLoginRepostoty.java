package com.readrecords.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.readrecords.backend.entity.UserLogin;

@Repository
public interface UserLoginRepostoty extends CrudRepository<UserLogin, Integer> {
  @Modifying
  @Query(value = "select * from users" + "where username = :username", nativeQuery = true)
  Optional<UserLogin> findByUsername(@Param("username") String user_name);
}
