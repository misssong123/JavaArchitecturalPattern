package com.qust.proxy.cglib;

public class TeacherDAO {
    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }
}
