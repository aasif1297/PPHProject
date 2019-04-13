package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdvLevel1 extends AppCompatActivity {

    private static final String TAG = "ADV_LEVEL1_BOSS";
    private Adv1Level1Adapter mAdv1Level1Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_level1);
        mAdv1Level1Adapter = new Adv1Level1Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_adv1);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_adv1);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_adv1);
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
        Adv1Level1Adapter adapter = new Adv1Level1Adapter(getSupportFragmentManager());
        adapter.addFragment(new AdvLevel1Week1(), "Week 1");
        adapter.addFragment(new AdvLevel1Week2(), "Week 2");
        adapter.addFragment(new AdvLevel1Week3(), "Week 3");
        viewPager.setAdapter(adapter);
    }
}


