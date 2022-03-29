package com.example.SpringBoot_demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "new")
public class NewEntity extends BaseEntity{

    @Column
    private String title;

    @Column
    private String thumbnail;

    @Column(name = "shortdescription")
    private String shortDescription;

    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

}
