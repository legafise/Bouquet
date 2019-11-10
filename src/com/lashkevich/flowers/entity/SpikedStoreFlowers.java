package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.util.checker.SpikesChecker;
import java.util.List;

public class SpikedStoreFlowers extends StoreFlower {
    private boolean spikes;

    public SpikedStoreFlowers(long id, String name, double height, List<Color> color, double price, double freshness, boolean spikes) {
        super(id, name, height, color, price, freshness);
        this.spikes = spikes;
    }

    public SpikedStoreFlowers(long id, String name, double height, List<Color> color, double price, double freshness, boolean spikes, List<Accessory> accessories) {
        super(id, name, height, color, price, freshness, accessories);
        this.spikes = spikes;
    }

    public boolean isSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + SpikesChecker.checkSpikes(spikes) + ")";
    }
}
