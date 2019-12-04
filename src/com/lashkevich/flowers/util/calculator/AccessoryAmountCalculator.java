package com.lashkevich.flowers.util.calculator;

import com.lashkevich.flowers.entity.Accessory;

import java.util.List;

public class AccessoryAmountCalculator {
    public static double calculateAccessoryAmount(List<Accessory> accessories) {
        double accessoriesPrice = 0;

        for (int i = 0; i < accessories.size(); i++) {
            accessoriesPrice += accessories.get(i).getPrice();
        }

        return accessoriesPrice;
    }
}
