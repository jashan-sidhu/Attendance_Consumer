package com.example.AttendanceEventConsumer.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final JavaMailSender emailSender;

    public NotificationService(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Value("${spring.mail.username}")
    private String fromMail;
    public void processNotification(String message, String emailAddress) {
        //Logic for Message processing

        // Composing the email
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(fromMail);
        mailMessage.setTo(emailAddress);
        mailMessage.setSubject("Notification");
        mailMessage.setText(message);

        // Send the email
        emailSender.send(mailMessage);
    }
}
