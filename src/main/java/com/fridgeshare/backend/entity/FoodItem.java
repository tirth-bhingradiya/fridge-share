package com.fridgeshare.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "food_items")
@Data
public class FoodItem extends LongIdBaseEntity {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "pickup_location")
    private String pickupLocation;

    @Column(name = "available_from")
    private Date availableFrom;

    @Column(name = "available_until")
    private Date availableUntil;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "status")
    private String status;
}
