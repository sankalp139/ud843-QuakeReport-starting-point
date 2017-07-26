package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sankalp on 7/16/2017.
 */

public class wordAdapter extends ArrayAdapter<word> {
    public wordAdapter(Activity EarthquakeActivity, ArrayList<word> words) {
        super(EarthquakeActivity,0,words);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final word currentword = getItem(position);



        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitude.setText(currentword.getmag());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView place = (TextView) listItemView.findViewById(R.id.place);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        place.setText(currentword.getplace());
// Set the theme color for the list item
 TextView date=(TextView)listItemView.findViewById(R.id.date);
        date.setText(currentword.getdate());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

        // return getView(position, convertView, parent);
    }
}
