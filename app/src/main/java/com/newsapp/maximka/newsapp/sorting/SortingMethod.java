package com.newsapp.maximka.newsapp.sorting;

import java.util.Comparator;

/**
 * Created by maximka on 22.10.16.
 */

public interface SortingMethod<T> {
    double sort(T[] list, Comparator<T> comparator);
}
