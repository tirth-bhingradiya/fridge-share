package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestDao extends JpaRepository<Request, Long> {

}
