package ru.ibs.trainee.spring.bfpp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AnotherComponentImpl implements AnotherComponent {

    @Autowired
    private SomeComponent someComponent;

    @PostConstruct
    private void postConstruct() {
        System.out.println(getClass() + " postConstruct");
    }

    private void init() {
        System.out.println(getClass()+ " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
