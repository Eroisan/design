package com.demo.advance.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicSubject implements InvocationHandler {
    private Object sub;//局限掉了
    public DynamicSubject() {
    }

    public DynamicSubject(Object sub) {
        this.sub = sub;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do something before the function begin");
//        System.out.println(1);
//        sub.request();
//        System.out.println(2);
//        method.invoke(proxy,args);
//        System.out.println(3);
        method.invoke(sub,args);
        System.out.println("Do something when the function finished");
        return null;
    }
}
