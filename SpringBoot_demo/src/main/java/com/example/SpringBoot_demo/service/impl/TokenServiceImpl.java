package com.example.SpringBoot_demo.service.impl;

import com.example.SpringBoot_demo.entity.Token;
import com.example.SpringBoot_demo.repository.TokenRepository;
import com.example.SpringBoot_demo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
