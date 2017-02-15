package com.example.janda_000.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView food = (TextView) findViewById(R.id.food);
        TextView beach = (TextView) findViewById(R.id.beach);
        TextView shopping = (TextView) findViewById(R.id.shopping);
        TextView museum = (TextView) findViewById(R.id.museum);

        beach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent beachIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(beachIntent);
            }
        });

        beach.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent beachIntent = new Intent(MainActivity.this, BeachActivity.class);
                startActivity(beachIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        museum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumActivity.class);
                startActivity(museumIntent);
            }
        });

    }
}
