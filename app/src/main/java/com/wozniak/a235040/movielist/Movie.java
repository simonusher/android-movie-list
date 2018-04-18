package com.wozniak.a235040.movielist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Szymon on 22.03.2018.
 */

public class Movie {
    private String name;
    private String category;
    private int thumbnailRId;
    private int bannerRId;
    private int[] galleryImagesRIds;
    private ArrayList<Person> actors;



    public Movie(String name, String category){
        this.name = name;
        this.category = category;
        this.thumbnailRId = R.mipmap.ic_launcher;
        this.bannerRId = R.mipmap.ic_launcher_round;
        this.galleryImagesRIds = new int[9];
        for (int i = 0; i < 9; i++){
            galleryImagesRIds[i] = R.mipmap.ic_launcher_round;
        }
        this.actors = new ArrayList<>();
    }

    public Movie(String name, String category, int thumbnailRId) {
        this.name = name;
        this.category = category;
        this.thumbnailRId = thumbnailRId;
    }

    public Movie(String name, String category, int thumbnailRId, int bannerRId, int[] galleryImagesRIds, ArrayList<Person> actors){
        this(name, category, thumbnailRId);
        this.bannerRId = bannerRId;
        this.galleryImagesRIds = galleryImagesRIds;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getThumbnailRId() {
        return thumbnailRId;
    }

    public int getBannerRId() {
        return bannerRId;
    }

    public int[] getGalleryImagesRIds() {
        return galleryImagesRIds;
    }

    public ArrayList<Person> getActors() {
        return actors;
    }
}
