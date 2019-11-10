package com.lashkevich.flowers.information.reporter;

import com.lashkevich.flowers.entity.Bouquet;
import com.lashkevich.flowers.util.calculator.GeneralFlowerAmountCalculator;
import com.lashkevich.flowers.util.comparator.FlowerFreshnessComparator;
import com.lashkevich.flowers.util.comparator.FlowerHeightComparator;
import com.lashkevich.flowers.util.comparator.FlowerPriceComparator;
import com.lashkevich.flowers.util.rounding.DoubleRounding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingReporter {
    private static final String ID = "id";
    private static final String COMMA = ",";
    private static final String SPACE = " ";
    private static final String EQUALS_SIGN = "=";
    private static final String LEFT_BRACKET = "(";
    private static final String RIGHT_BRACKET = ")";
    private static final String SEMICOLON = ";";

    public static void reportSortingPrice(Bouquet bouquet) {
        List prices = new ArrayList();
        Collections.sort(bouquet.getFlowers(), new FlowerPriceComparator());

        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            prices.add(DoubleRounding.round(GeneralFlowerAmountCalculator.calculateFlowerAmount(bouquet.getFlowers().get(i)), 1));
        }

        reportSorting(bouquet, prices, "р");
    }

    public static void reportSortingHeight(Bouquet bouquet) {
        List heights = new ArrayList();
        Collections.sort(bouquet.getFlowers(), new FlowerHeightComparator());

        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            heights.add(DoubleRounding.round(bouquet.getFlowers().get(i).getHeight(), 1));
        }

        reportSorting(bouquet, heights, "см");
    }

    public static void reportSortingFreshness(Bouquet bouquet) {
        List freshness = new ArrayList();
        Collections.sort(bouquet.getFlowers(), new FlowerFreshnessComparator());

        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            freshness.add(DoubleRounding.round(bouquet.getFlowers().get(i).getFreshness(), 1));
        }

        reportSorting(bouquet, freshness, "%");
    }

    private static void reportSorting(Bouquet bouquet, List item, String value) {
        for (int i = 0; i < bouquet.getFlowers().size(); i++) {
            if (i == bouquet.getFlowers().size() - 1) {
                System.out.println(LEFT_BRACKET + ID + SPACE + EQUALS_SIGN + SPACE +
                        bouquet.getFlowers().get(i).getId() + SEMICOLON + SPACE + item.get(i) + value + RIGHT_BRACKET);
            } else {
                System.out.print(LEFT_BRACKET + ID + SPACE + EQUALS_SIGN + SPACE +bouquet.getFlowers().get(i).getId() +
                        SEMICOLON + SPACE + item.get(i) + value + RIGHT_BRACKET + COMMA + SPACE);
            }
        }
    }
}
