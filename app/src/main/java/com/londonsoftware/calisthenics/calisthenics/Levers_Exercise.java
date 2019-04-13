package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Levers_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levers_exercise);

        ImageButton frontlever = findViewById(R.id.front_lever_imagebutton);
        ImageButton backlever = findViewById(R.id.back_lever_imagebutton);
        ImageButton frontlever_kneetucks = findViewById(R.id.frontlever_kneetucks_imagebutton);
        ImageButton backlever_kneetucks = findViewById(R.id.backlever_kneetucks_imagebutton);
        ImageButton bandedlevers = findViewById(R.id.banded_levers_imagebutton);
        ImageButton lever_raises = findViewById(R.id.lever_raises_imagebuttonon);
        ImageButton oneleg_frontlever = findViewById(R.id.one_leg_frontlever_imagebutton);
        ImageButton icecream_makers = findViewById(R.id.iccream_makers_imagebutton);
        ImageButton straddle_lever = findViewById(R.id.straddle_levers_imagebutton);
        ImageButton lever_pullups = findViewById(R.id.lever_pullups_imagebutton);

        TextView frontlever_text = findViewById(R.id.pullup_normal_textview);
        TextView backlever_text = findViewById(R.id.chinup_textview);
        TextView frontlever_kneetucks_text = findViewById(R.id.pull_closegrip_textview);
        TextView backlever_kneetucks_text = findViewById(R.id.chin_closegrip_textview2);
        TextView bandedlevers_text = findViewById(R.id.pull_widegrip_textview);
        TextView lever_raises_text = findViewById(R.id.chin_widegrip_textview);
        TextView oneleg_frontlever_text = findViewById(R.id.bandpulls_textview3);
        TextView icecream_makers_text = findViewById(R.id.isometric_textview);
        TextView straddle_lever_text = findViewById(R.id.austa_textview);
        TextView lever_pullups_text = findViewById(R.id.negative_textview);




        frontlever_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        backlever_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Backlever.class);
                startActivity(intent);
            }
        });

        frontlever_kneetucks_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Frontlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        backlever_kneetucks_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Backlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        bandedlevers_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Banded_Levers.class);
                startActivity(intent);
            }
        });


//Although this uses knee tuck raises, its actually going to be used for lever raises
        lever_raises_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Kneetuck_Raises.class);
                startActivity(intent);
            }
        });

        oneleg_frontlever_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Oneleg_frontlever.class);
                startActivity(intent);
            }
        });

        icecream_makers_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Icecream_Makers.class);
                startActivity(intent);
            }
        });

        straddle_lever_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straddle_Levers.class);
                startActivity(intent);
            }
        });

        lever_pullups_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lever_Pullups.class);
                startActivity(intent);
            }
        });




        frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        backlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Backlever.class);
                startActivity(intent);
            }
        });

        frontlever_kneetucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Frontlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        backlever_kneetucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Backlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        bandedlevers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Banded_Levers.class);
                startActivity(intent);
            }
        });


//Although this uses knee tuck raises, its actually going to be used for lever raises
        lever_raises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Kneetuck_Raises.class);
                startActivity(intent);
            }
        });

        oneleg_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Oneleg_frontlever.class);
                startActivity(intent);
            }
        });

        icecream_makers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Icecream_Makers.class);
                startActivity(intent);
            }
        });

        straddle_lever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straddle_Levers.class);
                startActivity(intent);
            }
        });

        lever_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lever_Pullups.class);
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


