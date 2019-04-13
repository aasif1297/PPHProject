package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fitnessprograms_New_tabs extends Fragment{
    View view;

    private static final String TAG = "FITVIDS";
    public ViewPager mViewPager;











    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fitnessprograms_new, container, false);

        mViewPager = view.findViewById(R.id.container_level1);
        setupViewPager(mViewPager);


        TabLayout tabLayout = view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        return view;
    }



    private void setupViewPager(ViewPager viewPager) {
        FitnessPrograms_New_Adapter adapter = new FitnessPrograms_New_Adapter(getChildFragmentManager());
        adapter.addFragment(new Fitnessprograms_Tab1(), "Beginner");
        adapter.addFragment(new Fitnessprograms_Tab2(), "Intermediate");
        adapter.addFragment(new Fitnessprograms_Tab3(), "Advanced");
        viewPager.setAdapter(adapter);
    }
}


