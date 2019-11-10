package com.lashkevich.flowers.util.checker;

public class SeedsChecker {
    private static final String FLOWER_HAVE_SEEDS_ENTER_MESSAGE = "Цветок имеет семечки!";
    private static final String FLOWER_DONT_HAVE_SEEDS_ENTER_MESSAGE = "Цветок не имеет семечек!";

    public static String checkSeeds(boolean seeds) {
        return seeds ? FLOWER_HAVE_SEEDS_ENTER_MESSAGE : FLOWER_DONT_HAVE_SEEDS_ENTER_MESSAGE;
    }
}

