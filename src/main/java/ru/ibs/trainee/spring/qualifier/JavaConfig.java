package ru.ibs.trainee.spring.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    public AnotherComponent anotherComponent() {
        return new AnotherComponentImpl();
    }

    @Bean
    public SomeComponent someComponent1() {
        return new SomeComponentImpl();
    }

    @Bean SomeComponent someComponent2() {
        return new SomeComponent2Impl();
    }

}
