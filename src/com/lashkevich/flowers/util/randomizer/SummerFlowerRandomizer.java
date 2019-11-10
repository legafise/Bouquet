package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.*;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.entity.PlaceGrow.getRandomPlaceGrow;
import static com.lashkevich.flowers.util.generator.IdGenerator.generateFlowerId;
import static com.lashkevich.flowers.util.randomizer.AccessoryRandomizer.generateRandomAccessory;

public class SummerFlowerRandomizer {
    static double height;

    public static Flower generateRandomSummerFlower() {
        int randomSeeds = (int) (Math.random() * 2);
        SummerFlowersName summerFlower = SummerFlowersName.getRandomFlower();
        String name = summerFlower.getInfo();
        List<Color> color = new ArrayList<>();
        double randomFreshness = DoubleRounding.round(10 + Math.random() * 90, 1);

        color.add(Color.getRandomColor());

        if(summerFlower == SummerFlowersName.SUNFLOWER) {
            height = DoubleRounding.round(10 + Math.random() * 50, 1);
        } else {
            height = DoubleRounding.round(5 + Math.random() * 20, 1);
        }

        boolean seeds = randomSeeds == 1;

        return (int) (Math.random() * 2) == 0 ? generateSummerFlower(generateFlowerId(), name, height, color, randomFreshness, getRandomPlaceGrow(), seeds) :
                generateAccessorySummerFlower(generateFlowerId(), name, height, color, randomFreshness, getRandomPlaceGrow(), seeds, generateRandomAccessory());
    }

    private static SummerFlower generateSummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds) {
        return new SummerFlower(id, name, height, color, freshness, placeGrow, seeds);
    }

    private static SummerFlower generateAccessorySummerFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean seeds, List<Accessory> accessories) {
        return new SummerFlower(id, name, height, color, freshness, placeGrow, seeds, accessories);
    }
}
