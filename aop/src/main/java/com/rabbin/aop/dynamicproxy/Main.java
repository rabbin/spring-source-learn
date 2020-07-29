package com.rabbin.aop.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Job coder = (Job) Proxy.newProxyInstance(Job.class.getClassLoader(), new Class[]{Job.class}, new JobInvocationHandler(new Coder()));
        coder.doing();
    }
}
