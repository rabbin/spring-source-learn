package com.rabbin.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLife) {
            System.out.println("\n--MyBeanPostProcessor : postProcessBeforeInitialization: " + beanName);
            System.out.println(((BeanLife) bean).getBeanProperty());
            System.out.println(((BeanLife) bean).getBeanPropertySet());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLife) {
            System.out.println("\n初始化之后：");

            System.out.println("\n--MyBeanPostProcessor : postProcessAfterInitialization: " + beanName);
        }
        return bean;
    }
}
