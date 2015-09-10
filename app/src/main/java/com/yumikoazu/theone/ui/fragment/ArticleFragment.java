package com.yumikoazu.theone.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apkfuns.logutils.LogUtils;
import com.handmark.pulltorefresh.extras.viewpager.PullToRefreshViewPager;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.squareup.okhttp.Request;
import com.sw.library.widget.library.UniversalLoadingView;
import com.yumikoazu.theone.constants.ApiConstants;
import com.yumikoazu.theone.R;
import com.yumikoazu.theone.adapter.ArticlePagerAdapter;
import com.yumikoazu.theone.bean.ArticlePager;
import com.yumikoazu.theone.control.ViewPagerScr;
import com.yumikoazu.theone.net.MyResultCallback;
import com.yumikoazu.theone.net.OkHttpClientManager;
import com.yumikoazu.theone.utils.DateUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/30.
 */
public class ArticleFragment extends Fragment implements PullToRefreshBase.OnRefreshListener<ViewPager> {

    private static ArticleFragment sArticleFragment;
    @Bind(R.id.pager)
    PullToRefreshViewPager mPullToRefreshViewPager;
    @Bind(R.id.loadingView)
    UniversalLoadingView mLoadingView;

    /**
     * 接收PullToRefreshViewPager中的ViewPager控件
     */
    private ViewPager mViewPager;

    private boolean mIsRequesting;
    private int mCurrentViewPagerPage;
    private int row = 1;
    private List<ArticlePager> mArticlePagers;
    private ArticlePagerAdapter mArticlePagerAdapter;
    private boolean isFirst;

    public static ArticleFragment getInstance() {
        if (sArticleFragment == null) {
            sArticleFragment = new ArticleFragment();
        }
        return sArticleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View article = inflater.inflate(R.layout.fragment_article,null);
        ButterKnife.bind(this, article);
        mArticlePagers = new ArrayList<>();
        mViewPager = mPullToRefreshViewPager.getRefreshableView();
        //设置ViewPager的滚动速度
        ViewPagerScr.setViewPagerScrollSpeed(mViewPager, 400);
        mPullToRefreshViewPager.setOnRefreshListener(this);
        mViewPager.setOnPageChangeListener(onPageChangeListener);
        return article;
    }

    private ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        public void onPageScrollStateChanged(int paramInt) {
        }

        public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {
        }

        public void onPageSelected(int position) {
            if (position > -10 + mArticlePagers.size() && !mIsRequesting) {
                fetchData();
            }
        }
    };

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fetchData();


        if (!isFirst) {
            fetchData();
            isFirst = true;
        }
    }

    /**
     * 加载数据
     */
    private void fetchData() {
        String date = DateUtil.getTheDate();
        Log.d("date", date);

        fetch(date, row);
        row++;
    }


    private void fetch(String date, int index) {
        OkHttpClientManager.postAsyn(
                ApiConstants.ARTICLEURL,
                new OkHttpClientManager.Param[]{
                        new OkHttpClientManager.Param("strDate", date),
                        new OkHttpClientManager.Param("strRow", "" + index)
                },
                new MyResultCallback<ArticlePager>() {

                    @Override
                    public void onBefore() {
                        super.onBefore();
                        mLoadingView.postLoadState(UniversalLoadingView.State.LOADING);
                    }

                    @Override
                    public void onAfter() {
                        super.onAfter();
                        mLoadingView.postLoadState(UniversalLoadingView.State.GONE);
                    }

                    @Override
                    public void onError(Request request, Exception e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(ArticlePager articlePager) {
                        LogUtils.d(articlePager);
                        updateAppAdapter(articlePager);
                    }
                }
        );


    }


    private void updateAppAdapter(ArticlePager articlePager) {
        if ((getActivity() == null) || (getActivity().isFinishing())) {
            return;
        }

        if (articlePager == null) {
            return;
        }

        if (mArticlePagerAdapter == null) {
            mCurrentViewPagerPage = 0;
            mArticlePagerAdapter = new ArticlePagerAdapter(getChildFragmentManager(), articlePager);
            mViewPager.setAdapter(mArticlePagerAdapter);
        } else {
            mArticlePagerAdapter.addArticlePagerList(articlePager);
            mArticlePagerAdapter.notifyDataSetChanged();
        }

        int size = mArticlePagers.size();
        mArticlePagers = mArticlePagerAdapter.getArticlePagers();

        if (mViewPager.getCurrentItem() == size - 1)
            mViewPager.setCurrentItem(1 + mViewPager.getCurrentItem(), true);

    }


    /**
     * viewPager刷新或加载更多监听
     *
     * @param pullToRefreshBase
     */
    public void onRefresh(PullToRefreshBase<ViewPager> pullToRefreshBase) {
        if (this.mIsRequesting)
            return;
        if (pullToRefreshBase.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_END) {//最右
            mIsRequesting = true;
            new Handler().post(
                    new Runnable() {
                        @Override
                        public void run() {
                            mPullToRefreshViewPager.onRefreshComplete();
                            fetchData();
                            mIsRequesting = false;
                        }
                    }
            );

        } else if (pullToRefreshBase.getCurrentMode() == PullToRefreshBase.Mode.PULL_FROM_START) {//最左
            mIsRequesting = true;
            new Handler().postDelayed(
                    new Runnable() {
                        @Override
                        public void run() {
                            mPullToRefreshViewPager.onRefreshComplete();
                            mIsRequesting = false;
                        }
                    }, 2000
            );
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
