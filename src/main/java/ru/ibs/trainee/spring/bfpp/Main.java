package ru.ibs.trainee.spring.bfpp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bfpp-application-context.xml");


    }
}
