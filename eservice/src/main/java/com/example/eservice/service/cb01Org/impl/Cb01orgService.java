package com.example.eservice.service.cb01Org.impl;

import com.example.eservice.dto.Cb01OrgDTO;
import com.example.eservice.entity.Cb01OrgEntity;
import com.example.eservice.repository.Cb01orgRepository;
import com.example.eservice.service.cb01Org.ICb01OrgService;
import com.example.eservice.util.Cb01orgConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Cb01orgService implements ICb01OrgService {

    @Autowired
    private Cb01orgRepository cb01orgRepository;

    @Autowired
    private Cb01orgConverter cb01orgConverter;

    @Override
    public List<Cb01OrgDTO> getAll() {

        List<Cb01OrgEntity> listEntity = cb01orgRepository.findAll();

        List<Cb01OrgDTO> listDto = listEntity.stream().map(e -> {
            return cb01orgConverter.toDto(e);
        }).collect(Collectors.toList());

        return listDto;
    }
}
