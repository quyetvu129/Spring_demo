package com.example.SpringBoot_demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column(name = "username")
    private String userName ;

    @Column
    private String password;

    @Column(name = "fullname")
    private String fullName;

    @Column
    private Integer status;

    @ManyToMany
    @JoinTable(name = "user_role",
          joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<RoleEntity> roles = new ArrayList<>();
}
