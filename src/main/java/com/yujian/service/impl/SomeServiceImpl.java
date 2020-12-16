package com.yujian.service.impl;

import com.yujian.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl()方法");
    }
}
