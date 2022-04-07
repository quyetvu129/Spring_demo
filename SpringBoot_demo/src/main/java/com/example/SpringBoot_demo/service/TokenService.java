package com.example.SpringBoot_demo.service;

import com.example.SpringBoot_demo.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
