package com.yumikoazu.theone.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.yumikoazu.theone.R;
import com.yumikoazu.theone.ui.fragment.ArticleFragment;
import com.yumikoazu.theone.ui.fragment.HomeFragment;
import com.yumikoazu.theone.ui.fragment.QuestionFragment;
import com.yumikoazu.theone.ui.fragment.StowFragment;
import com.yumikoazu.theone.ui.fragment.UserFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    @Bind(R.id.home)
    ImageView mHomeIv;
    @Bind(R.id.home_layout)
    RelativeLayout mHomeLayout;
    @Bind(R.id.article)
    ImageView mArticleIv;
    @Bind(R.id.article_layout)
    RelativeLayout mArticleLayout;
    @Bind(R.id.question)
    ImageView mQuestionIv;
    @Bind(R.id.question_layout)
    RelativeLayout mQuestionLayout;
    @Bind(R.id.stow)
    ImageView mStowIv;
    @Bind(R.id.stow_layout)
    RelativeLayout mStowLayout;
    @Bind(R.id.user)
    ImageView mUserIv;
    @Bind(R.id.user_layout)
    RelativeLayout mUserLayout;
    @Bind(R.id.one_more)
    ImageView mOneMore;


    private FragmentManager fragmentManager;
    private int fragmentIndex = 0;



    private HomeFragment mHomeFragment;
    private ArticleFragment mArticleFragment;
    private QuestionFragment mQuestionFragment;
    private StowFragment mStowFragment;
    private UserFragment mUserFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mHomeLayout.setOnClickListener(this);
        mArticleLayout.setOnClickListener(this);
        mQuestionLayout.setOnClickListener(this);
        mStowLayout.setOnClickListener(this);
        mUserLayout.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();

        setTabSelection(0);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home_layout:
                fragmentIndex = 0;
                setTabSelection(0);
                break;

            case R.id.article_layout:
                fragmentIndex = 1;
                setTabSelection(1);
                break;

            case R.id.question_layout:
                fragmentIndex = 2;
                setTabSelection(2);
                break;

            case R.id.stow_layout:
                fragmentIndex = 3;
                setTabSelection(3);
                break;

            case R.id.user_layout:
                fragmentIndex = 4;
                setTabSelection(4);
                break;
        }
    }

    private void setTabSelection(int index) {
        clearSelection();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        hideFragments(transaction);

        switch (index) {
            case 0:
                mHomeIv.setImageResource(R.drawable.mobile_one_home_page_press_down);
                if (mHomeFragment == null) {
                    mHomeFragment = HomeFragment.getInstance();
                    transaction.add(R.id.content, mHomeFragment);
                } else {
                    transaction.show(mHomeFragment);
                }

                break;

            case 1:
                mArticleIv.setImageResource(R.drawable.mobile_one_content_page_press_down);

                if (mArticleFragment == null) {
                    mArticleFragment = ArticleFragment.getInstance();
                    transaction.add(R.id.content, mArticleFragment);
                } else {
                    transaction.show(mArticleFragment);
                }

                break;

            case 2:
                mQuestionIv.setImageResource(R.drawable.mobile_one_question_page_press_down);

                if (mQuestionFragment == null) {
                    mQuestionFragment = QuestionFragment.getInstance();
                    transaction.add(R.id.content, mQuestionFragment);
                } else {
                    transaction.show(mQuestionFragment);
                }

                break;

            case 3:
                mStowIv.setImageResource(R.drawable.mobile_one_stow_page_press_down);

                if (mStowFragment == null) {
                    mStowFragment = StowFragment.getInstance();
                    transaction.add(R.id.content, mStowFragment);
                } else {
                    transaction.show(mStowFragment);
                }

                break;

            case 4:
                mUserIv.setImageResource(R.drawable.mobile_one_details_page_press_down);

                if (mUserFragment == null) {
                    mUserFragment = new UserFragment();
                    transaction.add(R.id.content, mUserFragment);
                } else {
                    transaction.show(mUserFragment);
                }

                break;
        }

        transaction.commit();
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (mHomeFragment != null)
            transaction.hide(mHomeFragment);

        if (mArticleFragment != null)
            transaction.hide(mArticleFragment);

        if (mQuestionFragment != null)
            transaction.hide(mQuestionFragment);

        if (mStowFragment != null)
            transaction.hide(mStowFragment);

        if (mUserFragment != null)
            transaction.hide(mUserFragment);
    }

    private void clearSelection() {
        mHomeIv.setImageResource(R.drawable.mobile_one_home_page_button);
        mArticleIv.setImageResource(R.drawable.mobile_one_content_page_button);
        mQuestionIv.setImageResource(R.drawable.mobile_one_question_page_button);
        mStowIv.setImageResource(R.drawable.mobile_one_stow_page_button);
        mUserIv.setImageResource(R.drawable.mobile_one_details_page_button);
    }
}
