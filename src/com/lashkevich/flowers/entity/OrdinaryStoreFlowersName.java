package com.lashkevich.flowers.entity;

public enum OrdinaryStoreFlowersName {
    ASTER("Астра"),
    VIOLET("Фиалка"),
    CHRYSANTHEMUM("Хризантема"),
    TULIP("Тюльпан"),
    GERBERA("Гербера");

    private String info;

    OrdinaryStoreFlowersName(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static OrdinaryStoreFlowersName getRandomFlower() {
        long flowerNumber = Math.round(Math.random() * (OrdinaryStoreFlowersName.values().length - 1));

        for(int i = 0; i < OrdinaryStoreFlowersName.values().length; i++) {
            if (OrdinaryStoreFlowersName.values()[i].ordinal() == flowerNumber) {
                return OrdinaryStoreFlowersName.values()[i];
            }
        }

        return null;
    }
}



