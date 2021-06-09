package ru.ibs.trainee.spring.qualifier;

public class SomeComponent2Impl implements SomeComponent {

    public void init() {
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
