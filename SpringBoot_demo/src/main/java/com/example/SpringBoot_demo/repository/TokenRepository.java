package com.example.SpringBoot_demo.repository;

import com.example.SpringBoot_demo.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);
}
