package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.Flower;

import static com.lashkevich.flowers.util.randomizer.GeneralStoreFlowerRandomizer.*;
import static com.lashkevich.flowers.util.randomizer.GeneralWildFlowerRandomizer.*;

public class GeneralFlowerRandomizer {
    public static Flower generateRandomFlower() {
        return (int) (Math.random() * 2) == 0 ? generateRandomStoreFlower() : generateRandomWildFlower();
    }
}
