package com.lashkevich.flowers.entity;

import java.util.List;

public abstract class WildFlower extends Flower {
    private PlaceGrow habitat;

    public WildFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow habitat) {
        super(id, name, height, color, freshness);
        this.habitat = habitat;
    }

    public WildFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow habitat, List<Accessory> accessories) {
        super(id, name, height, color, freshness, accessories);
        this.habitat = habitat;
    }

    public PlaceGrow getHabitat() {
        return habitat;
    }

    public void setHabitat(PlaceGrow habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "; Место где растет - " + habitat.getInfo();
    }
}
