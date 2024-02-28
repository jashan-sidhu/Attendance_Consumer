package com.example.AttendanceEventConsumer.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class AttendanceEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Long employeeId;
    private String employeeName;
    private LocalDateTime timestamp;

    @Enumerated(EnumType.STRING)
    private EventType eventType;
}
