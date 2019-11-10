package com.lashkevich.flowers.entity;

public enum SpringFlowersName {
    MAY_LILY("Ландыш"),
    SNOWDROP("Подснежник");

    private String info;

    SpringFlowersName(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static SpringFlowersName getRandomFlower() {
        long flowerNumber = Math.round(Math.random() * (SpringFlowersName.values().length - 1));

        for(int i = 0; i < SpringFlowersName.values().length; i++) {
            if (SpringFlowersName.values()[i].ordinal() == flowerNumber) {
                return SpringFlowersName.values()[i];
            }
        }

        return null;
    }
}
