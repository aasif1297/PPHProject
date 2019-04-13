package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AdvLevel5 extends AppCompatActivity {

    private static final String TAG = "ADV_LEVEL5_BOSS";
    private Adv5Level5Adapter mAdv5Level5Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adv_level5);
        mAdv5Level5Adapter = new Adv5Level5Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_adv5);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_adv5);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_adv5);
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
        Adv5Level5Adapter adapter = new Adv5Level5Adapter(getSupportFragmentManager());
        adapter.addFragment(new AdvLevel5Week1(), "Week 1");
        adapter.addFragment(new AdvLevel5Week2(), "Week 2");
        adapter.addFragment(new AdvLevel5Week3(), "Week 3");
        viewPager.setAdapter(adapter);
    }
}


