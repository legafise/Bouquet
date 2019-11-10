package com.lashkevich.flowers.entity;

public enum AccessoryName {
    RIBBON("Ленточка"),
    BOW("Бантик"),
    SPARKLES("Блестки"),
    STICKER("Стикер"),
    FEATHERS("Перья");

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    AccessoryName(String info) {
        this.info = info;
    }


    public static AccessoryName getRandomAccessoryName() {
        long AccessoryNameNumber = Math.round(Math.random() * (AccessoryName.values().length - 1));

        for (int i = 0; i < AccessoryName.values().length; i++) {
            if (AccessoryName.values()[i].ordinal() == AccessoryNameNumber) {
                return AccessoryName.values()[i];
            }
        }
        return null;
    }
}
