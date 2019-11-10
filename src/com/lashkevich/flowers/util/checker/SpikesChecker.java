package com.lashkevich.flowers.util.checker;

public class SpikesChecker {
    private static final String FLOWER_HAVE_SPIKES_ENTER_MESSAGE = "У цветка есть шипы!";
    private static final String FLOWER_DONT_HAVE_SPIKES_ENTER_MESSAGE = "У цветка нет шипов!";

    public static String checkSpikes(boolean spikes) {
        return spikes ? FLOWER_HAVE_SPIKES_ENTER_MESSAGE : FLOWER_DONT_HAVE_SPIKES_ENTER_MESSAGE;
    }
}
