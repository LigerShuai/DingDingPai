package com.liger.dingdingpai.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liger.dingdingpai.R;

/**
 * Created by Liger on 2016/5/20.
 */
public class Me extends Fragment {

    public Me newInstance() {
        return new Me();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.me, container, false);
        return view;
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("shuai", "pause fragment me");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("shuai", "destroy fragment me");
    }
}
