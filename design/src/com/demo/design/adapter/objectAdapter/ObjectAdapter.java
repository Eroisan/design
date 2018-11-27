package com.demo.design.adapter.objectAdapter;

public class ObjectAdapter implements ChinaElectricEquipment {
    private JapanElectricEquipment japanElectricEquipment;
    public ObjectAdapter(){
    }

    public ObjectAdapter(JapanElectricEquipment japanElectricEquipment){
        this.japanElectricEquipment=japanElectricEquipment;
    }
    @Override
    public void input220() {
        System.out.println("220V TO 110V");
        this.japanElectricEquipment.input110();
    }
}
