package ru.ibs.trainee.spring.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/mvc")
public class Controller {

    @GetMapping("example")
    public String example() {
        return "example";
    }

}