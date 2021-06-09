package ru.ibs.trainee.spring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.trainee.spring.qualifier");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
    }
}
