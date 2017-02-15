package com.example.janda_000.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by omarjandali on 4/14/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new FoodFragment();
        } else if (position == 1){
            return new ShoppingFragment();
        } else if (position == 2){
            return new BeachFragment();
        } else {
            return new MuseumFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}