package com.klymenko.foodapp.email_notification.repository;

import com.klymenko.foodapp.email_notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
