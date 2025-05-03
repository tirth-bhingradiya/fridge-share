package com.fridgeshare.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user_details")
@Data
public class UserDetails extends LongIdBaseEntity {

    @Column(name = "7")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "address")
    private String address;
}
