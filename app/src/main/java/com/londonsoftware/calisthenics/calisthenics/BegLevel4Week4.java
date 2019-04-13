package com.londonsoftware.calisthenics.calisthenics;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RatingBar;


public class BegLevel4Week4 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level4_Week4";

    private static final String SHARED_PREFS99 = "sharedPrefs99";


    private CheckBox complete_workout_monday99;
    private CheckBox complete_workout_tuesday99;
    private CheckBox complete_workout_thursday99;
    private CheckBox complete_workout_saturday99;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY99 = "checkboxMonday99";
    private static final String CHECKBOX_TUESDAY99 = "checkboxTuesday99";
    private static final String CHECKBOX_THURSDAY99 = "checkboxThursday99";
    private static final String CHECKBOX_SATURDAY99 = "checkboxSaturday99";



    private boolean checkboxSaveMonday99;
    private boolean checkboxSaveTuesday99;
    private boolean checkboxSaveThursday99;
    private boolean checkboxSaveSaturday99;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level4_week4,container,false);


        complete_workout_monday99 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk4_monday);
        complete_workout_tuesday99 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk4_Tuesday);
        complete_workout_thursday99 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk4_thursday);
        complete_workout_saturday99 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk4_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b4w4);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something44", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float44", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);



        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_pullups20 = view.findViewById(R.id.pullups21);
        ImageButton mon_pullups3 = view.findViewById(R.id.pullups3);

        ImageButton mon_weightedpushups = view.findViewById(R.id.weighted_pushups);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_pullups = view.findViewById(R.id.pullups2);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon);
        ImageButton thurs_weightedpushups = view.findViewById(R.id.weighted_pushups2);
        ImageButton thurs_sbd = view.findViewById(R.id.sbd);
        ImageButton thurs_situps = view.findViewById(R.id.situpsicon);
        ImageButton thurs_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon);
        ImageButton thurs_barknee = view.findViewById(R.id.barknee);
        ImageButton thurs_hollowhold = view.findViewById(R.id.hollowhold2);
        ImageButton thurs_sideplank = view.findViewById(R.id.sideplank);

        ImageButton fri_foam = view.findViewById(R.id.foamicon2);

        ImageButton sat_squats = view.findViewById(R.id.squatsicon);
        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton sat_lunges = view.findViewById(R.id.lungesicon);
        ImageButton sat_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton sat_chinups = view.findViewById(R.id.chinups);
        ImageButton sat_diamondpushes = view.findViewById(R.id.diamond_pushupsicon);


        ImageButton sun_foam = view.findViewById(R.id.foamicon3);





        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_pullups3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_pullups20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        mon_weightedpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });

        tues_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
                startActivity(intent);
            }
        });

        tues_onelegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        tues_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });


        tues_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });




        wed_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        thurs_barknee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        thurs_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        thurs_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        thurs_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        thurs_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        thurs_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        thurs_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        thurs_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
                startActivity(intent);
            }
        });

        thurs_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        thurs_weightedpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });



        fri_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });


        sat_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        sat_diamondpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        sat_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        sat_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
                startActivity(intent);
            }
        });


        sat_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sat_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
                startActivity(intent);
            }
        });


        sat_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
                startActivity(intent);
            }
        });




        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });


















        complete_workout_monday99.setOnCheckedChangeListener(this);
        complete_workout_tuesday99.setOnCheckedChangeListener(this);
        complete_workout_thursday99.setOnCheckedChangeListener(this);
        complete_workout_saturday99.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg4wk4_monday:

                break;


            case R.id.checkBox_beg4wk4_Tuesday:

                break;


            case R.id.checkBox_beg4wk4_thursday:

                break;



            case R.id.checkBox_beg4wk4_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS99, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY99, complete_workout_monday99.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY99, complete_workout_tuesday99.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY99, complete_workout_thursday99.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY99, complete_workout_saturday99.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS99, Context.MODE_PRIVATE);

        checkboxSaveMonday99 = sharedPreferences.getBoolean(CHECKBOX_MONDAY99, false);
        checkboxSaveTuesday99 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY99, false);
        checkboxSaveThursday99 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY99, false);
        checkboxSaveSaturday99 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY99, false);

    }

    public void updateViews1() {
        complete_workout_monday99.setChecked(checkboxSaveMonday99);
        complete_workout_tuesday99.setChecked(checkboxSaveTuesday99);
        complete_workout_thursday99.setChecked(checkboxSaveThursday99);
        complete_workout_saturday99.setChecked(checkboxSaveSaturday99);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float44", rating);
        editor_rating.putInt("numStars44", numStars);
        editor_rating.apply();

    }

}

