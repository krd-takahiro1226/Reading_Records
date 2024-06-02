package com.readrecords.backend.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
  @Bean
  public SecurityFilterChain securityfilterChain(HttpSecurity http) throws Exception {
    // フォーム認証の設定記述
    http.formLogin(login -> login
      // ログイン画面のURL
      .loginPage("/login")
      // ユーザ名・パスワードの送信先URL
      .loginProcessingUrl("/login")
      // ログイン成功後の遷移先URL
      .defaultSuccessUrl("/")
      // ログイン失敗時の遷移先URL
      .failureUrl("/login?error")
      // ログインしていなくてもログイン画面へのアクセスを許可する
      .permitAll()
    )
    // ログアウトの設定記述
    .logout(logout -> logout
      // ログアウト後の遷移先URL
      .logoutSuccessUrl("/")
    )
    // URLごとの認可設定
      .authorizeHttpRequests(authz -> authz
      // 静的リソースへのアクセスでよく使われるURLはアクセス可能
      .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
      // "/"は全ユーザがアクセス可能
      .requestMatchers("/").permitAll()
      // generalはgeneralユーザがアクセス可能
      .requestMatchers("/general").hasRole("GENERAL")
      // adminはadminユーザがアクセス可能
      .requestMatchers("/admin").hasRole("ADMIN")
      // 上記で指定したURLを除く任意のURLは認証済みユーザがアクセス可能
      .anyRequest().authenticated()
    );
    return http.build();
  }
  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
