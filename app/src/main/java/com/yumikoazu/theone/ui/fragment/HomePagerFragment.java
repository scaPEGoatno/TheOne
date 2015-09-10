package com.yumikoazu.theone.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yumikoazu.theone.R;
import com.yumikoazu.theone.bean.HomePager;
import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/31.
 */
public class HomePagerFragment extends Fragment {

    @Bind(R.id.home_strHpTitle)
    TextView mHomeStrHpTitle;
    @Bind(R.id.homeIv)
    ImageView mHomeIv;
    @Bind(R.id.home_name)
    TextView mHomeName;
    @Bind(R.id.home_author)
    TextView mHomeAuthor;
    @Bind(R.id.home_day)
    TextView mHomeDay;
    @Bind(R.id.home_date)
    TextView mHomeDate;
    @Bind(R.id.home_strContent)
    TextView mHomeStrContent;
    @Bind(R.id.laudTv)
    TextView mLaudTv;

    private HomePager mHomePager;

    public static HomePagerFragment getInstance(HomePager homePager) {
        Log.d("tt","hhhhh");
        HomePagerFragment homePagerFragment = new HomePagerFragment();
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("homePager", homePager);
        homePagerFragment.setArguments(localBundle);
        return homePagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mHomePager = (HomePager) getArguments().getParcelable("homePager");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View homePagerView = inflater.inflate(R.layout.fragment_home_pager, null);
        ButterKnife.bind(this, homePagerView);
        initData();
        return homePagerView;
    }

    private void initData() {
        Log.d("tt",mHomePager.getHpEntity().getStrHpTitle());
        mHomeStrHpTitle.setText(mHomePager.getHpEntity().getStrHpTitle());
        Glide.with(this).load(mHomePager.getHpEntity().getStrThumbnailUrl()).centerCrop()
             .placeholder(R.drawable.testt).crossFade().into(mHomeIv);

        String[] auth = mHomePager.getHpEntity().getStrAuthor().split("&");
        String name = auth[0];
        String author = auth[1];

        mHomeName.setText(name);
        mHomeAuthor.setText(author);

        String[] date = mHomePager.getHpEntity().getStrMarketTime().split("-");
        String month = date[1];
        String year = date[0];
        String day = date[2];

        String d = month + "," + year;
        mHomeDay.setText(day);
        mHomeDate.setText(d);
        mHomeStrContent.setText(mHomePager.getHpEntity().getStrContent());
        mLaudTv.setText(mHomePager.getHpEntity().getStrPn());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
