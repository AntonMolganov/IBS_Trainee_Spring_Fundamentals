package ru.ibs.trainee.spring.autowiring.candidatechoosing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrimaryQualifierByNameTestExample {

    //выберет primaryQualifierByNameTest1 т.к. @Qualifier отсутствует = будет выбирать по @Primary
    @Autowired
    private PrimaryQualifierByNameTest primaryQualifierByNameTest001;

    //выберет primaryQualifierByNameTest3 т.к. @Qualifier
    @Autowired
    @Qualifier("qqq")
    private PrimaryQualifierByNameTest primaryQualifierByNameTest002;

    //выберет primaryQualifierByNameTest1 т.к. @Qualifier отсутствует = будет выбирать по @Primary, но если бы @Primary не было то тут хотя бы не упал, т.к. заинжектил бы по соответствию имени переменной и имени бина
    @Autowired
    private PrimaryQualifierByNameTest primaryQualifierByNameTest2;

    //выберет primaryQualifierByNameTest2 т.к. имя бина будет значением в @Qualifier
    @Autowired
    @Qualifier("primaryQualifierByNameTest2")
    private PrimaryQualifierByNameTest primaryQualifierByNameTest003;

}
