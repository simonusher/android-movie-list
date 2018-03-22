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
        }
        return instance;
    }
}
