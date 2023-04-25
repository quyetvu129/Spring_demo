package com.example.eservice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cb01OrgDetailDto {

    private Cb01OrgDTO cb01Org;

    private Cb01OrgDTO parentCompany;

    private List<Cb01OrgDTO> subsidiaryCompany;

    private List<Cb01OrgDTO> parentCompanyAvail;

    private List<Cb01OrgDTO> subCompanyAvail;

}
