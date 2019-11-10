package com.lashkevich.flowers.entity;

public class Accessory extends Entity {
    private AccessoryName name;
    private Color color;
    private double price;

    public Accessory() {

    }

    public Accessory(long id, AccessoryName name, Color color, double price) {
        super(id);
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public AccessoryName getName() {
        return name;
    }

    public void setName(AccessoryName name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + super.toString() + "; Имя аксесуара - " + name.getInfo() + "; Цвет аксесуара - " + color.getColorName() + "; Цена аксесуара = " + price + "р" + ")";
    }
}