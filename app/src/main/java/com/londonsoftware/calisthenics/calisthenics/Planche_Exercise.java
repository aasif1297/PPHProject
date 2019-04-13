package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Planche_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planche_exercise);

        ImageButton planche = findViewById(R.id.planche_imagebutton);
        ImageButton straddle_planche = findViewById(R.id.straddle_planche_imagebutton);
        ImageButton planche_tucks = findViewById(R.id.planche_tucks_imagebutton);
        ImageButton maltese = findViewById(R.id.maltese_imagebutton);
        ImageButton planche_pushups = findViewById(R.id.planche_pushups_imagebutton);

        TextView planche_text = findViewById(R.id.pullup_normal_textview);
        TextView straddle_planche_text = findViewById(R.id.chinup_textview);
        TextView planche_tucks_text = findViewById(R.id.pull_closegrip_textview);
        TextView maltese_text = findViewById(R.id.chin_closegrip_textview2);
        TextView planche_pushups_text = findViewById(R.id.chin_widegrip_textview);





        planche_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche.class);
                startActivity(intent);
            }
        });

        straddle_planche_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        planche_tucks_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Tucks.class);
                startActivity(intent);
            }
        });

        maltese_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Maltese.class);
                startActivity(intent);
            }
        });


        planche_pushups_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Pushups.class);
                startActivity(intent);
            }
        });






        planche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche.class);
                startActivity(intent);
            }
        });

        straddle_planche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        planche_tucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Tucks.class);
                startActivity(intent);
            }
        });

        maltese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Maltese.class);
                startActivity(intent);
            }
        });


        planche_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Pushups.class);
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


