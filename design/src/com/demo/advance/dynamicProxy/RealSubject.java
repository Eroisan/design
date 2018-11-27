package com.demo.advance.dynamicProxy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class RealSubject implements Subject{

    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println("This is RealSubject");
    }
}
