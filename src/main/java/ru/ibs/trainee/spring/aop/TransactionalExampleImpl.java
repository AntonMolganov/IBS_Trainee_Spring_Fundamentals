package ru.ibs.trainee.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionalExampleImpl {

    @Autowired
    private TransactionalExampleImpl transactionalExampleImpl;

    public void simpleMethod() {
        trMethod();
    }

    public void trMethod() {

    }
}
