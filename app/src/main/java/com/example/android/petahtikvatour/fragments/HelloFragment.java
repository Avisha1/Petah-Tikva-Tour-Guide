package com.example.android.petahtikvatour.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.petahtikvatour.R;
import com.example.android.petahtikvatour.data.Place;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment {

    public HelloFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.hello_fragment, container, false);
    }

}
