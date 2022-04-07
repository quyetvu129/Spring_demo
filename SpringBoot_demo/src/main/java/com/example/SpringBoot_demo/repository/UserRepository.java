package com.example.SpringBoot_demo.repository;

import com.example.SpringBoot_demo.entity.NewEntity;
import com.example.SpringBoot_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u From User u WHERE u.userName = ?1")
    public User findByUsername(String username);
}
