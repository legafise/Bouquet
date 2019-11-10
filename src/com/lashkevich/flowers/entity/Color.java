package com.lashkevich.flowers.entity;

public enum Color {
    VIOLET("Фиолетовый"),
    BLUE("Голубой"),
    YELLOW("Желтый"),
    PINK("Розовый"),
    WHITE("Белый"),
    ORANGE("Ораньжевый"),
    RED("Красный"),
    GREEN("Зеленый");

    private String colorName;

    Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public static Color getRandomColor() {
        long colorNumber = Math.round(Math.random() * (Color.values().length - 1));

        for(int i = 0; i < Color.values().length; i++) {
            if (Color.values()[i].ordinal() == colorNumber) {
                return Color.values()[i];
            }
        }
        return null;
    }
}
