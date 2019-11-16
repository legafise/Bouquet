package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.util.checker.SeedsChecker;

import java.util.List;

public class SummerFlower extends WildFlower {
    private boolean hasSeeds;

    public SummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds) {
        super(id, name, height, color, freshness, placeGrow);
        this.hasSeeds = seeds;
    }

    public SummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds, List<Accessory> accessories) {
        super(id, name, height, color, freshness, placeGrow, accessories);
        this.hasSeeds = seeds;
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public void setSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + SeedsChecker.checkSeeds(hasSeeds) + ")";
    }
}

