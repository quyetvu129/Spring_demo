package com.example.SpringBoot_demo.service.impl;

import com.example.SpringBoot_demo.converter.NewConverter;
import com.example.SpringBoot_demo.dto.NewDTO;
import com.example.SpringBoot_demo.entity.CategoryEntity;
import com.example.SpringBoot_demo.entity.NewEntity;
import com.example.SpringBoot_demo.repository.CategoryRepository;
import com.example.SpringBoot_demo.repository.NewRepository;
import com.example.SpringBoot_demo.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewService implements INewService {

    @Autowired
    private NewRepository newRepository;

    @Autowired
    private NewConverter newConverter;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public NewDTO save(NewDTO newDTO) {
        NewEntity newEntity = new NewEntity();
        if (newDTO.getId() != null) {
            NewEntity oldNewEntity = newRepository.getOne(newDTO.getId());
            newEntity = newConverter.toEntity(newDTO, oldNewEntity);
        } else {
            newEntity = newConverter.toEntity(newDTO);
        }
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        newEntity.setCategory(categoryEntity);
        newEntity = newRepository.save(newEntity);

        return newConverter.toDTO(newEntity);
    }

    @Override
    public List<NewDTO> findAll(Pageable pageable) {
        List<NewDTO> result = new ArrayList<>();
        List<NewEntity> entities = newRepository.findAll(pageable).getContent();
        for (NewEntity item: entities) {
            NewDTO newDTO = newConverter.toDTO(item);
            result.add(newDTO);
        }
        return result;
    }

    @Override
    public int totalItem() {
        return (int) newRepository.count();
    }

    @Override
    public List<NewDTO> findAll(String keyword) {
        List<NewDTO> result = new ArrayList<>();
        List<NewEntity> entities = newRepository.findAll(keyword);
        for (NewEntity item: entities) {
            NewDTO newDTO = newConverter.toDTO(item);
            result.add(newDTO);
        }

        return result;
    }


}
