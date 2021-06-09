package ru.ibs.trainee.spring.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component @Qualifier("name")
public class SomeComponent2Impl implements SomeComponent {

    public void init() {
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
