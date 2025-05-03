package com.fridgeshare.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role extends LongIdBaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "permissions")
    private String permissions;
}
