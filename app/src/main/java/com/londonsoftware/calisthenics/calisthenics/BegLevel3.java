package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BegLevel3 extends AppCompatActivity {

    private static final String TAG = "BEG_LEVEL3_BOSS";
    private Beg3Level3Adapter mBeg3Leve13Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_level3);
        mBeg3Leve13Adapter = new Beg3Level3Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_level3);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs3);
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
        Beg3Level3Adapter adapter = new Beg3Level3Adapter(getSupportFragmentManager());
        adapter.addFragment(new BegLevel3Week1(), "Week 1");
        adapter.addFragment(new BegLevel3Week2(), "Week 2");
        adapter.addFragment(new BegLevel3Week3(), "Week 3");
        adapter.addFragment(new BegLevel3Week4(), "Week 4");
        adapter.addFragment(new BegLevel3Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


