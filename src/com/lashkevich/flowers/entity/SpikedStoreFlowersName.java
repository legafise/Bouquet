package com.lashkevich.flowers.entity;

public enum SpikedStoreFlowersName {
    EUSTOMA("Эустома"),
    ROSE("Роза"),
    HIBISCUS("Гибискус"),
    BEGONIA("Бегония");

    private String info;

    SpikedStoreFlowersName(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static SpikedStoreFlowersName getRandomFlower() {
        long flowerNumber = Math.round(Math.random() * (SpikedStoreFlowersName.values().length - 1));

        for(int i = 0; i < SpikedStoreFlowersName.values().length; i++) {
            if (SpikedStoreFlowersName.values()[i].ordinal() == flowerNumber) {
                return SpikedStoreFlowersName.values()[i];
            }
        }
        return null;
    }
}
