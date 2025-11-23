package com.klymenko.foodapp;

import com.klymenko.foodapp.email_notification.dtos.NotificationDTO;
import com.klymenko.foodapp.email_notification.services.NotificationService;
import com.klymenko.foodapp.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class FoodappApplication {

    private final NotificationService notificationService;

    public static void main(String[] args) {
        SpringApplication.run(FoodappApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//            NotificationDTO notificationDTO = NotificationDTO.builder()
//                    .recipient("gamotrick@gmail.com")
//                    .subject("Hello Dennis")
//                    .body("Hey this is a test email")
//                    .type(NotificationType.EMAIL)
//                    .build();
//
//            notificationService.sendEmail(notificationDTO);
//        };
//    }

}
