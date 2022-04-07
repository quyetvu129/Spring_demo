package com.example.SpringBoot_demo.converter;

import com.example.SpringBoot_demo.dto.NewDTO;
import com.example.SpringBoot_demo.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    public NewEntity toEntity(NewDTO newDTO) {
        NewEntity newEntity = new NewEntity();
        newEntity.setTitle(newDTO.getTitle());
        newEntity.setContent(newDTO.getTitle());
        newEntity.setShortDescription(newDTO.getShortDescription());
        newEntity.setThumbnail(newDTO.getThumbnail());
        return newEntity;
    }

    public NewEntity toEntity(NewDTO dto, NewEntity entity) {
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        entity.setThumbnail(dto.getThumbnail());
        return entity;
    }

    public NewDTO toDTO(NewEntity entity) {
        NewDTO dto = new NewDTO();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        dto.setThumbnail(entity.getThumbnail());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setModifiedDate(entity.getModifiedDate());
        dto.setModifiedBy(entity.getModifiedBy());
        return dto;
    }
}
