package com.yumikoazu.theone.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yumikoazu.theone.R;
import com.yumikoazu.theone.bean.StowPager;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/30.
 */
public class StowPagerFragment extends Fragment {

    @Bind(R.id.buIv)
    ImageView mBuIv;
    @Bind(R.id.strTrTv)
    TextView mStrTrTv;
    @Bind(R.id.strTcTv)
    TextView mStrTcTv;
    @Bind(R.id.dateTv)
    TextView mDateTv;

    private StowPager mStowPager;

    public static StowPagerFragment getInstance(StowPager stowPager) {
        StowPagerFragment StowPagerFragment = new StowPagerFragment();
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("stowPager", stowPager);
        StowPagerFragment.setArguments(localBundle);
        return StowPagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mStowPager = (StowPager) getArguments().getParcelable("stowPager");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View stow = inflater.inflate(R.layout.fragment_stow_pager, container, false);
        ButterKnife.bind(this, stow);
        initData();
        return stow;
    }

    private void initData() {
        String[] date = mStowPager.getEntTg().getStrTm().split("-");
        String month = date[1];
        String year = date[0];
        String day = date[2];

        String str = month + " " + day + "," + year;
        mDateTv.setText(str);
        Glide.with(this).load(mStowPager.getEntTg().getStrBu()).centerCrop()
             .placeholder(R.drawable.placeholder).crossFade().into(mBuIv);

        mStrTrTv.setText(mStowPager.getEntTg().getStrTt());
        mStrTcTv.setText( mStowPager.getEntTg().getStrTc());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
