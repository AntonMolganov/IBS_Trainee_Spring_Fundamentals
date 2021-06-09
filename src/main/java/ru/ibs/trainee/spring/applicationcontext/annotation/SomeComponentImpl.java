package ru.ibs.trainee.spring.applicationcontext.annotation;

import org.springframework.stereotype.Component;

@Component
public class SomeComponentImpl implements SomeComponent {
    public void init() {
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
