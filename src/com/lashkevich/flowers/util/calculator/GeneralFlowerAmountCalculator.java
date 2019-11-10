package com.lashkevich.flowers.util.calculator;

import com.lashkevich.flowers.entity.Flower;
import com.lashkevich.flowers.entity.StoreFlower;
import com.lashkevich.flowers.entity.WildFlower;

import static com.lashkevich.flowers.util.calculator.AccessoryAmountCalculator.*;

public class GeneralFlowerAmountCalculator {
    public static double calculateFlowerAmount(Flower flower) {
        if (flower instanceof StoreFlower) {
            return calculateStoreFlowerAmount((StoreFlower) flower);
        } else {
            return calculateWildFlowerAmount((WildFlower) flower);
        }
    }

    private static double calculateStoreFlowerAmount(StoreFlower flower) {
        return flower.getAccessories().isEmpty() ? flower.getPrice() : calculateAccessoryAmount(flower.getAccessories()) + flower.getPrice();
    }


    private static double calculateWildFlowerAmount(WildFlower flower) {
        return flower.getAccessories().isEmpty() ? 0 : calculateAccessoryAmount(flower.getAccessories());
    }
}