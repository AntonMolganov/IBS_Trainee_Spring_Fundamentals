package ru.ibs.trainee.spring.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping("/mvc")
public class Controller {

    @GetMapping("example")
    public String getExample() {
        return "example";
    }

    @GetMapping("add")
    public String getExample(@RequestParam Integer value, Model model) {
        EntryStorage.getEntries().add(new Entry(value));
        System.out.println("Added value="+value);
        return "example";
    }
}
