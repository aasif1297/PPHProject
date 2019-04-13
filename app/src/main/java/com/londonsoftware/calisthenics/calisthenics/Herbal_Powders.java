package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class Herbal_Powders extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.herbal_powders);


        ImageButton spir = findViewById(R.id.spirulina_imagebutton);
        TextView spir_text = findViewById(R.id.spirulina_normal_textview);

        ImageButton chlor = findViewById(R.id.chlorella_imagebutton);
        TextView chlor_text = findViewById(R.id.chlorella_textview);

        ImageButton wheat = findViewById(R.id.wheatgrass_imagebutton);
        TextView wheat_text = findViewById(R.id.wheatgrass_textview);

        ImageButton barley = findViewById(R.id.barleygrass_imagebutton);
        TextView barley_text = findViewById(R.id.barleygrass_textview2);

        ImageButton cacao = findViewById(R.id.cacao_imagebutton);
        TextView cacao_text = findViewById(R.id.cacao_textview);

        ImageButton thistle = findViewById(R.id.milkthistle_imagebutton);
        TextView thistle_text = findViewById(R.id.milkthistle_textview);

        ImageButton cherry = findViewById(R.id.acerola_imagebutton);
        TextView cherry_text = findViewById(R.id.acerola_textview3);

        ImageButton siberian = findViewById(R.id.siberiangingseng_imagebutton);
        TextView siberian_text = findViewById(R.id.siberian_textview);

        ImageButton blackmaca = findViewById(R.id.blackmaca_imagebutton);
        TextView blackmaca_text = findViewById(R.id.blackmaca_textview);

        ImageButton dong = findViewById(R.id.dongquai_imagebutton);
        TextView dong_text = findViewById(R.id.dongquai_textview);

        ImageButton echinacea = findViewById(R.id.purposeroot_imagebutton);
        TextView echinacea_text = findViewById(R.id.purposeroot_textview);

        ImageButton ginkgo = findViewById(R.id.ginkgo_imagebutton);
        TextView ginkgo_text = findViewById(R.id.gingko_textview);

        ImageButton maitmushroom = findViewById(R.id.maitakemushroom_imagebutton);
        TextView maitmushroom_text = findViewById(R.id.maitakemushroom_textview);

        ImageButton nettleroot = findViewById(R.id.nettleroot_imagebutton);
        TextView nettleroot_text = findViewById(R.id.nettleroot_textview);


        ImageButton ashwag = findViewById(R.id.ashwaga_imagebutton);
        TextView ashwag_text = findViewById(R.id.ashwaga_textview);

        ImageButton neem = findViewById(R.id.neem_imagebutton);
        TextView neem_text = findViewById(R.id.neem_textview);

        ImageButton shatavari = findViewById(R.id.shatavri_imagebutton);
        TextView shatavari_text = findViewById(R.id.shatavari_textview);

        ImageButton triphala = findViewById(R.id.triphala_imagebutton);
        TextView triphala_text = findViewById(R.id.triphala_textview);





        spir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Spirilunia.class);
                startActivity(intent);
            }
        });

        spir_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Spirilunia.class);
                startActivity(intent);
            }
        });


        chlor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chlorella.class);
                startActivity(intent);
            }
        });

        chlor_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chlorella.class);
                startActivity(intent);
            }
        });


        wheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Wheat_Grass.class);
                startActivity(intent);
            }
        });

        wheat_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Wheat_Grass.class);
                startActivity(intent);
            }
        });


        barley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Barley_Grass.class);
                startActivity(intent);
            }
        });

        barley_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Barley_Grass.class);
                startActivity(intent);
            }
        });


        cacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cacao.class);
                startActivity(intent);
            }
        });

        cacao_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cacao.class);
                startActivity(intent);
            }
        });

        thistle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Milk_Thistle.class);
                startActivity(intent);
            }
        });

        thistle_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Milk_Thistle.class);
                startActivity(intent);
            }
        });


        cherry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Acerola_Cherry.class);
                startActivity(intent);
            }
        });

        cherry_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Acerola_Cherry.class);
                startActivity(intent);
            }
        });

        siberian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Siberian_Ginseng.class);
                startActivity(intent);
            }
        });

        siberian_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Siberian_Ginseng.class);
                startActivity(intent);
            }
        });

        blackmaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Black_maca.class);
                startActivity(intent);
            }
        });

        blackmaca_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Black_maca.class);
                startActivity(intent);
            }
        });

        dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dong_Quai.class);
                startActivity(intent);
            }
        });

        dong_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dong_Quai.class);
                startActivity(intent);
            }
        });


        echinacea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Purpose_root.class);
                startActivity(intent);
            }
        });

        echinacea_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Purpose_root.class);
                startActivity(intent);
            }
        });

        ginkgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ginkgo.class);
                startActivity(intent);
            }
        });

        ginkgo_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ginkgo.class);
                startActivity(intent);
            }
        });

        maitmushroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Maitake_Mushroom.class);
                startActivity(intent);
            }
        });

        maitmushroom_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Maitake_Mushroom.class);
                startActivity(intent);
            }
        });

        nettleroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Nettle_Root.class);
                startActivity(intent);
            }
        });

        nettleroot_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Nettle_Root.class);
                startActivity(intent);
            }
        });

        ashwag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ashwaghanda.class);
                startActivity(intent);
            }
        });

        ashwag_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ashwaghanda.class);
                startActivity(intent);
            }
        });

        neem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Neem.class);
                startActivity(intent);
            }
        });

        neem_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Neem.class);
                startActivity(intent);
            }
        });

        shatavari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Shatvari.class);
                startActivity(intent);
            }
        });

        shatavari_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Shatvari.class);
                startActivity(intent);
            }
        });

        triphala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Triphala.class);
                startActivity(intent);
            }
        });

        triphala_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Triphala.class);
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


