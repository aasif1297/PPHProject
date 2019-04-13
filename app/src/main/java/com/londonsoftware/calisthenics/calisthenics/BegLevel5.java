package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BegLevel5 extends AppCompatActivity {

    private static final String TAG = "BEG_LEVEL5_BOSS";
    private Beg5Level5Adapter mBeg5Leve15Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_level5);
        mBeg5Leve15Adapter = new Beg5Level5Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_level5);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar5);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs5);
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
        Beg5Level5Adapter adapter = new Beg5Level5Adapter(getSupportFragmentManager());
        adapter.addFragment(new BegLevel5Week1(), "Week 1");
        adapter.addFragment(new BegLevel5Week2(), "Week 2");
        adapter.addFragment(new BegLevel5Week3(), "Week 3");
        adapter.addFragment(new BegLevel5Week4(), "Week 4");
        adapter.addFragment(new BegLevel5Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


