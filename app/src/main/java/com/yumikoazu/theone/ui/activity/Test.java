package com.yumikoazu.theone.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.squareup.okhttp.Request;
import com.yumikoazu.theone.R;
import com.yumikoazu.theone.bean.HomePager;
import com.yumikoazu.theone.net.MyResultCallback;
import com.yumikoazu.theone.net.OkHttpClientManager;

/**
 * Created by joker on 2015/8/31.
 */
public class Test extends Activity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home_pager);

//        OkHttpClientManager.postAsyn(
//                "http://rest.wufazhuce.com/OneForWeb/one/getHp_N",
//                new OkHttpClientManager.Param[]{
//                        new OkHttpClientManager.Param("strDate", "2015-08-28"),
//                        new OkHttpClientManager.Param("strRow", "" + 1)
//                },
//                new MyResultCallback<HomePager>() {
//                    @Override
//                    public void onError(Request request, Exception e) {
//                        e.printStackTrace();
//                    }
//
//                    @Override
//                    public void onResponse(HomePager h) {
//                        Log.d("test", h.toString());
//                    }
//                }
//        );

        OkHttpClientManager.getAsyn(
                "http://rest.wufazhuce.com/OneForWeb/one/getC_N?strDate=2015-09-03&strRow=1&strMS=1",
                new MyResultCallback<HomePager>() {
                    @Override
                    public void onError(Request request, Exception e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(HomePager h) {
                        Log.d("test", h.toString());
                    }
                }
        );



    }
}
