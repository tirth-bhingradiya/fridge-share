package com.fridgeshare.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "internal_code_user_mapping")
@Data
public class InternalCodeUserMapping extends LongIdBaseEntity{

    @Column(name = "internal_code")
    private String internalCode;

    @Column(name = "status")
    private String status;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_token")
    private String userToken;

    @Column(name = "token_expiration")
    private Timestamp tokenExpiration;
}
