package com.lashkevich.flowers.information;

import com.lashkevich.flowers.entity.Bouquet;
import com.lashkevich.flowers.util.calculator.BouquetAmountCalculator;
import com.lashkevich.flowers.util.checker.AccessoryChecker;

import static com.lashkevich.flowers.util.rounding.DoubleRounding.round;

public class BouquetInformation {
    private static final String BOUQUET = "Букет";
    private static final String LEFT_BRACKET = "(";
    private static final String RIGHT_BRACKET = ")";
    private static final String BOUQUET_AMOUNT_ENTER_MESSAGE = "Цена букета";
    private static final String EQUALS_SIGN = "=";
    private static final String COLON_SIGN = ":";
    private static final String COMMA = ",";
    private static final String SPACE = " ";
    private static final String ID = "id";
    private static final String ACCESSORIES = "Аксесуары";
    private static final String DASH = "-";
    private static final String BELARUSIAN_CURRENCY_ENTER_MESSAGE = "р";

    public static void getBouquetInformation(Bouquet bouquet) {
        System.out.print(BOUQUET + LEFT_BRACKET + ID + SPACE + EQUALS_SIGN + SPACE + bouquet.getId() + COMMA +
                SPACE + ACCESSORIES + SPACE + DASH + SPACE);
        AccessoryChecker.checkBouquetAccessory(bouquet);
        System.out.println(COMMA + SPACE + BOUQUET_AMOUNT_ENTER_MESSAGE + SPACE + EQUALS_SIGN + SPACE +
                round(BouquetAmountCalculator.calculateBouquetAmount(bouquet), 1) +
                BELARUSIAN_CURRENCY_ENTER_MESSAGE + RIGHT_BRACKET + COLON_SIGN);
        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
           FlowerInformation.getFlowerInformation(bouquet.getFlowers().get(i));
        }
    }
}
