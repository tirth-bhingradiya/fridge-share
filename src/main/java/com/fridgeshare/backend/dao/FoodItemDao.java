package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemDao extends JpaRepository<FoodItem, Long> {

}
