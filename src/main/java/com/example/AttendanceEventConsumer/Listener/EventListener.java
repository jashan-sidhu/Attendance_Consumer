package com.example.AttendanceEventConsumer.Listener;

import com.example.AttendanceEventConsumer.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    private final NotificationService notificationService;

    @Autowired
    public EventListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    @KafkaListener(topics = "attendance-events", groupId = "group-id")
    public void listen(String message) {
//        String emailAddress = "example@example.com";
//        notificationService.processNotification(message, emailAddress);

        System.out.println("Received Message in group-id: " + message);
    }
}