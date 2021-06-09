package ru.ibs.trainee.spring.factorybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherComponentImpl implements AnotherComponent {

    @Autowired
    private SomeComponent someComponent;

    @Override
    public void showClassData() {
        System.out.println("Content of bean " + this.getClass() + ": someComponent=" + someComponent);
    }
}
