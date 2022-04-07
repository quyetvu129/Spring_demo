package com.example.SpringBoot_demo.service.impl;

import com.example.SpringBoot_demo.entity.User;
import com.example.SpringBoot_demo.entity.UserPrincipal;
import com.example.SpringBoot_demo.repository.UserRepository;
import com.example.SpringBoot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();
        if (user != null) {
            Set<String> authorities = new HashSet<>();
            if (null != user.getRoles()) {
                user.getRoles().forEach( r -> {
                    authorities.add(r.getRoleKey());
                    r.getPermissions().forEach(p -> authorities.add(p.getPermissionKey()));
                        }
                );
            }
            userPrincipal.setUserId(user.getId());
            userPrincipal.setUsername(user.getUserName());
            userPrincipal.setPassword(user.getPassword());
            userPrincipal.setAuthorities(authorities);
        }

        return userPrincipal;
    }
}
