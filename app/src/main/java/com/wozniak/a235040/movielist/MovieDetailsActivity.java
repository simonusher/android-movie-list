package com.wozniak.a235040.movielist;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MovieDetailsActivity extends Activity implements GalleryFragment.OnFragmentInteractionListener, ActorListFragement.OnFragmentInteractionListener {
    GalleryFragment galleryFragment;
    ActorListFragement actorListFragement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        galleryFragment = new GalleryFragment();
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
