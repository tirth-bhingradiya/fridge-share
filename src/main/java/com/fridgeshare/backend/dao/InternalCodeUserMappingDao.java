package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.InternalCodeUserMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalCodeUserMappingDao extends JpaRepository<InternalCodeUserMapping, Long> {

}
