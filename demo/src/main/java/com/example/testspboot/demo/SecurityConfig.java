package com.example.testspboot.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().permitAll()  // Allow everything else too (good for testing)
            )
            .csrf(csrf -> csrf.disable()) // Disable CSRF for H2 Console
            .headers(headers -> headers.frameOptions().disable()); // Allow frames for H2 Console

        return http.build();
    }
}
