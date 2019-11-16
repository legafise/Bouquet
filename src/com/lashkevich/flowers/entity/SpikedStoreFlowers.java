package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.util.checker.SpikesChecker;
import java.util.List;

public class SpikedStoreFlowers extends StoreFlower {
    private boolean hasSpikes;

    public SpikedStoreFlowers(long id, String name, double height, List<Color> color, double price, double freshness, boolean hasSpikes) {
        super(id, name, height, color, price, freshness);
        this.hasSpikes = hasSpikes;
    }

    public SpikedStoreFlowers(long id, String name, double height, List<Color> color, double price, double freshness, boolean hasSpikes, List<Accessory> accessories) {
        super(id, name, height, color, price, freshness, accessories);
        this.hasSpikes = hasSpikes;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + SpikesChecker.checkSpikes(hasSpikes) + ")";
    }
}
