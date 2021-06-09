package ru.ibs.trainee.spring.applicationcontext.xml;

public class SomeComponentImpl implements SomeComponent{

//    private AnotherComponent anotherComponent;

    public void init() {
        System.out.println(getClass() + " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
