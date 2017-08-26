package com.example.android.petahtikvatour.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.petahtikvatour.R;
import com.example.android.petahtikvatour.data.Place;
import com.example.android.petahtikvatour.data.PlaceAdapter;
import com.example.android.petahtikvatour.data.data_sources.DataLoader;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = DataLoader.getData(DataLoader.DataType.RESTAURANTS, getContext());

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
