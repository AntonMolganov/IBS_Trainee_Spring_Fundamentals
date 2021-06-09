package ru.ibs.trainee.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class AnotherComponentImpl implements AnotherComponent {

    @Autowired
    public SomeComponent someComponent1;
}
