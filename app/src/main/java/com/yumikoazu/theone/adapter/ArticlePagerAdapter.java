package com.yumikoazu.theone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yumikoazu.theone.bean.ArticlePager;
import com.yumikoazu.theone.ui.fragment.ArticlePagerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joker on 2015/8/31.
 */
public class ArticlePagerAdapter extends FragmentStatePagerAdapter {

    private List<ArticlePager> mArticlePagers;
    private List<ArticlePagerFragment> mArticlePagerFragments;

    public List<ArticlePager> getArticlePagers() {
        return mArticlePagers;
    }

    public List<ArticlePagerFragment> getArticlePagerFragments() {
        return mArticlePagerFragments;
    }

    public ArticlePagerAdapter(FragmentManager fm, ArticlePager articlePager) {
        super(fm);
        mArticlePagers = new ArrayList<>();
        mArticlePagerFragments = new ArrayList<>();
        this.mArticlePagerFragments.add(ArticlePagerFragment.getInstance(articlePager));
        mArticlePagers.add(articlePager);
    }


    @Override
    public Fragment getItem(int position) {
        return mArticlePagerFragments.get(position);
    }

    @Override
    public int getCount() {
        return mArticlePagerFragments.size();
    }

    public void addArticlePagerList(ArticlePager articlePager) {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(ArticlePagerFragment.getInstance(articlePager));
        mArticlePagers.add(articlePager);
        if (this.mArticlePagerFragments == null)
            this.mArticlePagerFragments = new ArrayList();
        this.mArticlePagerFragments.addAll(localArrayList);
    }
}
