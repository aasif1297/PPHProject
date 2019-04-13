package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Herbal_Teas extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbal_teas);


        ImageButton peppermint = findViewById(R.id.peppermint_imagebutton);
        TextView pepper_text = findViewById(R.id.peppermint_textview);

        ImageButton damiana = findViewById(R.id.damiana_imagebutton);
        TextView damiana_text = findViewById(R.id.damiana_textview);

        ImageButton dandelion = findViewById(R.id.dandelion_imagebutton);
        TextView dandelion_text = findViewById(R.id.dandelion_textview);

        ImageButton chamomile = findViewById(R.id.chamomile_imagebutton);
        TextView chamomile_text = findViewById(R.id.chamomile_textview2);

        ImageButton elderberry = findViewById(R.id.elderberry_imagebutton);
        TextView elderberry_text = findViewById(R.id.elderberry_textview);

        ImageButton velarian = findViewById(R.id.valerian_imagebutton);
        TextView velarian_text = findViewById(R.id.valerian_textview);

        ImageButton lemonver = findViewById(R.id.lemonver_imagebutton);
        TextView lemonver_text = findViewById(R.id.lemonver_textview3);

        ImageButton liquorice = findViewById(R.id.liqu_imagebutton);
        TextView liqurice_text = findViewById(R.id.liqu_textview);

        ImageButton matcha = findViewById(R.id.matcha_imagebutton);
        TextView matcha_text = findViewById(R.id.matcha_textview);

        ImageButton pau = findViewById(R.id.pau_imagebutton);
        TextView pau_text = findViewById(R.id.pau_textview);

        ImageButton raspberry = findViewById(R.id.raspberry_imagebutton);
        TextView raspberry_text = findViewById(R.id.raspberry_textview);

        ImageButton hempleaf = findViewById(R.id.hempleaf_imagebutton);
        TextView hempleaf_text = findViewById(R.id.hempleaf_textview);

        ImageButton hawthorn = findViewById(R.id.hawthorn_imagebutton);
        TextView hawthorn_text = findViewById(R.id.hawthorn_textview);

        ImageButton hibiscus = findViewById(R.id.hibiscus_imagebutton);
        TextView hibiscus_text = findViewById(R.id.hibiscus_textview);

        ImageButton lavender = findViewById(R.id.lavender_imagebutton);
        TextView lavender_text = findViewById(R.id.lavender_imagebutton_textview);









        peppermint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Peppermint_Tea.class);
                startActivity(intent);
            }
        });

        pepper_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Peppermint_Tea.class);
                startActivity(intent);
            }
        });

        damiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Damiana.class);
                startActivity(intent);
            }
        });

        damiana_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Damiana.class);
                startActivity(intent);
            }
        });

        dandelion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dandelion.class);
                startActivity(intent);
            }
        });

        dandelion_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dandelion.class);
                startActivity(intent);
            }
        });


        chamomile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chamomile.class);
                startActivity(intent);
            }
        });

         chamomile_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chamomile.class);
                startActivity(intent);
            }
        });

        elderberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elderberry.class);
                startActivity(intent);
            }
        });

        elderberry_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Elderberry.class);
                startActivity(intent);
            }
        });

        velarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Velarian.class);
                startActivity(intent);
            }
        });

        velarian_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Velarian.class);
                startActivity(intent);
            }
        });

        lemonver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lemon_Ver.class);
                startActivity(intent);
            }
        });

        lemonver_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lemon_Ver.class);
                startActivity(intent);
            }
        });

        liquorice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Liqurice.class);
                startActivity(intent);
            }
        });

        liqurice_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Liqurice.class);
                startActivity(intent);
            }
        });

        matcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Matcha.class);
                startActivity(intent);
            }
        });

        matcha_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Matcha.class);
                startActivity(intent);
            }
        });


        pau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pau.class);
                startActivity(intent);
            }
        });

        pau_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pau.class);
                startActivity(intent);
            }
        });

        raspberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Raspberry.class);
                startActivity(intent);
            }
        });

        raspberry_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Raspberry.class);
                startActivity(intent);
            }
        });


        hempleaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hemp_Leaf.class);
                startActivity(intent);
            }
        });

        hempleaf_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hemp_Leaf.class);
                startActivity(intent);
            }
        });

        hawthorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hawthorn_Berries.class);
                startActivity(intent);
            }
        });

        hawthorn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hawthorn_Berries.class);
                startActivity(intent);
            }
        });


        hibiscus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hibiscus.class);
                startActivity(intent);
            }
        });

        hibiscus_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Hibiscus.class);
                startActivity(intent);
            }
        });

        lavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lavender.class);
                startActivity(intent);
            }
        });

        lavender_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Lavender.class);
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


