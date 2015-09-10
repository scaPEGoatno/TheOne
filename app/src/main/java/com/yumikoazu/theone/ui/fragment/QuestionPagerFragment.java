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

import com.yumikoazu.theone.R;
import com.yumikoazu.theone.bean.QuestionPager;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/30.
 */
public class QuestionPagerFragment extends Fragment {

    @Bind(R.id.dateTv)
    TextView mDateTv;
    @Bind(R.id.questionIv)
    ImageView mQuestionIv;
    @Bind(R.id.questionTitleTv)
    TextView mQuestionTitleTv;
    @Bind(R.id.questionContentTv)
    TextView mQuestionContentTv;
    @Bind(R.id.answerIv)
    ImageView mAnswerIv;
    @Bind(R.id.answerTitleTv)
    TextView mAnswerTitleTv;
    @Bind(R.id.answerContentTv)
    TextView mAnswerContentTv;
    @Bind(R.id.sEditorTv)
    TextView mSEditorTv;
    @Bind(R.id.laudTv)
    TextView mLaudTv;

    private QuestionPager mQuestionPager;

    public static QuestionPagerFragment getInstance(QuestionPager questionPager) {
        QuestionPagerFragment questionPagerFragment = new QuestionPagerFragment();
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("questionPager", questionPager);
        questionPagerFragment.setArguments(localBundle);
        return questionPagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        mQuestionPager = (QuestionPager) getArguments().getParcelable("questionPager");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View question = inflater.inflate(R.layout.fragment_question_pager, container, false);
        ButterKnife.bind(this, question);
        initData();
        return question;
    }

    private void initData() {
        String[] date = mQuestionPager.getQuestionAdEntity().getStrQuestionMarketTime().split("-");
        String month = date[1];
        String year = date[0];
        String day = date[2];

        String str = month + " " + day + "," + year;
        mDateTv.setText(str);
        mQuestionTitleTv.setText(mQuestionPager.getQuestionAdEntity().getStrQuestionTitle());
        mQuestionContentTv.setText(mQuestionPager.getQuestionAdEntity().getStrQuestionContent());
        mAnswerTitleTv.setText(mQuestionPager.getQuestionAdEntity().getStrAnswerTitle());
        mAnswerContentTv.setText(Html.fromHtml(mQuestionPager.getQuestionAdEntity().getStrAnswerContent()));
        mSEditorTv.setText(mQuestionPager.getQuestionAdEntity().getSEditor());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
