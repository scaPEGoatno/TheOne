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
import com.yumikoazu.theone.adapter.HomePagerAdapter;
import com.yumikoazu.theone.bean.HomePager;
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
public class HomeFragment extends Fragment implements PullToRefreshBase.OnRefreshListener<ViewPager> {

    private static HomeFragment sHomeFragment;

    @Bind(R.id.pager)
    PullToRefreshViewPager mPullToRefreshViewPager;
    @Bind(R.id.loadingView)
    UniversalLoadingView mLoadingView;


    /**
     * 接收PullToRefreshViewPager中的ViewPager控件
     */
    private ViewPager mViewPager;

    private HomePagerAdapter mHomePagerAdapter;

    private boolean mIsRequesting;

    private List<HomePager> mHomePagers;
    private int mCurrentViewPagerPage;


    private int row = 1;
    private boolean isFirst;


    public static HomeFragment getInstance() {
        if (sHomeFragment == null) {
            sHomeFragment = new HomeFragment();
        }
        return sHomeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View home = inflater.inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, home);

        mHomePagers = new ArrayList<>();
        mViewPager = mPullToRefreshViewPager.getRefreshableView();
        //设置ViewPager的滚动速度
        ViewPagerScr.setViewPagerScrollSpeed(mViewPager, 400);
        mPullToRefreshViewPager.setOnRefreshListener(this);
        mViewPager.setOnPageChangeListener(onPageChangeListener);
        return home;
    }


    private ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
        public void onPageScrollStateChanged(int paramInt) {
        }

        public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {
        }

        public void onPageSelected(int position) {
            if (position > -10 + mHomePagers.size() && !mIsRequesting) {
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
                ApiConstants.HOMEURL,
                new OkHttpClientManager.Param[]{
                        new OkHttpClientManager.Param("strDate", date),
                        new OkHttpClientManager.Param("strRow", "" + index)
                },
                new MyResultCallback<HomePager>() {

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
                    public void onResponse(HomePager homePager) {
                        LogUtils.d(homePager);
                        updateAppAdapter(homePager);
                    }
                }
        );


    }


    private void updateAppAdapter(HomePager homePager) {
        if ((getActivity() == null) || (getActivity().isFinishing())) {
            return;
        }

        if (homePager == null) {
            return;
        }

        if (mHomePagerAdapter == null) {
            mCurrentViewPagerPage = 0;
            mHomePagerAdapter = new HomePagerAdapter(getChildFragmentManager(), homePager);
            mViewPager.setAdapter(mHomePagerAdapter);
        } else {
            mHomePagerAdapter.addHomePagerList(homePager);
            mHomePagerAdapter.notifyDataSetChanged();
        }

        int size = mHomePagers.size();
        mHomePagers = mHomePagerAdapter.getHomePagers();

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
