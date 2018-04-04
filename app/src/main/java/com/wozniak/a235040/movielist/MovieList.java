package com.wozniak.a235040.movielist;

import java.util.ArrayList;

/**
 * Created by Szymon on 22.03.2018.
 */

public class MovieList {
    private static ArrayList<Movie> instance = null;

    public static ArrayList<Movie> getInstance(){
        if(instance == null) {
            instance = new ArrayList<>();
            int[] deadpoolGallery = new int[]{R.drawable.dp_0, R.drawable.dp_1, R.drawable.dp_2, R.drawable.dp_3, R.drawable.dp_4, R.drawable.dp_5, R.drawable.dp_6, R.drawable.dp_7,
                    R.drawable.dp_8};
            instance.add(new Movie("Deadpool", "Action", R.drawable.deadpool_poster, R.drawable.deadpool_banner, deadpoolGallery));
            instance.add(new Movie("A", "B"));
            instance.add(new Movie("C", "D"));
            instance.add(new Movie("E", "F"));
            instance.add(new Movie("G", "H"));
            instance.add(new Movie("I", "J"));
            instance.add(new Movie("K", "L"));
            instance.add(new Movie("M", "N"));
        }
        return instance;
    }
}
