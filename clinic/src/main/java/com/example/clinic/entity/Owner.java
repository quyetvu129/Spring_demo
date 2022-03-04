package com.example.clinic.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "owner")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String name;

    @Column()
    private String email;

    @Column()
    private Integer phoneNumber;

    @OneToMany(mappedBy = "type")
    private List<Pet> pets = new ArrayList<Pet>();
}
