package com.bushra.locatr;

import android.net.Uri;

public class GalleryItem
{


    private String mCaption;
    private String mId;
    private String mUrl;
    private double mLat;
    private double mLon;
    private String mOwner;

    public String getOwner() {
        return mOwner;
    }
    public void setOwner(String owner) {
        mOwner = owner;
    }
    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }


    @Override
    public String toString()
    {
        return mCaption;
    }

    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public double getLat() {
        return mLat;
    }
    public void setLat(double lat) {
        mLat = lat;
    }
    public double getLon() {
        return mLon;
    }
    public void setLon(double lon) {
        mLon = lon;
    }

}
