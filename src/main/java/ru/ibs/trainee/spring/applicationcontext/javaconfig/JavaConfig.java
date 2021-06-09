package ru.ibs.trainee.spring.applicationcontext.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public SomeComponent someComponent() {
        return new SomeComponentImpl();
    }
}
