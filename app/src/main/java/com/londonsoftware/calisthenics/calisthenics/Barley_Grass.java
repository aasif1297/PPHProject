package com.londonsoftware.calisthenics.calisthenics;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Barley_Grass extends AppCompatActivity {

    Dialog dialog;
    TextView mMaintext;
    TextView mShowAll;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barleygrass);

        dialog = new Dialog(this);

        mMaintext = findViewById(R.id.hemptext);
        mShowAll = findViewById(R.id.detail_read_all);



        mShowAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mShowAll.setVisibility(View.INVISIBLE);

                mMaintext.setMaxLines(Integer.MAX_VALUE);
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


    public void ShowPopup_barleygrass (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_barleygrass_powder_macros);
        closetext = dialog.findViewById(R.id.exit_popup_barleygrasspowder);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    public void ShowPopupNutrition_barleygrass (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_barleygrass_powder_nutrition);
        closetext = dialog.findViewById(R.id.exit_popup_barleygrasspowder_nutrition);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

}

