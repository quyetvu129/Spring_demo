package com.example.eservice.service.cb01Org.impl;

import com.example.eservice.dto.Cb01OrgDTO;
import com.example.eservice.dto.Cb01OrgDetailDto;
import com.example.eservice.entity.Cb01OrgEntity;
import com.example.eservice.repository.Cb01orgRepository;
import com.example.eservice.service.cb01Org.ICb01OrgService;
import com.example.eservice.util.Cb01orgConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    @Override
    public List<Cb01OrgDTO> getByConditions(Long idType, Long orgId, String irgScreenNm) {
        List<Cb01OrgEntity> listEntity = cb01orgRepository.getByConditions(idType, orgId, irgScreenNm);

        return listEntity.stream().map(x -> {
            return cb01orgConverter.toDto(x);
        }).collect(Collectors.toList());
    }

    @Override
    public Cb01OrgDetailDto getCb01orgToUpdate(Long orgId) {
        Optional<Cb01OrgEntity> cb01OrgEntity = cb01orgRepository.findByOrgId(orgId);

        Cb01OrgEntity parentCompany = cb01orgRepository.getParent(cb01OrgEntity.get().getParentOrgKey());

        List<Cb01OrgEntity> parentCompanyAvail = cb01orgRepository.getParentAvail(parentCompany.getParentOrgKey());

        List<Cb01OrgEntity> subCompanyAvail = cb01orgRepository.getSubsidiaryAvail(orgId);

        List<Cb01OrgEntity> subCompany = cb01orgRepository.getSubsidiary(orgId);


        Cb01OrgDetailDto dto = new Cb01OrgDetailDto();
        dto.setCb01Org(cb01orgConverter.toDto(cb01OrgEntity));
        dto.setParentCompany(cb01orgConverter.toDto(parentCompany));
        dto.setParentCompanyAvail(parentCompanyAvail.stream().map(x -> {
            return cb01orgConverter.toDto(x);
        }).collect(Collectors.toList()));
        dto.setSubsidiaryCompany(subCompany.stream().map(x -> {
            return cb01orgConverter.toDto(x);
        }).collect(Collectors.toList()));
        dto.setSubCompanyAvail(subCompanyAvail.stream().map(x -> {
            return cb01orgConverter.toDto(x);
        }).collect(Collectors.toList()));

        return dto;
    }

    @Override
    public Cb01OrgDetailDto updateCb01Org(Cb01OrgDetailDto dto) {
        Cb01OrgEntity cb01OrgEntity = cb01orgConverter.toEntity(dto.getCb01Org());

        Cb01OrgEntity parentCompany = cb01orgConverter.toEntity(dto.getParentCompany());

        List<Cb01OrgEntity> subCompany = dto.getSubsidiaryCompany().stream().map(x -> {
            return cb01orgConverter.toEntity(x);
        }).collect(Collectors.toList());

        if (!cb01orgRepository.findByOrgId(cb01OrgEntity.getOrgId()).isPresent()) {
            System.out.println("error");
        }

        cb01orgRepository.save(cb01OrgEntity);

        return null;
    }


}
