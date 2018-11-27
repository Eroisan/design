package com.demo.design.bridge;

public class Client {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        Box box=new RedBox(iphone);
        box.showExIntention();
    }



}
