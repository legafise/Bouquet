package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.*;
import com.lashkevich.flowers.util.generator.IdGenerator;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.util.generator.IdGenerator.*;
import static com.lashkevich.flowers.util.randomizer.AccessoryRandomizer.*;

public class SpikedStoreFlowerRandomizer {
    public static Flower generateRandomSpikedStoreFlower() {
        double randomHeight = DoubleRounding.round(6 + Math.random() * 14, 1);
        double randomPrice = DoubleRounding.round(1 + Math.random() * 2.5, 1);
        double randomFreshness = DoubleRounding.round(20 + Math.random() * 80, 1);
        String name = SpikedStoreFlowersName.getRandomFlower().getInfo();
        List<Color> color = new ArrayList<>();

        boolean spikes = ((int) (Math.random() * 2)) == 1;

        color.add(Color.getRandomColor());

        return (int) (Math.random() * 2) == 0 ?
                generateSpikedStoreFlower(generateFlowerId(), name, randomHeight, color, randomPrice, randomFreshness, spikes) :
                generateAccessorySpikedStoreFlower(generateFlowerId(), name, randomHeight, color, randomPrice, randomFreshness, spikes);
    }

    private static SpikedStoreFlowers generateSpikedStoreFlower(long id, String name, double height, List<Color> color, double price, double freshness, boolean spikes) {
        return new SpikedStoreFlowers(id, name, height, color, price, freshness, spikes);
    }

    private static SpikedStoreFlowers generateAccessorySpikedStoreFlower(long id, String name, double height, List<Color> color, double price, double freshness, boolean spikes) {
        return new SpikedStoreFlowers(id, name, height, color, price, freshness, spikes, generateRandomAccessory());
    }
}

