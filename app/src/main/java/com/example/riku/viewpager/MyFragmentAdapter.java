package com.example.riku.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;

import android.view.ViewGroup;

/**
 * Created by RIKU on 2015/12/18.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {

    public MyFragmentAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);
    }


    @Override
    public Fragment getItem(int position) {
        return new MainFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Integer.toString(position+1)+"ページ目";
    }

}
