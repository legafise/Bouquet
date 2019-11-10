package com.lashkevich.flowers.invoker;

import com.lashkevich.flowers.information.AllInformation;
import com.lashkevich.flowers.util.randomizer.BouquetRandomizer;

public class TestInvoker {
    public static void main(String[] args) {
        AllInformation.getInformation(BouquetRandomizer.generateRandomBouquet());
    }
}