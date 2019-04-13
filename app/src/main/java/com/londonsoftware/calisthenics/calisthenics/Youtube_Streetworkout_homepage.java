package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Youtube_Streetworkout_homepage extends AppCompatActivity {
    Button sm2019, sm2018, sm2017, sm2016;
    ImageView smtext2019, smtext2018, smtext2017, smtext2016;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_streetworkout_homepage);


        sm2019 = findViewById(R.id.textview_sw2019);
        sm2018 = findViewById(R.id.textview_sw2018);
        sm2017 = findViewById(R.id.textview3_sw2017);
        sm2016 = findViewById(R.id.textview4_sw2016);

       smtext2019 = findViewById(R.id.circleImageView_sw2019);
        smtext2018 = findViewById(R.id.circleImageView2_sw2018);
        smtext2017 = findViewById(R.id.circleImageView3_sw2017);
        smtext2016 = findViewById(R.id.circleImageView4_sw2016);

        sm2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2019tabs.class);
                startActivity(intent);
            }
        });


        sm2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2018tabs.class);
                startActivity(intent);
            }
        });

        sm2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2017tabs.class);
                startActivity(intent);
            }
        });

        sm2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2016tabs.class);
                startActivity(intent);
            }
        });




        smtext2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2019tabs.class);
                startActivity(intent);
            }
        });


        smtext2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2018tabs.class);
                startActivity(intent);
            }
        });

        smtext2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2017tabs.class);
                startActivity(intent);
            }
        });

        smtext2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SW2016tabs.class);
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

