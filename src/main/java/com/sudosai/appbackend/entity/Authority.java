package com.sudosai.appbackend.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class Authority implements GrantedAuthority {
    @Id
    @SequenceGenerator(
            name = "user_id",
            sequenceName = "authority_id",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "authority_id",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;

    @Column(
            nullable = false,
            unique = true
    )
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

    public Authority() {
    }

    public Authority(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
