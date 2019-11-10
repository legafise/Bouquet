package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.util.checker.SeemChecker;

import java.util.List;

public class SpringFlower extends WildFlower {
    private boolean hasSeem;

    public SpringFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean hasSeem) {
        super(id, name, height, color, freshness, placeGrow);
        this.hasSeem = hasSeem;
    }

    public SpringFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean hasSeem, List<Accessory> accessories) {
        super(id, name, height, color, freshness, placeGrow, accessories);
        this.hasSeem = hasSeem;
    }

    public boolean hasSeem() {
        return hasSeem;
    }

    public void setHasSeem(boolean hasSeem) {
        this.hasSeem = hasSeem;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + SeemChecker.checkSeem(hasSeem) + ")";
    }
}
