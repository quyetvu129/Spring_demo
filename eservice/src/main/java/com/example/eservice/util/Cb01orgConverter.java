package com.example.eservice.util;

import com.example.eservice.dto.Cb01OrgDTO;
import com.example.eservice.entity.Cb01OrgEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Cb01orgConverter {

    public Cb01OrgDTO toDto(Cb01OrgEntity entity) {
        Cb01OrgDTO dto = new Cb01OrgDTO();

        BeanUtils.copyProperties(entity,dto);

        return dto;
    }

    public Cb01OrgEntity toEntity(Cb01OrgDTO dto) {
        Cb01OrgEntity entity = new Cb01OrgEntity();

        BeanUtils.copyProperties(dto,entity);

        return entity;
    }

    public Cb01OrgDTO toDto(Optional<Cb01OrgEntity> entity) {
        Cb01OrgDTO dto = new Cb01OrgDTO();

        BeanUtils.copyProperties(entity.get(),dto);

        return dto;
    }


}
