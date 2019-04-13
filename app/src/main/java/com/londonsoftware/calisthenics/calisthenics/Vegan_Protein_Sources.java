package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Vegan_Protein_Sources extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vegan_protein_sources);


        ImageButton hemp = findViewById(R.id.hemp_imagebutton);
        TextView hemp_text = findViewById(R.id.hemp_textview);

        ImageButton pumpkin = findViewById(R.id.pumpkinseed_imagebutton);
        TextView pumpkin_text = findViewById(R.id.pumpkinseed_textview);

        ImageButton chia = findViewById(R.id.chiaseed_imagebutton);
        TextView chia_text = findViewById(R.id.chiaseed_textview);

        ImageButton pea = findViewById(R.id.peaprotein_imagebutton);
        TextView pea_text = findViewById(R.id.peaprotein_textview2);

        ImageButton rice = findViewById(R.id.riceprotein_imagebutton);
        TextView rice_text = findViewById(R.id.riceprotein_textview);

        ImageButton walnut = findViewById(R.id.walnutflour_imagebutton);
        TextView walnut_text = findViewById(R.id.walnutflour_textview);




        hemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hemp_Powder.class);
                startActivity(intent);
            }
        });

        hemp_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hemp_Powder.class);
                startActivity(intent);
            }
        });






        pumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pumpkin_Seed_Powder.class);
                startActivity(intent);
            }
        });

        pumpkin_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pumpkin_Seed_Powder.class);
                startActivity(intent);
            }
        });



        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chia_Seed_Powder.class);
                startActivity(intent);
            }
        });

        chia_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chia_Seed_Powder.class);
                startActivity(intent);
            }
        });


        pea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pea_Protein_Powder.class);
                startActivity(intent);
            }
        });

        pea_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pea_Protein_Powder.class);
                startActivity(intent);
            }
        });


        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rice_Protein_Powder.class);
                startActivity(intent);
            }
        });

        rice_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Rice_Protein_Powder.class);
                startActivity(intent);
            }
        });

        walnut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Walnut_Flour.class);
                startActivity(intent);
            }
        });

        walnut_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Walnut_Flour.class);
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


