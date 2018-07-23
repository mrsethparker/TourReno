package com.example.android.tourreno;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourStopFragmentPagerAdapter extends FragmentPagerAdapter {


    //the number of pages in our tabbed layout
    final int PAGE_COUNT = 4;
    //context of our app
    private Context mContext;

    public TourStopFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new EventsFragment();
        } else if (position == 1) {
            return new DiningFragment();
        } else if (position == 2) {
            return new HistoryFragment();
        } else {
            return new FunFragment();
        }

    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.events_category);
        } else if (position == 1) {
            return mContext.getString(R.string.dining_category);
        } else if (position == 2) {
            return mContext.getString(R.string.history_category);
        } else {
            return mContext.getString(R.string.fun_category);
        }
    }
}
