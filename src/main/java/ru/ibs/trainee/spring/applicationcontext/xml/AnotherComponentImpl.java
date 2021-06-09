package ru.ibs.trainee.spring.applicationcontext.xml;

public class AnotherComponentImpl implements AnotherComponent{
    
    private SomeComponent someComponent;

    public AnotherComponentImpl(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }

    private void init() {

        System.out.println(getClass()+ " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
