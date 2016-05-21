package com.liger.dingdingpai.customview;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liger.dingdingpai.R;

/**
 * Created by Liger on 2016/5/21.
 */
public class TestCustomView extends LinearLayout {

    private TextView tv_name;
    private Button btn_play,btn_delete;

    public TestCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.HORIZONTAL);
        setLayoutParams(new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        tv_name = new TextView(context);
        btn_delete = new Button(context);
        btn_delete = new Button(context);
        addView(tv_name);
        addView(btn_play);
        addView(btn_delete);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.testcustomview, container, false);
        return view;
    }
}
