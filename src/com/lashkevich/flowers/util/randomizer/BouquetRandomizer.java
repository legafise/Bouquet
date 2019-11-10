package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.*;
import com.lashkevich.flowers.util.generator.IdGenerator;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.util.randomizer.AccessoryRandomizer.generateRandomAccessory;

public class BouquetRandomizer {
    public static Bouquet generateRandomBouquet() {
        List<Flower> flowers = new ArrayList<>();
        int numberFlowers = (int) (10 + Math.random() * 40);

        for (int i = 0; i < numberFlowers; i++) {
            Flower flower = GeneralFlowerRandomizer.generateRandomFlower();

            if (flower instanceof SpringFlower) {
                SpringFlower springFlower = (SpringFlower) flower;
                if (springFlower.hasSeem()) {
                    flowers.add(springFlower);
                } else {
                    flowers.add(GeneralStoreFlowerRandomizer.generateRandomStoreFlower());
                }
            } else {
                flowers.add(flower);
            }
        }

        return (int) (Math.random() * 2) == 0 ? generateBouquet(IdGenerator.generateBouquetId(), flowers) :
                generateAccessoryBouquet(IdGenerator.generateBouquetId(), flowers, generateRandomAccessory());
    }

    private static Bouquet generateBouquet(long id, List<Flower> flowers) {
        return new Bouquet(id, flowers);
    }

    private static Bouquet generateAccessoryBouquet(long id, List<Flower> flowers, List<Accessory> accessories) {
        return new Bouquet(id, flowers, accessories);
    }
}
