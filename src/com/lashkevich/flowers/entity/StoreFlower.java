package com.lashkevich.flowers.entity;

import java.util.List;

public class StoreFlower extends Flower {
    private double price;

    public StoreFlower(long id, String name, double height, List<Color> color, double price, double freshness) {
        super(id, name, height, color, freshness);
        this.price = price;
    }

    public StoreFlower(long id, String name, double height, List<Color> color, double price, double freshness, List<Accessory> accessories) {
        super(id, name, height, color, freshness, accessories);
        this.price = price;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "; Цена цветка = " + price + "р";
    }
}
