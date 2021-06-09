package ru.ibs.trainee.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class BadExampleBusinessLogicServiceImpl implements BusinessLogic{

    @Override

    public void businessMethod() throws InterruptedException {
        long start = System.currentTimeMillis();

        // do some logic
        Thread.sleep(100);

        long end = System.currentTimeMillis();
        System.out.println(getClass() + " " + "businessMethod took " + (end - start) + " ms");
    }
}
