package com.lashkevich.flowers.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet extends Entity {
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public Bouquet(long id, List<Flower> flowers, List<Accessory> accessories) {
        super(id);
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public Bouquet(long id, List<Flower> flowers) {
        super(id);
        this.flowers = flowers;
        this.accessories = new ArrayList<>();
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
