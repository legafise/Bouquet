package com.lashkevich.flowers.util.checker;

public class SeemChecker {
    private static final String FLOWER_SEED_FROM_SNOW_ENTER_MESSAGE = "Цветок не под снегом!";
    private static final String FLOWER_DONT_SEED_FROM_SNOW_ENTER_MESSAGE = "Цветок еще под снегом!";

    public static String checkSeem(boolean hasSeem) {
        return hasSeem ? FLOWER_SEED_FROM_SNOW_ENTER_MESSAGE : FLOWER_DONT_SEED_FROM_SNOW_ENTER_MESSAGE;
    }
}
