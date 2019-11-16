package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.Accessory;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.entity.AccessoryName.getRandomAccessoryName;
import static com.lashkevich.flowers.entity.Color.getRandomColor;
import static com.lashkevich.flowers.util.generator.IdGenerator.generateAccessoryId;
import static com.lashkevich.flowers.util.rounding.DoubleRounding.round;

public class AccessoryRandomizer {
    public static List<Accessory> generateRandomAccessory() {
        List<Accessory> accessories = new ArrayList<>();
        for (int i = 0; i < ((int) (1 + Math.random() * 3)); i++) {
            accessories.add(new Accessory(generateAccessoryId(), getRandomAccessoryName(), getRandomColor(), round(0.1 + Math.random() * 0.4, 1)));
        }

        return accessories;
    }
}




