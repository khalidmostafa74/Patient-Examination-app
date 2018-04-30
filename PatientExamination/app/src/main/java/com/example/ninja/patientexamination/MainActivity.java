package com.example.ninja.patientexamination;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;




public class MainActivity extends AppCompatActivity {
    int imgs[]={R.drawable.m,R.drawable.mm};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tab = findViewById(R.id.tab);
        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
        tab.setupWithViewPager(pager);
        for (int i =0 ;i<imgs.length;i++){
            tab.getTabAt(i).setIcon(imgs[i]);
        }

    }
}
