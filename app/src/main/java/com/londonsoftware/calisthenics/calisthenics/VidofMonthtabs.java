package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class VidofMonthtabs extends AppCompatActivity {

    private static final String TAG = "VIDS";
    public VideofMonth_Adapter mMonthVids_Adapter;
    public ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vidofmonthstabs);
        mMonthVids_Adapter = new VideofMonth_Adapter(getSupportFragmentManager());
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
        VideofMonth_Adapter adapter = new VideofMonth_Adapter(getSupportFragmentManager());
        adapter.addFragment(new VidTab1(), "Pull Ups");
        adapter.addFragment(new VidTab2(), "Push Ups");
        adapter.addFragment(new VidTab3(), "Muscle Ups");
        adapter.addFragment(new VidTab4(), "Handstands ");
        viewPager.setAdapter(adapter);
    }
}


