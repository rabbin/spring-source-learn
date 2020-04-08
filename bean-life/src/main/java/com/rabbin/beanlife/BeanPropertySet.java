package com.rabbin.beanlife;

public class BeanPropertySet {
    private String string;

    public BeanPropertySet() {
        this.string = "BeanPropertySet";
    }

    @Override
    public String toString() {
        return "BeanPropertySet{" +
                "string='" + string + '\'' +
                '}';
    }
}
