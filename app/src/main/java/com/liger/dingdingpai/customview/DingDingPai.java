//package com.liger.dingdingpai.customview;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.os.PersistableBundle;
//import android.view.Window;
//
//import com.liger.dingdingpai.R;
//
///**
// * Created by Liger on 2016/5/21.
// */
//public class DingDingPai extends Activity {
//
//    private Container container;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        setContentView(R.layout.activity_main);
//    }
//
//    public Container getContainer() {
//        return container;
//    }
//
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        boolean handled = container.onBackPressed();
//        if (!handled) {
//            finish();
//        }
//    }
//}
