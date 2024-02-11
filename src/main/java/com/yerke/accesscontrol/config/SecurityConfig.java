package com.yerke.accesscontrol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http
                                .authorizeRequests(authorize -> authorize
                                                .antMatchers("/private-data").hasRole("ADMIN")
                                                .antMatchers("/public-data").authenticated()
                                                .anyRequest().authenticated())
                                .formLogin(login -> login
                                                .loginPage("/login.html") // изменяем страницу входа на /login.html
                                                .permitAll())
                                .logout(logout -> logout
                                                .logoutSuccessUrl("/login.html") // Указываем адрес, на который
                                                                                 // перенаправить после выхода
                                );
                return http.build();
        }
}
