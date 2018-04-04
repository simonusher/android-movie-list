package com.wozniak.a235040.movielist;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailsActivity extends Activity implements GalleryFragment.OnFragmentInteractionListener, ActorListFragement.OnFragmentInteractionListener {
    GalleryFragment galleryFragment;
    ActorListFragement actorListFragement;
    TextView movieName;
    TextView movieCategory;
    ImageView movieBanner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        movieName = findViewById(R.id.movieNameDetails);
        movieCategory = findViewById(R.id.movieCategoryDetails);
        movieBanner = findViewById(R.id.movieBanner);
        Movie m = MovieList.getInstance().get(getIntent().getIntExtra("movieId", 0));
        movieBanner.setImageResource(m.getBannerRId());
        movieName.setText(m.getName());
        movieCategory.setText(m.getCategory());
        galleryFragment = GalleryFragment.newInstance(m);
        actorListFragement = new ActorListFragement();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.fragmentFrame, galleryFragment);
        transaction.commit();
        Button right = findViewById(R.id.button2);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentFrame, actorListFragement);
                transaction.commit();
            }
        });

        Button left = findViewById(R.id.button);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentFrame, galleryFragment);
                transaction.commit();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
