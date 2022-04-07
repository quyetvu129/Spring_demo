package com.example.SpringBoot_demo.service;

import com.example.SpringBoot_demo.dto.NewDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface INewService {
    NewDTO save(NewDTO newDTO);

    List<NewDTO> findAll(Pageable pageable);
    int totalItem();

    List<NewDTO> findAll(String keyword);
}
