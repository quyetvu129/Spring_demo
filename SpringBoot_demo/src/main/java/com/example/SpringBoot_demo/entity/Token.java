package com.example.SpringBoot_demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class Token extends BaseEntity{
    @Column(length = 1000)
    private String token;

    @Column
    private Date tokenExpDate;
}
