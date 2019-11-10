package com.lashkevich.flowers.util.comparator;

import com.lashkevich.flowers.entity.Flower;

import java.util.Comparator;

import static com.lashkevich.flowers.util.calculator.GeneralFlowerAmountCalculator.calculateFlowerAmount;

public class FlowerPriceComparator implements Comparator<Flower> {
    public int compare(Flower firstFlower, Flower secondFlower) {
        return Double.compare(calculateFlowerAmount(firstFlower), calculateFlowerAmount(secondFlower));
    }
}
