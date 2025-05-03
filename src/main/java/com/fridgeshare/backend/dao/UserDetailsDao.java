package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsDao extends JpaRepository<UserDetails, Long> {

}
