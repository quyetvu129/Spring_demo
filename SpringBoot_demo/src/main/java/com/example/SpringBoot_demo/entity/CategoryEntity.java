package com.example.SpringBoot_demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity{

    @Column
    private String code;

    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<NewEntity> news = new ArrayList<>();
}
