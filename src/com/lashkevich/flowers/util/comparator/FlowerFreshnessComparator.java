package com.lashkevich.flowers.util.comparator;

import com.lashkevich.flowers.entity.Flower;

import java.util.Comparator;

public class FlowerFreshnessComparator implements Comparator<Flower> {
    public int compare(Flower firstFlower, Flower secondFlower) {
        return Double.compare(firstFlower.getFreshness(), secondFlower.getFreshness());
    }
}
