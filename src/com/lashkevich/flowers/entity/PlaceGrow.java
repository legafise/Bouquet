package com.lashkevich.flowers.entity;

public enum PlaceGrow {
    BELARUS("Поля Беларуси"),
    UKRAINE("Поля Украiнi"),
    RUSSIA("Поля России"),
    POLAND("Поля Польши");

    private String info;

    PlaceGrow(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public static PlaceGrow getRandomPlaceGrow() {
        long placeGrowNumber = Math.round(Math.random() * (PlaceGrow.values().length - 1));

        for(int i = 0; i < PlaceGrow.values().length; i++) {
            if (PlaceGrow.values()[i].ordinal() == placeGrowNumber) {
                return PlaceGrow.values()[i];
            }
        }

        return null;
    }
}
