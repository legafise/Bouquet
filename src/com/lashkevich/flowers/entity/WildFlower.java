package com.lashkevich.flowers.entity;

import java.util.List;

public abstract class WildFlower extends Flower {
    private PlaceGrow placeGrow;

    public WildFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow) {
        super(id, name, height, color, freshness);
        this.placeGrow = placeGrow;
    }

    public WildFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, List<Accessory> accessories) {
        super(id, name, height, color, freshness, accessories);
        this.placeGrow = placeGrow;
    }

    public PlaceGrow getPlaceGrow() {
        return placeGrow;
    }

    public void setPlaceGrow(PlaceGrow placeGrow) {
        this.placeGrow = placeGrow;
    }

    @Override
    public String toString() {
        return super.toString() + "; Место где растет - " + placeGrow.getInfo();
    }
}
