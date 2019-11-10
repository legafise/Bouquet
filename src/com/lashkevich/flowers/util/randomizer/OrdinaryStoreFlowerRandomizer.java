package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.*;
import com.lashkevich.flowers.util.generator.IdGenerator;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.util.generator.IdGenerator.*;
import static com.lashkevich.flowers.util.randomizer.AccessoryRandomizer.*;

public class OrdinaryStoreFlowerRandomizer {
    private static List<Color> color = new ArrayList<>();

    public static Flower generateRandomOrdinaryStoreFlower() {
        double randomHeight = DoubleRounding.round(7 + Math.random() * 13, 1);
        double randomPrice = DoubleRounding.round(1.5 + Math.random() * 2.5, 1);
        double randomFreshness = DoubleRounding.round(30 + Math.random() * 70, 1);
        OrdinaryStoreFlowersName storeFlower = OrdinaryStoreFlowersName.getRandomFlower();
        String name = storeFlower.getInfo();
        List<Color> randomColor = new ArrayList<>();

        if (storeFlower == OrdinaryStoreFlowersName.TULIP) {
            randomColor.add(Color.getRandomColor());
            color = randomColor;
        } else {
            for (int i = 0; i < 2; i++) {
                randomColor.add(Color.getRandomColor());
                color = randomColor;
            }
        }

        return (int) (Math.random() * 2) == 0 ?
                generateStoreFlower(generateFlowerId(), name, randomHeight, color, randomPrice, randomFreshness) :
                generateAccessoryStoreFlower(generateFlowerId(), name, randomHeight, color, randomPrice, randomFreshness, generateRandomAccessory());
    }

    private static StoreFlower generateStoreFlower(long id, String name, double height, List<Color> color, double price, double freshness) {
        return new StoreFlower(id, name, height, color, price, freshness);
    }

    private static StoreFlower generateAccessoryStoreFlower(long id, String name, double height, List<Color> color, double price, double freshness, List<Accessory> accessories) {
        return new StoreFlower(id, name, height, color, price, freshness, accessories);
    }


}
