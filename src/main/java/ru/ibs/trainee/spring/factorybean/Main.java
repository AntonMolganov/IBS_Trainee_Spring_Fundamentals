package ru.ibs.trainee.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factorybean-application-context.xml");


        AnotherComponent anotherComponent = applicationContext.getBean(AnotherComponent.class);
        anotherComponent.showClassData();

    }
}
