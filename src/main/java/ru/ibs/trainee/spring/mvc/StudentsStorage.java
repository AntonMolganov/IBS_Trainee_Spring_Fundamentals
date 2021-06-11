package ru.ibs.trainee.spring.mvc;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentsStorage {

    private final static List<Student> entries = Collections.synchronizedList(new LinkedList<>());

    public static List<Student> getEntries() {
        return entries;
    }
}
