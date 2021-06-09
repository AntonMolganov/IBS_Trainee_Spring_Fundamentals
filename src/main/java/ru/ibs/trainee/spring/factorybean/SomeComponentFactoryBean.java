package ru.ibs.trainee.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class SomeComponentFactoryBean implements FactoryBean<SomeComponent> {

    @Override
    public SomeComponent getObject() throws Exception {
        final SomeComponent someComponent = new SomeComponentImpl();
        // тут можно настроить наш созданный бин
        return someComponent;
    }

    @Override
    public Class<?> getObjectType() {
        return SomeComponentImpl.class;
    }
}