package com.wozniak.a235040.movielist;

/**
 * Created by Szymon on 22.03.2018.
 */

public class Movie {
    private String name;
    private String category;
    private int imageRId;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
        this.imageRId = R.drawable.ic_launcher_foreground;
    }

    public Movie(String name, String category, int imageRId) {
        this.name = name;
        this.category = category;
        this.imageRId = imageRId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getImageRId() {
        return imageRId;
    }
}
