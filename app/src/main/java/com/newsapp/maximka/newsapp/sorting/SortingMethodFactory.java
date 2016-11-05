package com.newsapp.maximka.newsapp.sorting;

import com.newsapp.maximka.newsapp.R;
import com.newsapp.maximka.newsapp.models.SortItem;

/**
 * Created by maximka on 22.10.16.
 */

public class SortingMethodFactory {
    public static SortingMethod<SortItem> getMethod(int id) {
        if (id == R.id.javaMethod) {
            return new JavaSort<>();
        } else if (id == R.id.cMethod) {
            return new CSort();
        }

        return null;
    }
}
