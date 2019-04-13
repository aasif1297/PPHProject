package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BegLevel4 extends AppCompatActivity {

    private static final String TAG = "BEG_LEVEL4_BOSS";
    private Beg4Level4Adapter mBeg4Leve14Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_level4);
        mBeg4Leve14Adapter = new Beg4Level4Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_level4);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs4);
        tabLayout.setupWithViewPager(mViewPager);

    //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        Beg4Level4Adapter adapter = new Beg4Level4Adapter(getSupportFragmentManager());
        adapter.addFragment(new BegLevel4Week1(), "Week 1");
        adapter.addFragment(new BegLevel4Week2(), "Week 2");
        adapter.addFragment(new BegLevel4Week3(), "Week 3");
        adapter.addFragment(new BegLevel4Week4(), "Week 4");
        adapter.addFragment(new BegLevel4Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


