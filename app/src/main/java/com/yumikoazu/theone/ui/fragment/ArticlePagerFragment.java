package com.yumikoazu.theone.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apkfuns.logutils.LogUtils;
import com.yumikoazu.theone.R;
import com.yumikoazu.theone.bean.ArticlePager;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/30.
 */
public class ArticlePagerFragment extends Fragment {

    @Bind(R.id.dateTv)
    TextView mDateTv;
    @Bind(R.id.titleTv)
    TextView mTitleTv;
    @Bind(R.id.authTv)
    TextView mAuthTv;
    @Bind(R.id.contentTv)
    TextView mContentTv;
    @Bind(R.id.authorIntroduceTv)
    TextView mAuthorIntroduceTv;
    @Bind(R.id.laudTv)
    TextView mLaudTv;
    @Bind(R.id.laudIv)
    ImageView mLaudIv;
    @Bind(R.id.authorTv)
    TextView mAuthorTv;
    @Bind(R.id.swbnTv)
    TextView mSwbnTv;
    @Bind(R.id.sAuthTv)
    TextView mSAuthTv;

    private ArticlePager mArticlePager;


    public static ArticlePagerFragment getInstance(ArticlePager articlePager) {
        ArticlePagerFragment articlePagerFragment = new ArticlePagerFragment();
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("articlePager", articlePager);
        articlePagerFragment.setArguments(localBundle);
        return articlePagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mArticlePager = (ArticlePager) getArguments().getParcelable("articlePager");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View article = inflater.inflate(R.layout.fragment_article_pager, null);
        ButterKnife.bind(this, article);
        initData();
        return article;
    }

    private void initData() {

        LogUtils.d(mArticlePager);
        String[] date = mArticlePager.getContentEntity().getStrContMarketTime().split("-");
        String month = date[1];
        String year = date[0];
        String day = date[2];

        String str = month + " " + day + "," + year;
        mDateTv.setText(str);
        LogUtils.d(str);
        mTitleTv.setText(mArticlePager.getContentEntity().getStrContTitle());
        mAuthTv.setText(mArticlePager.getContentEntity().getStrContAuthor());
        mContentTv.setText(Html.fromHtml(mArticlePager.getContentEntity().getStrContent()));
        LogUtils.d(mArticlePager.getContentEntity().getStrContent());
        mAuthorIntroduceTv.setText(mArticlePager.getContentEntity().getStrContAuthorIntroduce());
        mLaudTv.setText(mArticlePager.getContentEntity().getStrPraiseNumber());
        mAuthorTv.setText(mArticlePager.getContentEntity().getStrContAuthor());
        mSwbnTv.setText(mArticlePager.getContentEntity().getSWbN());
        mSAuthTv.setText(mArticlePager.getContentEntity().getSAuth());

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
