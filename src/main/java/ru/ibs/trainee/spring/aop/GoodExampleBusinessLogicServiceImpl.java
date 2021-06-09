package ru.ibs.trainee.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class GoodExampleBusinessLogicServiceImpl implements BusinessLogic{

    @Override
    @LogExecutionTime
    public void businessMethod() throws InterruptedException {
        // do some logic
        Thread.sleep(100);
    }
}
