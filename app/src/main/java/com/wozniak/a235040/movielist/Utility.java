package com.wozniak.a235040.movielist;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by Szymon on 18.04.2018.
 */

public class Utility {
    public static int calculateNoOfColumns(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        return (int) (dpWidth / 100);
    }
}