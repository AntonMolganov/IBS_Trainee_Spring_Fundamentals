package ru.ibs.trainee.spring.mvc;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Student {

    private String name;
    private LocalDateTime creationTime;

    public Student(String name, LocalDateTime time) {
        this.name = name;
        this.creationTime = time;
    }
}
