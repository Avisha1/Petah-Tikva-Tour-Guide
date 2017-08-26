package com.example.android.petahtikvatour.data;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.petahtikvatour.R;

import java.util.ArrayList;

/**
 * Created by avishai on 8/26/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    //private int mImageResourceId;

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> wordList) {
        super(context, 0, wordList);

//        this.mImageResourceId = imageResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Place currentPlace = getItem(position);

        TextView nameTextView = (TextView)listItemView.findViewById(R.id.place_name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView descriptionTextView = (TextView)listItemView.findViewById(R.id.place_description_text_view);
        descriptionTextView.setText(currentPlace.getDescription());

        TextView addressTextView = (TextView)listItemView.findViewById(R.id.place_address_text_view);
        addressTextView.setText(currentPlace.getAddress());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);
        if(currentPlace.hasImage()){
            image.setImageResource(currentPlace.getImageResourceId());
        }
        else{
            image.setVisibility(View.GONE);
        }

/*        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);*/

        return listItemView;

    }
}


