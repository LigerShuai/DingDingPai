package com.liger.dingdingpai.fragment.childFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liger.dingdingpai.R;

/**
 * Created by Liger on 2016/5/20.
 */
public class Square extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.square, container, false);
        return view;
    }
}
