package com.lashkevich.flowers.util.calculator;

import com.lashkevich.flowers.entity.Bouquet;

public class BouquetAmountCalculator {
    public static double calculateBouquetAmount(Bouquet bouquet) {
        double bouquetPriceCounter = 0;

        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            bouquetPriceCounter += GeneralFlowerAmountCalculator.calculateFlowerAmount(bouquet.getFlowers().get(i));
        }

        return bouquetPriceCounter + AccessoryAmountCalculator.calculateAccessoryAmount(bouquet.getAccessories());
    }
}
