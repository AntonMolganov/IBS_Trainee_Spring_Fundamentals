package ru.ibs.trainee.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ibs.trainee.spring.autowiring.candidatechoosing.PrimaryQualifierByNameTestExample;

public class Main {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring-application-context.xml");


        final PrimaryQualifierByNameTestExample primaryQualifierByNameTestExample = applicationContext.getBean(PrimaryQualifierByNameTestExample.class);

    }
}
