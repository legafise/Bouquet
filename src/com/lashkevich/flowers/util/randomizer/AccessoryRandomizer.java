package com.lashkevich.flowers.util.randomizer;

import com.lashkevich.flowers.entity.Accessory;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.List;

import static com.lashkevich.flowers.entity.AccessoryName.getRandomAccessoryName;
import static com.lashkevich.flowers.entity.Color.getRandomColor;
import static com.lashkevich.flowers.util.generator.IdGenerator.generateAccessoryId;

public class AccessoryRandomizer {
    public static List<Accessory> generateRandomAccessory() {
        List<Accessory> accessories = new ArrayList<>();
        for (int i = 0; i < ((int) (1 + Math.random() * 3)); i++) {
            double randomPrice = DoubleRounding.round(0.1 + Math.random() * 0.4, 1);

            accessories.add(new Accessory(generateAccessoryId(), getRandomAccessoryName(), getRandomColor(), randomPrice));
        }

        return accessories;
    }
}




