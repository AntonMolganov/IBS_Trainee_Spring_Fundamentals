package ru.ibs.trainee.spring.mvc;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")        // для того чтобы ObjectMapper красиво сериализовал LocalDateTime
    private LocalDateTime creationTime;
}
