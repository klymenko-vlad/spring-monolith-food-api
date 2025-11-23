package com.klymenko.foodapp.email_notification.services;

import com.klymenko.foodapp.email_notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO);
}
