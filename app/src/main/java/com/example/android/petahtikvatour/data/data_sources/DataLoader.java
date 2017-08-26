package com.example.android.petahtikvatour.data.data_sources;

import android.content.Context;

import com.example.android.petahtikvatour.data.Place;

import java.util.ArrayList;

/**
 * Created by avishai on 8/26/2017.
 */

public class DataLoader {

    public enum DataType {
        ATTRACTIONS,
        HISTORICAL_PLACES,
        PUBS,
        RESTAURANTS
    }

    public static ArrayList<Place> getData(DataType type, Context context) {

        ArrayList<Place> list = null;
        switch (type) {

            case ATTRACTIONS:
                list = AttractionsData.getPlaces(context);
                break;
            case HISTORICAL_PLACES:
                list = HistoricalPlacesData.getPlaces(context);
                break;
            case PUBS:
                list = PubsData.getPlaces(context);
                break;

            // restaurants
            default:
                list = RestaurantsData.getPlaces(context);
                break;
        }

        return list;
    }
}
