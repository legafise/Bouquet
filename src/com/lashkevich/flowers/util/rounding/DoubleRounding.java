package com.lashkevich.flowers.util.rounding;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleRounding {
    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bigDecimal = new BigDecimal(Double.toString(value));
        bigDecimal = bigDecimal.setScale(places, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
