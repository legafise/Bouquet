package com.lashkevich.flowers.util.calculator;

import com.lashkevich.flowers.entity.Accessory;

import java.util.List;

public class AccessoryAmountCalculator {
    public static double calculateAccessoryAmount(List<Accessory> accessories) {
        double accessoryPriceCounter = 0;

        for (int i = 0; i < accessories.size(); i++) {
            accessoryPriceCounter += accessories.get(i).getPrice();
        }

        return accessoryPriceCounter;
    }
}
