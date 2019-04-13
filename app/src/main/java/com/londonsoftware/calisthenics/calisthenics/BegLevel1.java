package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BegLevel1 extends AppCompatActivity {

    private static final String TAG = "BEG_LEVEL1_BOSS";
    public Beg1Level1Adapter mBeg1Level1Adapter;
    public ViewPager mViewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg_level1);
        mBeg1Level1Adapter = new Beg1Level1Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_level1);
        setupViewPager(mViewPager);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
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
        Beg1Level1Adapter adapter = new Beg1Level1Adapter(getSupportFragmentManager());
        adapter.addFragment(new BegLevel1Week1(), "Week 1");
        adapter.addFragment(new BegLevel1Week2(), "Week 2");
        adapter.addFragment(new BegLevel1Week3(), "Week 3");
        adapter.addFragment(new BegLevel1Week4(), "Week 4");
        adapter.addFragment(new BegLevel1Week5(), "Week 5");
        viewPager.setAdapter(adapter);
    }
}


