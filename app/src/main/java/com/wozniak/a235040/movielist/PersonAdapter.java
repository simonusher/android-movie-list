package com.wozniak.a235040.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Szymon on 20.03.2018.
 */

public class PersonAdapter extends ArrayAdapter<Person>{
    public PersonAdapter(Context context, int resource, List<Person> people) {
        super(context, resource, people);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.person_list_row_layout, parent, false);
        }

        final Person person = getItem(position);
        if(person != null){
            TextView nameTextView = view.findViewById(R.id.personNameTextView);
            TextView ageTextView = view.findViewById(R.id.personAgeTextView);
            String fullname = person.getName() + " " + person.getSurname();
            nameTextView.setText(fullname);
            ageTextView.setText(getContext().getString(R.string.ageLabelMain, person.getAge()));
        }
        return view;
    }
}
