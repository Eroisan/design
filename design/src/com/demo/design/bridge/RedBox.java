package com.demo.design.bridge;

public class RedBox extends Box {
    public RedBox(Goods goods) {
        super(goods);
    }
    public void red(){
        System.out.println("TO RED");
    }

    @Override
    public void showExIntention() {
        this.red();
        super.showExIntention();
    }
}
