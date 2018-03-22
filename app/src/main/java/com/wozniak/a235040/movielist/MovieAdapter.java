package com.wozniak.a235040.movielist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Szymon on 22.03.2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{
    private ArrayList<Movie> movies;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        RelativeLayout rowLayout;
        ImageView movieImage;
        TextView movieName;
        TextView movieCategory;
        public ViewHolder(RelativeLayout rowLayout){
            super(rowLayout);
            this.rowLayout = rowLayout;
            this.movieImage = rowLayout.findViewById(R.id.movieIconImageView);
            this.movieName = rowLayout.findViewById(R.id.movieNameTextViewMain);
            this.movieCategory = rowLayout.findViewById(R.id.movieCategoryTextViewMain);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MovieAdapter(ArrayList<Movie> movieList) {
        movies = movieList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        RelativeLayout rowLayout  = (RelativeLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_movie, parent, false);
        return new ViewHolder(rowLayout);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Movie movie = movies.get(position);
        holder.movieImage.setImageResource(movie.getImageRId());
        holder.movieName.setText(movie.getName());
        holder.movieCategory.setText(movie.getCategory());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return movies.size();
    }
}
