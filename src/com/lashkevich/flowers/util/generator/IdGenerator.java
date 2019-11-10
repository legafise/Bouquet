package com.lashkevich.flowers.util.generator;

public class IdGenerator {
    private static long flowerId;
    private static long accessoryId;
    private static long bouquetId;

    public static long generateFlowerId() {
        return flowerId++;
    }

    public static long generateAccessoryId() {
        return accessoryId++;
    }

    public static long generateBouquetId() {
        return bouquetId++;
    }
}

