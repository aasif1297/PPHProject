package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdvLevel3 extends AppCompatActivity {

    private static final String TAG = "ADV_LEVEL3_BOSS";
    private Adv3Level3Adapter mAdv3Level3Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_level3);
        mAdv3Level3Adapter = new Adv3Level3Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_adv3);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_adv3);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_adv3);
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
        Adv3Level3Adapter adapter = new Adv3Level3Adapter(getSupportFragmentManager());
        adapter.addFragment(new AdvLevel3Week1(), "Week 1");
        adapter.addFragment(new AdvLevel3Week2(), "Week 2");
        adapter.addFragment(new AdvLevel3Week3(), "Week 3");
        viewPager.setAdapter(adapter);
    }
}


