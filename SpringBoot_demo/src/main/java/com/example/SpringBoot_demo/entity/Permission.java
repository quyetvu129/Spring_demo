package com.example.SpringBoot_demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Permission extends BaseEntity{
    @Column(name = "permissionname")
    private String permissionName;

    @Column(name = "permissionkey")
    private String permissionKey;
}
