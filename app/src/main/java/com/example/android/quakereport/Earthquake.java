package com.example.android.quakereport;

/**
 * Created by USER on 6/8/2017.
 */

public class Earthquake {
    //Magnitude of the Earthquake
    private double mMagnitude;

    //Location of the Earthquake
    private String mLocation;

    //Date of the Earthquake
    private long mTimeInMilliseconds;

    // url of the uspg to display the event in the website
    private String mUrl;
    // Create a new object Earthquake

    /**
     * @param magnitude
     * @param location
     * @param timeInMilliseconds
     * @param url
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl =url;
    }


    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmUrl(){
        return mUrl;
    }

}
