package ru.ibs.trainee.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeComponentImpl implements SomeComponent {

    @Autowired
    AnotherComponent anotherComponent;

    public void init() {
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
