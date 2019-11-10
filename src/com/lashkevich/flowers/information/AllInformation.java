package com.lashkevich.flowers.information;

import com.lashkevich.flowers.entity.Bouquet;
import com.lashkevich.flowers.information.reporter.SortingReporter;

public class AllInformation {
    private static final String ALL_BOUQUET_INFO_ENTER_MESSAGE = "Общая информация о букете: ";
    private static final String BOUQUET_SORT_PRICES_ENTER_MESSAGE = "Отсортированые цены цветов(от меньшей к большей): ";
    private static final String BOUQUET_SORT_HEIGHTS_ENTER_MESSAGE = "Отсортированые высоты цветов(от меньшей к большей): ";
    private static final String BOUQUET_SORT_FRESHNESS_ENTER_MESSAGE = "Отсортированые свежести цветов(от меньшей к большей): ";

    public static void getInformation(Bouquet bouquet) {
        System.out.println(ALL_BOUQUET_INFO_ENTER_MESSAGE);
        BouquetInformation.getBouquetInformation(bouquet);

        System.out.println();

        System.out.println(BOUQUET_SORT_PRICES_ENTER_MESSAGE);
        SortingReporter.reportSortingPrice(bouquet);

        System.out.println();

        System.out.println(BOUQUET_SORT_HEIGHTS_ENTER_MESSAGE);
        SortingReporter.reportSortingHeight(bouquet);

        System.out.println();

        System.out.println(BOUQUET_SORT_FRESHNESS_ENTER_MESSAGE);
        SortingReporter.reportSortingFreshness(bouquet);
    }
}
