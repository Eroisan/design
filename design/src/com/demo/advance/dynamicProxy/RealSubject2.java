package com.demo.advance.dynamicProxy;

public class RealSubject2 extends Subject2 {
    public RealSubject2(){
    }
    @Override
    public void request() {
        System.out.println("This is RealSubject2");
    }
}
