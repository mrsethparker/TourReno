package com.example.android.tourreno;

public class TourStop {

    //name of our tour stop
    private String tourStopName;

    //resourceID for thumbnail image of our tour stop
    private int tourStopThumbResourceID;

    //website url for our tour stop
    private String tourURL;


    //constructs a new object for a tour stop
    public TourStop(String name, int thumbResourceID, String url) {

        tourStopName = name;
        tourStopThumbResourceID = thumbResourceID;
        tourURL = url;
    }

    //get the name of the tour stop
    public String getTourStopName() {
        return tourStopName;
    }

    //get the thumbnail resourceID for our tour stop
    public int getTourStopThumbResourceID() {
        return tourStopThumbResourceID;
    }

    //get the URL for our tour stop
    public String getTourURL() {
        return tourURL;
    }
}
