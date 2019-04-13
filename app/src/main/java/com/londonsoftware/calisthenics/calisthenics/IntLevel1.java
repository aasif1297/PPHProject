package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class IntLevel1 extends AppCompatActivity {

    private static final String TAG = "INT_LEVEL1_BOSS";
    private Int1Level1Adapter mInt1Level1Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_level1);
        mInt1Level1Adapter = new Int1Level1Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_level1);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_int1);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_int1);
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
        Int1Level1Adapter adapter = new Int1Level1Adapter(getSupportFragmentManager());
        adapter.addFragment(new IntLevel1Week1(), "Week 1");
        adapter.addFragment(new IntLevel1Week2(), "Week 2");
        adapter.addFragment(new IntLevel1Week3(), "Week 3");
        adapter.addFragment(new IntLevel1Week4(), "Week 4");
        adapter.addFragment(new IntLevel1Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


