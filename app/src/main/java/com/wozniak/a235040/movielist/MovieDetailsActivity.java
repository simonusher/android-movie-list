package com.wozniak.a235040.movielist;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailsActivity extends FragmentActivity implements GalleryFragment.OnFragmentInteractionListener, ActorListFragment.OnFragmentInteractionListener {
    private static final int NUM_PAGES = 2;
    GalleryFragment galleryFragment;
    ActorListFragment actorListFragment;
    TextView movieName;
    TextView movieCategory;
    ImageView movieBanner;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
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
        actorListFragment = ActorListFragment.newInstance(m.getActors());

        mPager = findViewById(R.id.movie_details_pager);
        mPagerAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                if(position == 0){
                    return galleryFragment;
                } else {
                    return actorListFragment;
                }
            }

            @Override
            public int getCount() {
                return NUM_PAGES;
            }
        };
        mPager.setAdapter(mPagerAdapter);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
