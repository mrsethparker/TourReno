package com.example.android.tourreno;

//Custom ArrayAdapter for displaying event tour stops

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourStopAdapter extends ArrayAdapter<TourStop> {

    //Constructor for creating a new TourStop
    //@param context is the current context
    //@param stops is a list of tour stops
    public TourStopAdapter(Activity context, ArrayList<TourStop> stops) {
        super(context, 0, stops);
    }

    //provide a View for an AdaptorView
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tour_stop_item, parent, false);
        }

        //get the current tour stop in our list
        TourStop currentStop = getItem(position);

        //find the current ImageView in our layout and update the tourStop Image
        ImageView tourStopImage = (ImageView) listItemView.findViewById(R.id.thumbnailImage);
        tourStopImage.setImageResource(currentStop.getTourStopThumbResourceID());

        //find the current name TextView in our layout and update the tourStop Name
        TextView eventNameTextView = (TextView) listItemView.findViewById(R.id.stopName);
        eventNameTextView.setText(currentStop.getTourStopName());

        //find the current url TextView in our layout and update the tourStop URL
        TextView eventURLTextView = (TextView) listItemView.findViewById(R.id.url);
        eventURLTextView.setText(currentStop.getTourURL());


        return listItemView;

    }
}
