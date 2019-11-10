package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.util.checker.SeedsChecker;

import java.util.List;

public class SummerFlower extends WildFlower {
    private boolean seeds;

    public SummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds) {
        super(id, name, height, color, freshness, placeGrow);
        this.seeds = seeds;
    }

    public SummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds, List<Accessory> accessories) {
        super(id, name, height, color, freshness, placeGrow, accessories);
        this.seeds = seeds;
    }

    public boolean isSeeds() {
        return seeds;
    }

    public void setSeeds(boolean seeds) {
        this.seeds = seeds;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + SeedsChecker.checkSeeds(seeds) + ")";
    }
}

