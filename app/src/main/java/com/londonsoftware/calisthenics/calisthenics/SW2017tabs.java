package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SW2017tabs extends AppCompatActivity {

    private static final String TAG = "SW2017";
    public SW2017_Adapter mSW2017_Adapter;
    public ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sw2017tabs);
        mSW2017_Adapter = new SW2017_Adapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container_level1);
        setupViewPager(mViewPager);



        Toolbar toolbar = findViewById(R.id.toolbar);
        TabLayout tabLayout = findViewById(R.id.tabs);
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
        SW2017_Adapter adapter = new SW2017_Adapter(getSupportFragmentManager());
        adapter.addFragment(new SW2017Tab1(), "Battle 1");
        adapter.addFragment(new SWReps2017Tab2(), "Battle 2");
        adapter.addFragment(new SWReps2017Tab3(), "Battle 3");
        adapter.addFragment(new SWReps2017Tab4(), "Battle 4");
        viewPager.setAdapter(adapter);
    }
}


