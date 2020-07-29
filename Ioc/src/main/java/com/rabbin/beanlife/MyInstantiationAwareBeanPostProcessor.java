package com.rabbin.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.util.Objects;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (Objects.equals(beanClass, BeanLife.class)) {
            System.out.println("\n实例化前：");
            System.out.println("\n--MyInstantiationAwareBeanPostProcessor : postProcessBeforeInitialization: " + beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLife) {
            System.out.println("\n--MyInstantiationAwareBeanPostProcessor : postProcessAfterInitialization: " + beanName);
            System.out.printf("bean name : %s\n", ((BeanLife) bean).getBeanName());
            System.out.println(((BeanLife) bean).getBeanProperty());
            System.out.println(((BeanLife) bean).getBeanProperty());
            System.out.println(((BeanLife) bean).getBeanPropertySet());
            System.out.println(((BeanLife) bean).getBeanPropertyAutowired());

            System.out.println("\n属性赋值之后：");
        }
        return true;
    }
}
