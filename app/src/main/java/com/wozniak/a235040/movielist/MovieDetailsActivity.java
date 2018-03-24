package com.wozniak.a235040.movielist;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

public class MovieDetailsActivity extends Activity implements GalleryFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
