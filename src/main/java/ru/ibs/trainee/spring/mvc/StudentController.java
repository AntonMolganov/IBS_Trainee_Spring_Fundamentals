package ru.ibs.trainee.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/mvc")
public class StudentController {

    @PostConstruct
    private void postConstruct() {
        //проинициализируем хранилище добавив парочку студентов
        StudentsStorage.getEntries().add(new Student("Ivanov Ivan Ivanovitch", LocalDateTime.now()));
        StudentsStorage.getEntries().add(new Student("Smirnov Ivan Ivanovitch", LocalDateTime.now()));
    }

    //этот ендпоинт показывает вью добавления студентов
    @GetMapping("add")
    public String add() {
        return "add";
    }

    //сюда отправляем данные из формы с html, method = POST
    @PostMapping("add")
    public String postAdd(@RequestParam("name") String name, Model model) {
        if (name == null || name.isEmpty()) {
            model.addAttribute("addedText", "No empty name allowed");
        } else {
            model.addAttribute("addedText", "Student " + name + " added");
            StudentsStorage.getEntries().add(new Student(name, LocalDateTime.now()));
        }
        return "add";
    }

    // показывает студентов по урл вида http://localhost:8080/spring/mvc/show?id=1
    // без параметра показывает всех
    @GetMapping(value = {"show"})
    public String showWithRequestParam(@RequestParam(name = "id", required = false) Integer id, Model model){
        return show(id, model);
    }

    // показывает студентов по урл вида http://localhost:8080/spring/mvc/show/1
    // без параметра показывает всех
    @GetMapping(value = {"show/{id}"})
    public String showWithPathVariable(@PathVariable(name = "id", required = false) Integer id, Model model){
        return show(id, model);
    }

    public String show(Integer id, Model model){
        List<Student> values = id == null
                ? Collections.unmodifiableList(StudentsStorage.getEntries())
                : Collections.singletonList(StudentsStorage.getEntries().get(id));
        model.addAttribute("students", values);
        return "show";
    }
}
