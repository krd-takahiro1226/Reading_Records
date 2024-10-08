package com.readrecords.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.readrecords.backend.entity.UserLogin;
import com.readrecords.backend.repository.UserLoginRepostoty;
import com.readrecords.backend.security.UserLoginDetails;

@Service
public class UserLoginDetailsService implements UserDetailsService{
  @Autowired
  UserLoginRepostoty userLoginRepostoty;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
    Optional<UserLogin> thisUser = userLoginRepostoty.findByUsername(username);
    return thisUser.map(user -> new UserLoginDetails(user))
    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
  }
}
