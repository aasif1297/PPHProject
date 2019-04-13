package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdvLevel4 extends AppCompatActivity {

    private static final String TAG = "ADV_LEVEL4_BOSS";
    private Adv4Level4Adapter mAdv4Level4Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_level4);
        mAdv4Level4Adapter = new Adv4Level4Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_adv4);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_adv4);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_adv4);
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
        Adv4Level4Adapter adapter = new Adv4Level4Adapter(getSupportFragmentManager());
        adapter.addFragment(new AdvLevel4Week1(), "Week 1");
        adapter.addFragment(new AdvLevel4Week2(), "Week 2");
        adapter.addFragment(new AdvLevel4Week3(), "Week 3");
        viewPager.setAdapter(adapter);
    }
}


