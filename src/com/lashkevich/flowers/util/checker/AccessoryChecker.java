package com.lashkevich.flowers.util.checker;

import com.lashkevich.flowers.entity.Bouquet;
import com.lashkevich.flowers.entity.Flower;

public class AccessoryChecker {
    private static final String NO_ACCESSORY_ENTER_MESSAGE = "Нет аксесуаров";

    public static void checkFlowerAccessory(Flower flower) {
        if (flower.getAccessories().isEmpty()) {
            System.out.print(NO_ACCESSORY_ENTER_MESSAGE);
        } else {
            System.out.print(flower.getAccessories());
        }
    }

    public static void checkBouquetAccessory(Bouquet bouquet) {
        if (bouquet.getAccessories().isEmpty()) {
            System.out.print(NO_ACCESSORY_ENTER_MESSAGE);
        } else {
            System.out.print(bouquet.getAccessories());
        }
    }
}