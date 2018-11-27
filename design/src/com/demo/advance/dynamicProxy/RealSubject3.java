package com.demo.advance.dynamicProxy;

public class RealSubject3 implements Subject3{

    public RealSubject3() {
    }

    @Override
    public void request() {
        System.out.println("This is RealSubject3");
    }
}
