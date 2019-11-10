package com.lashkevich.flowers.information;

import com.lashkevich.flowers.entity.Flower;
import com.lashkevich.flowers.util.checker.AccessoryChecker;

import static com.lashkevich.flowers.util.calculator.GeneralFlowerAmountCalculator.calculateFlowerAmount;
import static com.lashkevich.flowers.util.rounding.DoubleRounding.round;

public class FlowerInformation {
    private static final String ACCESSORIES = "Аксесуары";
    private static final String ALL_AMOUNT_ENTER_MESSAGE = "Итоговая цена";
    private static final String SPACE = " ";
    private static final String LEFT_BRACKET = "(";
    private static final String RIGHT_BRACKET = ")";
    private static final String EQUALS_SIGN = "=";
    private static final String DASH = "-";
    private static final String SEMICOLON = ";";
    private static final String BELARUSIAN_CURRENCY_ENTER_MESSAGE = "р";

    public static void getFlowerInformation(Flower flower) {
        System.out.print(LEFT_BRACKET + flower + SEMICOLON + SPACE + ACCESSORIES + SPACE + DASH + SPACE);
        AccessoryChecker.checkFlowerAccessory(flower);
        System.out.println(SEMICOLON + SPACE + ALL_AMOUNT_ENTER_MESSAGE + SPACE + EQUALS_SIGN + SPACE
                + round(calculateFlowerAmount(flower), 1) + BELARUSIAN_CURRENCY_ENTER_MESSAGE + RIGHT_BRACKET);
    }
}
