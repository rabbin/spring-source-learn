package com.rabbin.ioc.beanlife;

public class BeanProperty {
    private String string;

    public BeanProperty() {
        this.string = "BeanProperty";
    }

    @Override
    public String toString() {
        return "BeanProperty{" +
                "string='" + string + '\'' +
                '}';
    }
}
