package com.example.com.tourapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MustVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_must_visit);
        ViewPager viewPager= (ViewPager) findViewById(R.id.view_pager);
        SimpleFragmentManager simpleFragmentManager=new SimpleFragmentManager(getSupportFragmentManager(),MustVisit.this);
        viewPager.setAdapter(simpleFragmentManager);
        TabLayout tabLayout= (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
