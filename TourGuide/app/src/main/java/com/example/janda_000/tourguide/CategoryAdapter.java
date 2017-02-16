package com.example.janda_000.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by omarjandali on 4/14/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context tgContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        tgContext = context;
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

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return tgContext.getString(R.string.food_name);
        } else if (position == 1){
            return tgContext.getString(R.string.shopping_name);
        } else if (position == 2){
            return tgContext.getString(R.string.beach_name);
        } else {
            return tgContext.getString(R.string.museum_name);
        }
    }

}