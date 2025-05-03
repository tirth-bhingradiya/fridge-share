package com.fridgeshare.backend.dao;

import com.fridgeshare.backend.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface NotificationDao extends JpaRepository<Notification, Long> {

}
