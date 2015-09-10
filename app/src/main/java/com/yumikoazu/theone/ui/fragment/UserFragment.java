package com.yumikoazu.theone.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yumikoazu.theone.R;

/**
 * Created by joker on 2015/8/30.
 */
public class UserFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View user = inflater.inflate(R.layout.fragment_user,container,false);
        return user;
    }
}
