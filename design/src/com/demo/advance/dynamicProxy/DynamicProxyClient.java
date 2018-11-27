package com.demo.advance.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyClient {
    public DynamicProxyClient(){

    }
   private Object doProxy(Object object){
        InvocationHandler invocationHandler=new DynamicSubject(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),invocationHandler);
    }
    public static void main(String[] args) {
//        RealSubject realSubject=new RealSubject();
//        DynamicProxyClient client=new DynamicProxyClient();
////        InvocationHandler dynamicSubject=new DynamicSubject(realSubject);
////        Subject subject= (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),dynamicSubject);
//        Subject subject= (Subject)client.doProxy(realSubject);
//        subject.request();

        RealSubject2 realSubject2=new RealSubject2();
//        DynamicProxyClient client2=new DynamicProxyClient();
        InvocationHandler dynamicSubject=new DynamicSubject(realSubject2);
        Subject subject2= (Subject)Proxy.newProxyInstance(realSubject2.getClass().getClassLoader(),realSubject2.getClass().getInterfaces(),dynamicSubject);
//        Subject2 subject2=(Subject2)client2.doProxy(realSubject2);
        subject2.request();

//                RealSubject3 realSubject3=new RealSubject3();
////        DynamicProxyClient client=new DynamicProxyClient();
////        InvocationHandler dynamicSubject=new DynamicSubject(realSubject);
////        Subject subject= (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),dynamicSubject);
//        Subject3 subject3= (Subject3)client.doProxy(realSubject3);
//        subject3.request();
    }
}
