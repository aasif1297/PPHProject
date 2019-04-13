package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Reps2016tabs extends AppCompatActivity {

    private static final String TAG = "REPS2016";
    public Reps2016_Adapter mReps2016_Adapter;
    public ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reps2016tabs);
        mReps2016_Adapter = new Reps2016_Adapter(getSupportFragmentManager());
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
        Reps2016_Adapter adapter = new Reps2016_Adapter(getSupportFragmentManager());
        adapter.addFragment(new Reps2016Tab1(), "Battle 1");
        adapter.addFragment(new Reps2016Tab2(), "Battle 2");
        adapter.addFragment(new Reps2016Tab3(), "Battle 3");
        adapter.addFragment(new Reps2016Tab4(), "Battle 4");
        viewPager.setAdapter(adapter);
    }
}


