package com.example.AttendanceEventConsumer.Model;

public enum EventType {
    SWIPE_IN ("SWIPE_IN"),
    SWIPE_OUT("SWIPE_OUT");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
