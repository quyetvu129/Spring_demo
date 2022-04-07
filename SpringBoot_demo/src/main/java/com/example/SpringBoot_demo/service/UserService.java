package com.example.SpringBoot_demo.service;

import com.example.SpringBoot_demo.entity.User;
import com.example.SpringBoot_demo.entity.UserPrincipal;

public interface UserService {
    User createUser(User user);

    UserPrincipal findByUsername(String username);
}
