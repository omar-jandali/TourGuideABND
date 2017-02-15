package com.example.janda_000.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by janda_000 on 2/15/2017.
 */

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.museum_1_name),
                getString(R.string.museum_1_address),
                getString(R.string.museum_1_phone)));
        places.add(new Place(getString(R.string.museum_2_name),
                getString(R.string.museum_2_address),
                getString(R.string.museum_2_phone)));
        places.add(new Place(getString(R.string.museum_3_name),
                getString(R.string.museum_3_address),
                getString(R.string.museum_3_phone)));
        places.add(new Place(getString(R.string.museum_4_name),
                getString(R.string.museum_4_address),
                getString(R.string.museum_4_phone)));


        PlaceAdapter placeAdapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(placeAdapter);
    }

}
