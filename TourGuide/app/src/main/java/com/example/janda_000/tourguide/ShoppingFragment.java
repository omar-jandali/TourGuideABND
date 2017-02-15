package com.example.janda_000.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.shopping_1_name),
                getString(R.string.shopping_1_address),
                getString(R.string.shopping_1_phone)));
        places.add(new Place(getString(R.string.shopping_2_name),
                getString(R.string.shopping_2_address),
                getString(R.string.shopping_2_phone)));
        places.add(new Place(getString(R.string.shopping_3_name),
                getString(R.string.shopping_3_address),
                getString(R.string.shopping_3_phone)));


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
