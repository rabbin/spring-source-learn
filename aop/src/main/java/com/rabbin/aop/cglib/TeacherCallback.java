package com.rabbin.aop.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Objects;

public class TeacherCallback implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (Objects.equals("doing", method.getName())) {
            System.out.println("before doing!");
            methodProxy.invokeSuper(target, args);
            System.out.println("after doing!");
        }
        return null;
    }
}
