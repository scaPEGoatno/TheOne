package com.yumikoazu.theone.net;

/**
 * Created by joker on 2015/8/31.
 */
public abstract class MyResultCallback<T> extends OkHttpClientManager.ResultCallback<T> {

    @Override
    public void onBefore() {
        super.onBefore();

    }

    @Override
    public void onAfter() {
        super.onAfter();

    }
}