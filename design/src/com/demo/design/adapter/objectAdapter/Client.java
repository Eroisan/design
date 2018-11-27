package com.demo.design.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        JapanTV japanTV=new JapanTV();
        ObjectAdapter objectAdapter=new ObjectAdapter(japanTV);
        objectAdapter.input220();

    }
}
