package ru.ibs.trainee.spring.autowiring.candidatechoosing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryQualifierByNameTestJavaConfig {

    @Bean
    @Primary
    PrimaryQualifierByNameTest primaryQualifierByNameTest1() {
        return new PrimaryQualifierByNameTestImpl1();
    }

    @Bean
    PrimaryQualifierByNameTest primaryQualifierByNameTest2() {
        return new PrimaryQualifierByNameTestImpl2();
    }

    @Bean
    @Qualifier("qqq")
    PrimaryQualifierByNameTest primaryQualifierByNameTest3() {
        return new PrimaryQualifierByNameTestImpl3();
    }
}
