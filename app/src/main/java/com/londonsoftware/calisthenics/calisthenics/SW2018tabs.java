package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SW2018tabs extends AppCompatActivity {

    private static final String TAG = "SW2018";
    public SW2018_Adapter mSW2018_Adapter;
    public ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sw2018tabs);
        mSW2018_Adapter = new SW2018_Adapter(getSupportFragmentManager());
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
        SW2018_Adapter adapter = new SW2018_Adapter(getSupportFragmentManager());
        adapter.addFragment(new SW2018Tab1(), "Battle 1");
        adapter.addFragment(new SW2018Tab2(), "Battle 2");
        adapter.addFragment(new SW2018Tab3(), "Battle 3");
        adapter.addFragment(new SW2018Tab4(), "Battle 4");
        viewPager.setAdapter(adapter);
    }
}


