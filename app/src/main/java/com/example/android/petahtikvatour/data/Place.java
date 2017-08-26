package com.example.android.petahtikvatour.data;

/**
 * Created by avishai on 8/26/2017.
 */

public class Place {

    private String mName;
    private String mDescription;
    private String mAddress;

    private int mImageResourceId;

    public Place(String name, String description, String address) {
        this.mName = name;
        this.mDescription = description;
        this.mAddress = address;
    }

    public Place(String name, String description, String address, int imageResourceId) {
        this(name, description, address);

        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Boolean hasImage() {
        return mImageResourceId != 0 ? true : false;
    }
}
