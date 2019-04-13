package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Youtube_RepsnSets_homepage extends AppCompatActivity {
    Button m2019, m2018, m2017, m2016;
    ImageView mtext2019, mtext2018, mtext2017, mtext2016;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_repsnsets_homepage);


        m2019 = findViewById(R.id.textview_2019);
        m2018 = findViewById(R.id.textview_2018);
        m2017 = findViewById(R.id.textview3_2017);
        m2016 = findViewById(R.id.textview4_2016);

        mtext2019 = findViewById(R.id.circleImageView_2019);
        mtext2018 = findViewById(R.id.circleImageView2_2018);
        mtext2017 = findViewById(R.id.circleImageView3_2017);
        mtext2016 = findViewById(R.id.circleImageView4_2016);

        m2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2019tabs.class);
                startActivity(intent);
            }
        });


        m2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2018tabs.class);
                startActivity(intent);
            }
        });

        m2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2017tabs.class);
                startActivity(intent);
            }
        });

        m2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2016tabs.class);
                startActivity(intent);
            }
        });




        mtext2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2019tabs.class);
                startActivity(intent);
            }
        });


        mtext2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2018tabs.class);
                startActivity(intent);
            }
        });

        mtext2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2017tabs.class);
                startActivity(intent);
            }
        });

        mtext2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Reps2016tabs.class);
                startActivity(intent);
            }
        });





        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }






}

