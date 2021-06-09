package ru.ibs.trainee.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ru.ibs.trainee.spring.aop");

        BusinessLogic badService = (BusinessLogic) applicationContext.getBean("badExampleBusinessLogicServiceImpl");

        badService.businessMethod();

        BusinessLogic goodService = (BusinessLogic) applicationContext.getBean("goodExampleBusinessLogicServiceImpl");
        goodService.businessMethod();
    }
}
