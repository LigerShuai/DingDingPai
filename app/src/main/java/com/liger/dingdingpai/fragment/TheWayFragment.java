package com.liger.dingdingpai.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.liger.dingdingpai.R;
import com.liger.dingdingpai.fragment.childFragment.Neighbor;
import com.liger.dingdingpai.fragment.childFragment.Newest;
import com.liger.dingdingpai.fragment.childFragment.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liger on 2016/5/20.
 */
public class TheWayFragment extends Fragment {

    private Square square;
    private Newest newest;
    private Neighbor neighbor;
    private List<Fragment> fragments;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    private RadioGroup radioGroup;
    private RadioButton squareBtn;
    private RadioButton newestBtn;
    private RadioButton neighboorBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ontheway, container, false);
        initFragments();
        initView(view);
        return view;
    }

    private void initView(View view) {
        radioGroup = (RadioGroup) view.findViewById(R.id.radio_group_theway_id);
        squareBtn = (RadioButton) view.findViewById(R.id.camera_id);
        newestBtn = (RadioButton) view.findViewById(R.id.gallery_id);
        neighboorBtn = (RadioButton)view.findViewById(R.id.camera_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.squareBtn:
                        switchFragment(square);
                        break;
                    case R.id.newestBtn:
                        switchFragment(newest);
                        break;
                    case R.id.neighboorBtn:
                        switchFragment(neighbor);
                        break;
                }
            }
        });
    }

    private void initFragments() {
        fragments = new ArrayList<>();
        square = new Square();
        newest = new Newest();
        neighbor = new Neighbor();
        fragments.add(square);
        fragments.add(newest);
        fragments.add(neighbor);

        fragmentManager = getChildFragmentManager();
        transaction = fragmentManager.beginTransaction();
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        transaction.add(R.id.fram_theway_content, square, square.getClass().getSimpleName()).commit();
    }

    private void switchFragment(Fragment fragment) {
        fragmentManager = getChildFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fram_theway_content, fragment, fragment.getClass().getSimpleName()).commit();
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("shuai", "pause fragment theway");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("shuai", "destroy fragment theway");
    }
}
