package ru.ibs.trainee.spring.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BFPP implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        final String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();

        Arrays.asList(beanDefinitionNames).forEach(beanDefinitionName -> {
            final BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            // тут что-то можно сделать с beanDefinition
        });

    }
}
