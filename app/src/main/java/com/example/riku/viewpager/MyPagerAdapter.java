package com.example.riku.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RIKU on 2015/12/16.
 */
public class MyPagerAdapter extends PagerAdapter {

    private LayoutInflater layoutInflater = null;
    private Object mCurrentObject;

    public MyPagerAdapter(Context c) {
        super();
        layoutInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        mCurrentObject = object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View layout = layoutInflater.inflate(R.layout.view_pager_item, null);
        switch (position) {
            case 0:
                layout.setBackgroundColor(Color.RED);
                break;
            case 1:
                layout.setBackgroundColor(Color.GREEN);
                break;
            case 2:
                layout.setBackgroundColor(Color.BLUE);
                break;
        }
        container.addView(layout);
        return layout;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "List";
        } else if (position == 1) {
            return "Grid";
        } else {
            return "Scroll";
        }

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    container.removeView((View)object);
    }

}
