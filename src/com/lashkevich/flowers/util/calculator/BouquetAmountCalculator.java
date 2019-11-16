package com.lashkevich.flowers.util.calculator;

import com.lashkevich.flowers.entity.Bouquet;

public class BouquetAmountCalculator {
    public static double calculateBouquetAmount(Bouquet bouquet) {
        double bouquetPrice = 0;

        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            bouquetPrice += GeneralFlowerAmountCalculator.calculateFlowerAmount(bouquet.getFlowers().get(i));
        }

        return bouquetPrice + AccessoryAmountCalculator.calculateAccessoryAmount(bouquet.getAccessories());
    }
}
