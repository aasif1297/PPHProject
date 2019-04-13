package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Pullups_Exercise extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pullups_exercise);

        //Place all image button IDs here
        ImageButton pullnormal = findViewById(R.id.pull_normal);
        ImageButton chinup = findViewById(R.id.chin_ups);
        ImageButton closegrip_pull = findViewById(R.id.closegrip_pulls);
        ImageButton closegrip_chin = findViewById(R.id.closegrip_chins);
        ImageButton widegrip_pull = findViewById(R.id.widegrip_pulls);
        ImageButton widegrip_chin = findViewById(R.id.widegrip_chinups);
        ImageButton bandpulls = findViewById(R.id.band_pulls);
        ImageButton deadhang = findViewById(R.id.deadhang);
        ImageButton isometric = findViewById(R.id.isometric_holds);
        ImageButton aussie = findViewById(R.id.aussie_pulls);
        ImageButton negative_pullup = findViewById(R.id.negative_pullups);
        ImageButton neutral_grip = findViewById(R.id.neutral_grip_pullups);
        ImageButton commando = findViewById(R.id.commando_pulls);
        ImageButton highpull = findViewById(R.id.high_pullups);
        ImageButton behind_the_neck = findViewById(R.id.behindtheneck_pulls);
        ImageButton type_writers = findViewById(R.id.type_writers);
        ImageButton archer = findViewById(R.id.archer_pullups);
        ImageButton clapping = findViewById(R.id.clapping_pullups);
        ImageButton l_sit_chinup = findViewById(R.id.lsit_chinups);
        ImageButton scapula = findViewById(R.id.scapula_pullups);
        ImageButton weighted_pulls = findViewById(R.id.weighted_pullups);
        ImageButton onearm = findViewById(R.id.onearm_pullup);
        ImageButton ringpull = findViewById(R.id.ring_pullups);

        TextView pullnormal_text = findViewById(R.id.pullup_normal_textview);
        TextView chinnormal_text = findViewById(R.id.chinup_textview);
        TextView closegrippull_text = findViewById(R.id.pull_closegrip_textview);
        TextView closegripchin_text = findViewById(R.id.chin_closegrip_textview2);
        TextView widepull_text = findViewById(R.id.pull_widegrip_textview);
        TextView widegrip_chin_text = findViewById(R.id.chin_widegrip_textview);
        TextView bandpull_text = findViewById(R.id.bandpulls_textview3);
        TextView deadhang_text = findViewById(R.id.deadhang_textview);
        TextView iso_text = findViewById(R.id.isometric_textview);
        TextView asssuie_text = findViewById(R.id.austa_textview);
        TextView negative_pulltext = findViewById(R.id.negative_textview);
        TextView neutral_text = findViewById(R.id.neutral_textview);
        TextView commando_text = findViewById(R.id.commando_textview);
        TextView highpull_text = findViewById(R.id.highpull_textview);
        TextView neck_text = findViewById(R.id.neck_textview);
        TextView typewriter_text = findViewById(R.id.typewriter_textview);
        TextView archer_text = findViewById(R.id.archer_textview);
        TextView clapping_text = findViewById(R.id.clapping_textview);
        TextView ringpull_text = findViewById(R.id.gripswitch_textview);
        TextView lsitchin_text = findViewById(R.id.sitchin_textview);
        TextView scapula_text = findViewById(R.id.scapula_textview);
        TextView weighted_text = findViewById(R.id.weighted_textview);
        TextView onearm_text = findViewById(R.id.onearm_textview);





        closegrippull_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Pull.class);
                startActivity(intent);
            }
        });

        closegripchin_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Chin.class);
                startActivity(intent);
            }
        });

        widepull_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Pull.class);
                startActivity(intent);
            }
        });

        widegrip_chin_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Chin.class);
                startActivity(intent);
            }
        });

        bandpull_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        deadhang_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        iso_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        asssuie_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Aussie.class);
                startActivity(intent);
            }
        });

        negative_pulltext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Negative.class);
                startActivity(intent);
            }
        });

        neutral_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Neutral.class);
                startActivity(intent);
            }
        });

        commando_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Commando.class);
                startActivity(intent);
            }
        });

        highpull_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Highpull.class);
                startActivity(intent);
            }
        });

        neck_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Behindtheneck.class);
                startActivity(intent);
            }
        });

        typewriter_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Typewriters.class);
                startActivity(intent);
            }
        });

        archer_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Archer.class);
                startActivity(intent);
            }
        });

        clapping_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Clapping.class);
                startActivity(intent);
            }
        });

        ringpull_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ringpulls.class);
                startActivity(intent);
            }
        });

        lsitchin_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lsit_Chinup.class);
                startActivity(intent);
            }
        });

        scapula_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Scapula.class);
                startActivity(intent);
            }
        });

        weighted_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        onearm_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Onearm.class);
                startActivity(intent);
            }
        });


        //Place all ClickListeners for the Imagebuttons here
        pullnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        pullnormal_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });


        chinnormal_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });






















        chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        closegrip_pull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Pull.class);
                startActivity(intent);
            }
        });

        closegrip_chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Chin.class);
                startActivity(intent);
            }
        });

        widegrip_pull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Pull.class);
                startActivity(intent);
            }
        });

        widegrip_chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Chin.class);
                startActivity(intent);
            }
        });

        bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        isometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        aussie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Aussie.class);
                startActivity(intent);
            }
        });

        negative_pullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Negative.class);
                startActivity(intent);
            }
        });

        neutral_grip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Neutral.class);
                startActivity(intent);
            }
        });

        commando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Commando.class);
                startActivity(intent);
            }
        });

        highpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Highpull.class);
                startActivity(intent);
            }
        });

        behind_the_neck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Behindtheneck.class);
                startActivity(intent);
            }
        });

        type_writers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Typewriters.class);
                startActivity(intent);
            }
        });

        archer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Archer.class);
                startActivity(intent);
            }
        });

        clapping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Clapping.class);
                startActivity(intent);
            }
        });


        l_sit_chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lsit_Chinup.class);
                startActivity(intent);
            }
        });

        scapula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Scapula.class);
                startActivity(intent);
            }
        });

        weighted_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        onearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Onearm.class);
                startActivity(intent);
            }
        });

        ringpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ringpulls.class);
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


