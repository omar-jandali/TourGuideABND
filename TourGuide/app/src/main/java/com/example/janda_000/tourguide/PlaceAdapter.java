package com.example.janda_000.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by janda_000 on 2/15/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View listedView, ViewGroup parent){
        View listItemView = listedView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView currentName = (TextView) listItemView.findViewById(R.id.item_name);
        TextView currentAddress = (TextView) listItemView.findViewById(R.id.item_address);
        TextView currentPhone = (TextView) listItemView.findViewById(R.id.item_phone);

        currentName.setText(currentPlace.getTgName());
        currentAddress.setText(currentPlace.getTgAddress());
        currentPhone.setText(currentPlace.getTgPhone());

        return listItemView;
    }

}
