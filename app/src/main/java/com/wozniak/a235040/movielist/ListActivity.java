package com.wozniak.a235040.movielist;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mRecyclerView = findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        ArrayList<Movie> list = MovieList.getInstance();
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));
        list.add(new Movie("Avc", "ADS"));

        mAdapter = new MovieAdapter(list);
        mRecyclerView.setAdapter(mAdapter);
    }
}
