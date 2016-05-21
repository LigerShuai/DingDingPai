package com.liger.dingdingpai.tab;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.liger.dingdingpai.R;

/**
 * Created by Liger on 2016/5/22.
 */
public class MyTab extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytab);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        TabHost.TabSpec page1 = tabHost.newTabSpec("tab1").setIndicator("Obama").setContent(R.id.first);
        TabHost.TabSpec page2 = tabHost.newTabSpec("tab2").setIndicator("Putin").setContent(R.id.second);
        TabHost.TabSpec page3 = tabHost.newTabSpec("tab3").setIndicator("Me").setContent(R.id.third);

        tabHost.addTab(page1);
        tabHost.addTab(page2);
        tabHost.addTab(page3);


      /*  TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        TabHost.TabContentFactory contentFactory = new TabHost.TabContentFactory(){

            @Override
            public View createTabContent(String tag) {
                TextView textView = new TextView(MyTab.this);
                textView.setText(tag);
                return textView;
            }
        };
        for (char i = 'a'; i < 'e'; i++) {
            String tag = Character.toString(i);
            tabHost.addTab(tabHost.newTabSpec(tag).setIndicator(tag).setContent(contentFactory));
        }*/
//        for (int i=0;i<4;i++) {
//            String tag = String.valueOf(i);
//            tabHost.addTab(tabHost.newTabSpec(tag).setIndicator(tag).setContent(contentFactory));
//        }
    }
}
