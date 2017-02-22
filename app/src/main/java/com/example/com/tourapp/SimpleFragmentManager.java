package com.example.com.tourapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

/**
 * Created by Vishal Bhati on 2/21/2017.
 */

public class SimpleFragmentManager extends FragmentPagerAdapter{
    Context c;
    public SimpleFragmentManager(FragmentManager fm,Context context) {
        super(fm);
        c=context;
    }


    @Override
    public Fragment getItem(int position) {
        BlankFragment blankFragment=new BlankFragment();
        Bundle  bundle=new Bundle();
        switch(position)
        {
            case 1:bundle.putString("temp","first");
                blankFragment.setArguments(bundle);
                return blankFragment;

            case 2:bundle.putString("temp","second");
                blankFragment.setArguments(bundle);
                return blankFragment;

            case 3:bundle.putString("temp","third");
                blankFragment.setArguments(bundle);
                return blankFragment;

            default:bundle.putString("temp","fourth");
                blankFragment.setArguments(bundle);
                return blankFragment;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position)
        {
            case 1:return c.getString(R.string.must_visit);

            case 2:return c.getString(R.string.amusement_park);
            case 3:return c.getString(R.string.gardens);
            default:return c.getString(R.string.religious_sites);
        }
    }
}
