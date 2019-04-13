package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BegLevel2 extends AppCompatActivity {

    private static final String TAG = "BEG_LEVEL2_BOSS";
    private Beg2Level2Adapter mBeg2Leve12Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_level2);
        mBeg2Leve12Adapter = new Beg2Level2Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_level2);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs2);
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
        Beg2Level2Adapter adapter = new Beg2Level2Adapter(getSupportFragmentManager());
        adapter.addFragment(new BegLevel2Week1(), "Week 1");
        adapter.addFragment(new BegLevel2Week2(), "Week 2");
        adapter.addFragment(new BegLevel2Week3(), "Week 3");
        adapter.addFragment(new BegLevel2Week4(), "Week 4");
        adapter.addFragment(new BegLevel2Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


