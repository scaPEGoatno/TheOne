package com.yumikoazu.theone.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.yumikoazu.theone.bean.QuestionPager;
import com.yumikoazu.theone.ui.fragment.QuestionPagerFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joker on 2015/8/31.
 */
public class QuestionPagerAdapter extends FragmentStatePagerAdapter {

    private List<QuestionPager> mQuestionPagers;
    private List<QuestionPagerFragment> mQuestionPagerFragments;


    public QuestionPagerAdapter(FragmentManager fm, QuestionPager QuestionPager) {
        super(fm);
        mQuestionPagers = new ArrayList<>();
        mQuestionPagerFragments = new ArrayList<>();
        mQuestionPagerFragments.add(QuestionPagerFragment.getInstance(QuestionPager));
        mQuestionPagers.add(QuestionPager);
    }


    @Override
    public Fragment getItem(int position) {
        return mQuestionPagerFragments.get(position);
    }

    @Override
    public int getCount() {
        return mQuestionPagerFragments.size();
    }

    public List<QuestionPager> getQuestionPagers() {
        return mQuestionPagers;
    }

    public List<QuestionPagerFragment> getQuestionPagerFragments() {
        return mQuestionPagerFragments;
    }


    public void addQuestionPagerList(QuestionPager QuestionPager) {
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(QuestionPagerFragment.getInstance(QuestionPager));
        mQuestionPagers.add(QuestionPager);
        if (this.mQuestionPagerFragments == null)
            this.mQuestionPagerFragments = new ArrayList();
        this.mQuestionPagerFragments.addAll(localArrayList);
    }
}
