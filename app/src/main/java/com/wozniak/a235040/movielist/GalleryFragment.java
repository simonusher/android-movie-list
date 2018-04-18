package com.wozniak.a235040.movielist;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.support.v4.app.Fragment;

import static android.content.res.Configuration.ORIENTATION_PORTRAIT;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link GalleryFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {
    GridRecyclerAdapter adapter;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }


    public static GalleryFragment newInstance(Movie movie) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putIntArray("imageRIds", movie.getGalleryImagesRIds());
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MovieDetailsActivity movieDetailsActivity = (MovieDetailsActivity)getContext();
        RecyclerView recyclerView = ((MovieDetailsActivity)movieDetailsActivity).findViewById(R.id.galleryRecyclerView);
        int numberOfColumns;
        if(getResources().getConfiguration().orientation == ORIENTATION_PORTRAIT){
            numberOfColumns = Utility.calculateNoOfColumns(movieDetailsActivity);
        } else {
            numberOfColumns = Utility.calculateNoOfColumns(movieDetailsActivity) / 2;
        }
        int data[] = this.getArguments().getIntArray("imageRIds");
        recyclerView.setLayoutManager(new GridLayoutManager(movieDetailsActivity, numberOfColumns));
        adapter = new GridRecyclerAdapter(movieDetailsActivity, data);
        recyclerView.setAdapter(adapter);
    }
}
