package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
