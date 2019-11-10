package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.Flower;

import static com.lashkevich.flowers.util.randomizer.OrdinaryStoreFlowerRandomizer.*;
import static com.lashkevich.flowers.util.randomizer.SpikedStoreFlowerRandomizer.generateRandomSpikedStoreFlower;

public class GeneralStoreFlowerRandomizer {
    public static Flower generateRandomStoreFlower() {
        return (int) (Math.random() * 2) == 0 ? generateRandomSpikedStoreFlower() : generateRandomOrdinaryStoreFlower();
    }
}
