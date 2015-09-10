package com.yumikoazu.theone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joker on 2015/8/31.
 */
public class CommonPagerAdapter<T,F extends Fragment> extends FragmentStatePagerAdapter {


    private List<T> mPagers;
    private List<F> mPagerFragments;


    public CommonPagerAdapter(FragmentManager fm, T Pager,F pagerFragment) {
        super(fm);
        mPagers = new ArrayList<>();
        mPagerFragments = new ArrayList<>();
        mPagerFragments.add(pagerFragment);
        mPagers.add(Pager);
    }

    public List<T> getPagers() {
        return mPagers;
    }

    public List<F> getPagerFragments() {
        return mPagerFragments;
    }


    @Override
    public Fragment getItem(int position) {
        return mPagerFragments.get(position);
    }

    @Override
    public int getCount() {
        return mPagerFragments.size();
    }



    public void addPagerList(T pager,F pagerFragment) {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(pagerFragment);
        mPagers.add(pager);
        if (mPagerFragments == null)
            mPagerFragments = new ArrayList();
        mPagerFragments.addAll(localArrayList);
    }
}
