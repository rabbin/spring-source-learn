package com.rabbin.beanlife;

import org.springframework.stereotype.Component;

@Component
public class BeanPropertyAutowired {
    private String string;

    public BeanPropertyAutowired() {
        this.string = "BeanPropertyAutowired";
    }

    @Override
    public String toString() {
        return "BeanPropertyAutowired{" +
                "string='" + string + '\'' +
                '}';
    }
}
