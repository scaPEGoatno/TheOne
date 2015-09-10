package com.yumikoazu.theone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yumikoazu.theone.bean.StowPager;
import com.yumikoazu.theone.ui.fragment.StowPagerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joker on 2015/8/31.
 */
public class StowPagerAdapter extends FragmentStatePagerAdapter {

    private List<StowPager> mStowPagers;
    private List<StowPagerFragment> mStowPagerFragments;


    public StowPagerAdapter(FragmentManager fm, StowPager StowPager) {
        super(fm);
        mStowPagers = new ArrayList<>();
        mStowPagerFragments = new ArrayList<>();
        mStowPagerFragments.add(StowPagerFragment.getInstance(StowPager));
        mStowPagers.add(StowPager);
    }


    @Override
    public Fragment getItem(int position) {
        return mStowPagerFragments.get(position);
    }

    @Override
    public int getCount() {
        return mStowPagerFragments.size();
    }

    public List<StowPager> getStowPagers() {
        return mStowPagers;
    }

    public List<StowPagerFragment> getStowPagerFragments() {
        return mStowPagerFragments;
    }


    public void addStowPagerList(StowPager StowPager) {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(StowPagerFragment.getInstance(StowPager));
        mStowPagers.add(StowPager);
        if (this.mStowPagerFragments == null)
            this.mStowPagerFragments = new ArrayList();
        this.mStowPagerFragments.addAll(localArrayList);
    }
}
