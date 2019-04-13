package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdvLevel2 extends AppCompatActivity {

    private static final String TAG = "ADV_LEVEL2_BOSS";
    private Adv2Level2Adapter mAdv2Level2Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_level2);
        mAdv2Level2Adapter = new Adv2Level2Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_adv2);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_adv2);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_adv2);
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
        Adv2Level2Adapter adapter = new Adv2Level2Adapter(getSupportFragmentManager());
        adapter.addFragment(new AdvLevel2Week1(), "Week 1");
        adapter.addFragment(new AdvLevel2Week2(), "Week 2");
        adapter.addFragment(new AdvLevel2Week3(), "Week 3");
        viewPager.setAdapter(adapter);
    }
}


