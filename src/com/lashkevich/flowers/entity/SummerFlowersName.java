package com.lashkevich.flowers.entity;

public enum SummerFlowersName {
    CHAMOMILE("Ромашка"),
    SUNFLOWER("Подсолнух");

    private String info;

    SummerFlowersName(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static SummerFlowersName getRandomFlower() {
        long flowerNumber = Math.round(Math.random() * (SummerFlowersName.values().length - 1));

        for(int i = 0; i < SummerFlowersName.values().length; i++) {
            if (SummerFlowersName.values()[i].ordinal() == flowerNumber) {
                return SummerFlowersName.values()[i];
            }
        }
        return null;
    }
}
