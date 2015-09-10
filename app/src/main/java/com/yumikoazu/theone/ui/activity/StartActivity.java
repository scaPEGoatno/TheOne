package com.yumikoazu.theone.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.yumikoazu.theone.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by joker on 2015/8/30.
 */
public class StartActivity extends FragmentActivity {

    @Bind(R.id.image)
    ImageView mImage;
    @Bind(R.id.title)
    TextView mTitle;

    private Animation entrance;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.entrance_image);
        ButterKnife.bind(this);
        init();
    }

    public void init() {


        entrance = AnimationUtils.loadAnimation(this, R.anim.entrance);

        entrance.setAnimationListener(
                new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                        next();

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                }
        );
        mImage.startAnimation(entrance);
    }


    public void next() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(0, R.anim.alpha_out);
    }

}
