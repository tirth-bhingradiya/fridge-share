package com.fridgeshare.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "requests")
@Data
public class Request extends LongIdBaseEntity{

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "message")
    private String message;

    @Column(name = "status")
    private String status;

    @Column(name = "requested_at")
    private Timestamp requestedAt;
}
