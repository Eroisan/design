package com.demo.design.bridge;

public abstract class Box {
    private Goods goods;
    public Box(Goods goods){
        this.goods=goods;
    }
    public void showExIntention(){
        this.goods.showIntention();
    }
}
