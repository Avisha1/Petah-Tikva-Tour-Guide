package com.example.android.petahtikvatour.data.data_sources;

import android.content.Context;

import com.example.android.petahtikvatour.R;
import com.example.android.petahtikvatour.data.Place;

import java.util.ArrayList;

/**
 * Created by avishai on 8/26/2017.
 */

public class RestaurantsData {

    public static ArrayList<Place> getPlaces(Context context){

        ArrayList<Place> list = new ArrayList<>();
        list.add(new Place(context.getString(R.string.restaurant_1_name), context.getString(R.string.restaurant_1_desc), context.getString(R.string.restaurant_1_address) ));
        list.add(new Place(context.getString(R.string.restaurant_2_name), context.getString(R.string.restaurant_2_desc), context.getString(R.string.restaurant_2_address) ));
        list.add(new Place(context.getString(R.string.restaurant_3_name), context.getString(R.string.restaurant_3_desc), context.getString(R.string.restaurant_3_address) ));

        return list;
    }
}
