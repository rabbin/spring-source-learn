package com.rabbin.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

public class JobInvocationHandler implements InvocationHandler {
    private final Object target;

    public JobInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Objects.equals("doing", method.getName())) {
            System.out.println("before doing!");
            method.invoke(target, args);
            System.out.println("after doing!");
        }
        return null;
    }
}
