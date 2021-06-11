package ru.ibs.trainee.spring.mvc.json;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.ibs.trainee.spring.mvc.Student;
import ru.ibs.trainee.spring.mvc.StudentsStorage;

import java.time.LocalDateTime;
import java.util.Collections;

@RestController
@RequestMapping(value = "/rest")
public class SpringRestController {

    /*

            Работают такие запросы

            GET http://localhost:8080/spring/rest/show
            Content-Type: application/json
            Accept: application/json

            <> 2021-06-11T173524.200.json

            ###


            POST http://localhost:8080/spring/rest/add?name=Ivanov%20Ivan%20Ivanovitch
            Content-Type: application/json

            {"name":"New student"}

            <> 2021-06-11T172019.415.html

            ###



            POST http://localhost:8080/spring/rest/add
            Content-Type: application/json

            {"name":"Ivanov Ivan Ivanovitch"}

            ###
    * */

    @GetMapping(value = "show", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object showJson(@RequestParam(required = false) Integer id){
        return id == null
                ? Collections.unmodifiableList(StudentsStorage.getEntries())
                : Collections.singletonList(StudentsStorage.getEntries().get(id));
    }

    @PostMapping(value = "add", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addWithRequestParam(@RequestParam(name = "name", required = false) String name, @RequestBody(required = false) Student body) {
        if (name != null) {
            final Student student = new Student(name, LocalDateTime.now());
            StudentsStorage.getEntries().add(student);
            return student;
        }
        if (body != null && body.getName() != null && !body.getName().isEmpty() ) {
            body.setCreationTime(LocalDateTime.now());
            StudentsStorage.getEntries().add(body);
            return body;
        }
        return null;
    }
}
