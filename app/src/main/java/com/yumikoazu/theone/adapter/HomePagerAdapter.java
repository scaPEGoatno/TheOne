package com.yumikoazu.theone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yumikoazu.theone.bean.HomePager;
import com.yumikoazu.theone.ui.fragment.HomePagerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joker on 2015/8/31.
 */
public class HomePagerAdapter extends FragmentStatePagerAdapter {

    private List<HomePager> mHomePagers;
    private List<HomePagerFragment> mHomePagerFragments;


    public HomePagerAdapter(FragmentManager fm, HomePager homePager) {
        super(fm);
        mHomePagers = new ArrayList<>();
        mHomePagerFragments = new ArrayList<>();
        mHomePagerFragments.add(HomePagerFragment.getInstance(homePager));
        mHomePagers.add(homePager);
    }


    @Override
    public Fragment getItem(int position) {
        return mHomePagerFragments.get(position);
    }

    @Override
    public int getCount() {
        return mHomePagerFragments.size();
    }

    public List<HomePager> getHomePagers() {
        return mHomePagers;
    }

    public List<HomePagerFragment> getHomePagerFragments() {
        return mHomePagerFragments;
    }


    public void addHomePagerList(HomePager homePager) {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(HomePagerFragment.getInstance(homePager));
        mHomePagers.add(homePager);
        if (this.mHomePagerFragments == null)
            this.mHomePagerFragments = new ArrayList();
        this.mHomePagerFragments.addAll(localArrayList);
    }
}
