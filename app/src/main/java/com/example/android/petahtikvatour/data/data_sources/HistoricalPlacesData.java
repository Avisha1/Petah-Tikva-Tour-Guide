package com.example.android.petahtikvatour.data.data_sources;

import android.content.Context;

import com.example.android.petahtikvatour.R;
import com.example.android.petahtikvatour.data.Place;

import java.util.ArrayList;

/**
 * Created by avishai on 8/26/2017.
 */

public class HistoricalPlacesData {

    public static ArrayList<Place> getPlaces(Context context) {

        ArrayList<Place> list = new ArrayList<>();

        list.add(new Place(context.getString(R.string.history_1_name),
                context.getString(R.string.history_1_desc),
                context.getString(R.string.history_1_address),
                R.drawable.great_synagogue));
        list.add(new Place(context.getString(R.string.history_2_name),
                context.getString(R.string.history_2_desc),
                context.getString(R.string.history_2_address),
                R.drawable.bridge_ptk));
        list.add(new Place(context.getString(R.string.history_3_name),
                context.getString(R.string.history_3_desc),
                context.getString(R.string.history_3_address),
                R.drawable.gudman_house));

        return list;
    }
}
