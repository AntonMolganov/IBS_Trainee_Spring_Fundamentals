package ru.ibs.trainee.spring.mvc;

import java.util.LinkedList;
import java.util.List;

public class EntryStorage {

    private final static List<Entry> entries = new LinkedList<>();

    public static List<Entry> getEntries() {
        return entries;
    }
}
