package com.newsapp.maximka.newsapp.sorting;

import com.newsapp.maximka.newsapp.models.SortItem;

import java.util.Comparator;

/**
 * Created by maximka on 22.10.16.
 */

public class CSort implements SortingMethod<SortItem> {
    static {
        System.loadLibrary("nativeSort-lib");
    }

    public native double nativeSortNews(SortItem[] items);

    @Override
    public double sort(SortItem[] list, Comparator<SortItem> comparator) {
        return nativeSortNews(list);
    }
}
