package com.example.android.tourreno;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FunFragment extends Fragment {


    public FunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.tour_stop_list, container, false);

        //create our list of tour stops
        final ArrayList<TourStop> stops = new ArrayList<>();

        //initialize our tour stop list with stops
        stops.add(new TourStop(getString(R.string.float_truckee_name), R.drawable.river, getString(R.string.float_truckee_url)));
        stops.add(new TourStop(getString(R.string.visit_tahoe_name), R.drawable.tahoe, getString(R.string.visit_tahoe_url)));
        stops.add(new TourStop(getString(R.string.ski_rose_name), R.drawable.ski, getString(R.string.ski_rose_url)));

        //create a new TourStopAdapter with the stop list
        TourStopAdapter adapter = new TourStopAdapter(getActivity(), stops);

        //get the layout for displaying our tour stop list
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //attach the WordAdapter to our word list layout
        listView.setAdapter(adapter);

        return rootView;
    }

}
