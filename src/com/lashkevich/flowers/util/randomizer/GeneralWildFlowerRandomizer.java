package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.Flower;

import static com.lashkevich.flowers.util.randomizer.SpringFlowerRandomizer.generateRandomSpringFlower;
import static com.lashkevich.flowers.util.randomizer.SummerFlowerRandomizer.generateRandomSummerFlower;

public class GeneralWildFlowerRandomizer {
    public static Flower generateRandomWildFlower() {
        return (int) (Math.random() * 2) == 0 ? generateRandomSpringFlower() : generateRandomSummerFlower();
    }
}
