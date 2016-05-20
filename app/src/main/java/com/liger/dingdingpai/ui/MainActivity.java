package com.liger.dingdingpai.ui;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.liger.dingdingpai.R;
import com.liger.dingdingpai.fragment.CameraFragment;
import com.liger.dingdingpai.fragment.Gallery;
import com.liger.dingdingpai.fragment.Me;
import com.liger.dingdingpai.fragment.TheWayFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    private TheWayFragment theWayFragment;
    private CameraFragment cameraFragment;
    private Gallery gallery;
    private Me me;
    private List<Fragment> fragments;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    private RadioGroup radioGroup;
    private RadioButton theWayBtn;
    private RadioButton cameraBtn;
    private RadioButton galleryBtn;
    private RadioButton meBtn;

    private Fragment currentFragment;

    private static final String theWayTag = TheWayFragment.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initFragment();
        initView();
    }

    private void initView() {
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_main_id);
        theWayBtn = (RadioButton) findViewById(R.id.camera_id);
        galleryBtn = (RadioButton) findViewById(R.id.gallery_id);
        cameraBtn = (RadioButton) findViewById(R.id.camera_id);
        meBtn = (RadioButton) findViewById(R.id.me_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.on_the_way_id:
                        switchFragment(theWayFragment);
                        break;
                    case R.id.camera_id:
                        switchFragment(cameraFragment);
                        break;
                    case R.id.gallery_id:
                    switchFragment(gallery);
                    break;
                    case R.id.me_id:
                        switchFragment(me);
                        break;
                }
            }
        });
    }

    private void initFragment() {
        addFragments();
        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        transaction.add(R.id.ll_frag, theWayFragment, theWayTag).commit();
        currentFragment = theWayFragment;
    }

    private void addFragments() {
        fragments = new ArrayList<>();
        theWayFragment = new TheWayFragment();
        cameraFragment = new CameraFragment();
        gallery = new Gallery();
        me = new Me();
        fragments.add(cameraFragment);
        fragments.add(gallery);
        fragments.add(me);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
      /*  switch (checkedId) {
            case R.id.on_the_way_id:
                switchFragment(theWayFragment);
                break;
            case R.id.camera_id:
                switchFragment(cameraFragment);
                break;
            case R.id.gallery_id:
                switchFragment(gallery);
                break;
            case R.id.me_id:
                switchFragment(me);
                break;
        }*/
    }

    private void switchFragment(Fragment fragment) {
        fragmentManager = getFragmentManager();
        transaction = fragmentManager.beginTransaction();
        if (!fragment.isAdded()) {
            transaction.hide(currentFragment).add(R.id.ll_frag, fragment, fragment.getClass().getSimpleName()).commit();
        } else {
            transaction.hide(currentFragment).show(fragment).commit();
        }
        currentFragment = fragment;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("shuai", "pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("shuai", "destroy");
    }
}
