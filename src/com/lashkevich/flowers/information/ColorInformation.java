package com.lashkevich.flowers.information;

import com.lashkevich.flowers.entity.Color;

import java.util.ArrayList;
import java.util.List;

public class ColorInformation {
    public static List<String> getColorInfo(List<Color> colors) {
        List<String> colorsName = new ArrayList<>();

        for (Color color : colors) {
            colorsName.add(color.getColorName());
        }

        return colorsName;
    }
}
