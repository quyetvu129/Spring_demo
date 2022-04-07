package com.example.SpringBoot_demo.repository;

import com.example.SpringBoot_demo.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

    @Query("SELECT n From NewEntity n WHERE n.title LIKE %?1% AND n.content LIKE %?2%")
    public List<NewEntity> findAll(String keyword);
}
