package com.lashkevich.flowers.util.comparator;

import com.lashkevich.flowers.entity.Flower;

import java.util.Comparator;

public class FlowerHeightComparator implements Comparator<Flower> {
    public int compare(Flower firstFlower, Flower secondFlower) {
        return Double.compare(firstFlower.getHeight(), secondFlower.getHeight());
    }
}