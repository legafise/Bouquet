package com.lashkevich.flowers.util.checker;

import com.lashkevich.flowers.entity.Flower;
import com.lashkevich.flowers.entity.SpringFlower;
import com.lashkevich.flowers.util.randomizer.GeneralStoreFlowerRandomizer;

public class FlowersUnderSnowInBouquetChecker {
    public static Flower checkFlower(Flower flower) {
        if (flower instanceof SpringFlower) {
            SpringFlower springFlower = (SpringFlower) flower;
            if (springFlower.hasSeem()) {
                return springFlower;
            } else {
                return GeneralStoreFlowerRandomizer.generateRandomStoreFlower();
            }
        } else {
            return flower;
        }
    }
}
