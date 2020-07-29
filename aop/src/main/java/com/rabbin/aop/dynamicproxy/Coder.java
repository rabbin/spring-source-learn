package com.rabbin.aop.dynamicproxy;

public class Coder implements Job {
    @Override
    public void doing() {
        System.out.println("coding!");
    }
}
