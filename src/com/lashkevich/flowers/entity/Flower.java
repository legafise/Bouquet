package com.lashkevich.flowers.entity;

import com.lashkevich.flowers.information.ColorInformation;

import java.util.ArrayList;
import java.util.List;

public abstract class Flower extends Entity {
    private String name;
    private double height;
    private List<Color> color;
    private List<Accessory> accessories;
    private double freshness;

    public Flower(long id, String name, double height, List<Color> color, double freshness) {
        super(id);
        this.name = name;
        this.height = height;
        this.color = color;
        this.accessories = new ArrayList<>();
        this.freshness = freshness;
    }

    public Flower(long id, String name, double height, List<Color> color, double freshness, List<Accessory> accessories) {
        super(id);
        this.name = name;
        this.height = height;
        this.color = color;
        this.accessories = accessories;
        this.freshness = freshness;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<Color> getColor() {
        return color;
    }

    public void setColor(ArrayList<Color> color) {
        this.color = color;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<Accessory> accessories) {
        this.accessories = accessories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFreshness() {
        return freshness;
    }

    public void setFreshness(double freshness) {
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return super.toString() + " (Название цветка - " + name + "; Высота цветка = " + height + "см; Цвет - " +
                ColorInformation.getColorInfo(color) + "; Свежесть цветка = " + freshness + "%";
    }
}
