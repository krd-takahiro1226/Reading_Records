package com.readrecords.backend.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.readrecords.backend.entity.UserLogin;

public class UserLoginDetails implements UserDetails{
  private UserLogin userLogin;
  private Collection<? extends GrantedAuthority> authorities;
  public UserLoginDetails(UserLogin userLogin) {
    this.userLogin = userLogin;
    this.authorities = userLogin.getRole().stream().map(role -> new SimpleGrantedAuthority(role)).toList();
  }
  @Override
  public String getPassword() {
    return userLogin.getPassword();
  }
  @Override
  public String getUsername() {
<<<<<<< HEAD
    return userLogin.getUsername();
=======
    return userLogin.getUser_name();
>>>>>>> 137f863653f066361b4f19f867bbb109ffea9885
  }
  // アカウントの有効期限切れ(現時点では判定しない)
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }
  // アカウントのロック状態(現時点では判定しない)
  @Override
  public boolean isAccountNonLocked() {
    return true;
  }
  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }
  @Override
  public boolean isEnabled() {
    return true;
  }
  @Override
  public Collection<? extends GrantedAuthority>getAuthorities() {
    return authorities;
  }
}
