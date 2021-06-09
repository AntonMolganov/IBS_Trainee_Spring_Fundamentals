package ru.ibs.trainee.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AnotherComponentImpl implements AnotherComponent {

    @Autowired @Qualifier("name")
    private SomeComponent someComponentImpl;


    // @Value берёт из resources/application.properties, который определён в хмл     <context:property-placeholder location="classpath:application.properties, classpath:test.properties"/>
    @Value("${param}")
    private String[] someParam;

    @PostConstruct
    private void postConstruct() {
        System.out.println(getClass() + " postConstruct");
    }

    private void init() {
        System.out.println(getClass()+ " init");
    }

    private void destroy() {
        System.out.println(getClass() + " destroy");
    }
}
