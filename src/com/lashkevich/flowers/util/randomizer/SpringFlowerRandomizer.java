package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.*;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.entity.PlaceGrow.*;
import static com.lashkevich.flowers.util.generator.IdGenerator.*;
import static com.lashkevich.flowers.util.randomizer.AccessoryRandomizer.*;

public class SpringFlowerRandomizer {
    public static SpringFlower generateRandomSpringFlower() {
        double randomHeight = DoubleRounding.round(6 + Math.random() * 7, 1);
        int randomSeem = (int) (Math.random() * 2);
        SpringFlowersName springFlower = SpringFlowersName.getRandomFlower();
        String name = springFlower.getInfo();
        List<Color> color = new ArrayList<>();
        double randomFreshness = DoubleRounding.round(15 + Math.random() * 75, 1);

        color.add(Color.getRandomColor());

        boolean seem = randomSeem == 1;

        return (int) (Math.random() * 2) == 0 ?
                generateSpringFlower(generateFlowerId(), name, randomHeight, color, randomFreshness, getRandomPlaceGrow(), seem) :
                generateAccessorySpringFlower(generateFlowerId(), name, randomHeight, color, randomFreshness, getRandomPlaceGrow(), seem, generateRandomAccessory());
    }

    private static SpringFlower generateSpringFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean hasSeem) {
        return new SpringFlower(id, name, height, color, freshness, placeGrow, hasSeem);
    }

    private static SpringFlower generateAccessorySpringFlower(long id, String name, double height, List<Color> color, double freshness, PlaceGrow placeGrow, boolean hasSeem, List<Accessory> accessories) {
        return new SpringFlower(id, name, height, color, freshness, placeGrow, hasSeem, accessories);
    }
}
