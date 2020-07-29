package com.rabbin.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Teacher.class);
        enhancer.setCallback(new TeacherCallback());
        Teacher teacher = (Teacher) enhancer.create();
        teacher.doing();
    }
}
