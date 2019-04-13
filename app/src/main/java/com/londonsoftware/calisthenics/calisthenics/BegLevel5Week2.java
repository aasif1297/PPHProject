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

public class BegLevel5Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level5_Week2";

    private static final String SHARED_PREFS34 = "sharedPrefs34";


    private CheckBox complete_workout_monday34;
    private CheckBox complete_workout_tuesday34;
    private CheckBox complete_workout_thursday34;
    private CheckBox complete_workout_friday34;
    private CheckBox complete_workout_saturday34;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY34 = "checkboxMonday34";
    private static final String CHECKBOX_TUESDAY34 = "checkboxTuesday34";
    private static final String CHECKBOX_THURSDAY34 = "checkboxThursday34";
    private static final String CHECKBOX_FRIDAY34 = "checkboxFriday34";
    private static final String CHECKBOX_SATURDAY34 = "checkboxSaturday34";



    private boolean checkboxSaveMonday34;
    private boolean checkboxSaveTuesday34;
    private boolean checkboxSaveThursday34;
    private boolean checkboxSaveFriday34;
    private boolean checkboxSaveSaturday34;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level5_week2,container,false);


        complete_workout_monday34 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk2_monday);
        complete_workout_tuesday34 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk2_Tuesday);
        complete_workout_thursday34 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk2_thursday);
        complete_workout_friday34 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk2_Friday);
        complete_workout_saturday34 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk2_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b5w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something52", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float52", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_weighteddips = view.findViewById(R.id.weighted_dips);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_lsit = view.findViewById(R.id.lsit);
        ImageButton mon_russianpushups = view.findViewById(R.id.russianpushups);
        ImageButton mon_pikepushups = view.findViewById(R.id.pikepush);
        ImageButton mon_iso = view.findViewById(R.id.isoicon2);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_broadjumps = view.findViewById(R.id.leapfrogsicon);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_weighted_pullups = view.findViewById(R.id.weighted_pullups);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon);
        ImageButton thurs_sbd = view.findViewById(R.id.sbd);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon);
        ImageButton thurs_frontlevertuck = view.findViewById(R.id.front_tuck);
        ImageButton thurs_backlevertuck = view.findViewById(R.id.back_tuck);
        ImageButton thurs_chinups = view.findViewById(R.id.chinups2);
        ImageButton thurs_iso2 = view.findViewById(R.id.isoicon4);
        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton thurs_pushup = view.findViewById(R.id.pushupicon);

        ImageButton fri_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton fri_weightedsquats22 = view.findViewById(R.id.weightedsquats22);
        ImageButton fri_weightedsquats222 = view.findViewById(R.id.weightedsquats222);

        ImageButton fri_situps = view.findViewById(R.id.situpsicon);
        ImageButton fri_romantwists = view.findViewById(R.id.romantwistsicon);

        ImageButton sat_pulls = view.findViewById(R.id.pullups2);
        ImageButton sat_widepulls = view.findViewById(R.id.wide_pulls);
        ImageButton sat_closegrippulls = view.findViewById(R.id.closegrip_pulls);
        ImageButton sat_iso = view.findViewById(R.id.isoicon3);
        ImageButton sat_weightedpushups = view.findViewById(R.id.weighted_pushups);
        ImageButton sat_diamondpushups = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton sat_russianpushups = view.findViewById(R.id.russianpushups2);
        ImageButton sat_sbd = view.findViewById(R.id.sbd2);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);

        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });


        mon_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        mon_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        mon_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });


        mon_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        mon_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        mon_pikepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        mon_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        tues_broadjumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Broadjumps.class);
                startActivity(intent);
            }
        });

        tues_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        tues_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        tues_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
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

        thurs_backlevertuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        thurs_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });

        thurs_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        thurs_frontlevertuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
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

        thurs_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        thurs_weighted_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        thurs_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        thurs_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        thurs_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        thurs_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        fri_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        fri_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });


        fri_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        fri_weightedsquats22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        fri_weightedsquats222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sat_closegrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Closegrip_Pull.class);
                startActivity(intent);
            }
        });

        sat_weightedpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });

        sat_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        sat_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        sat_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });


        sat_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        sat_diamondpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });


        sat_widepulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widegrip_Pull.class);
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


        complete_workout_monday34.setOnCheckedChangeListener(this);
        complete_workout_tuesday34.setOnCheckedChangeListener(this);
        complete_workout_thursday34.setOnCheckedChangeListener(this);
        complete_workout_friday34.setOnCheckedChangeListener(this);
        complete_workout_saturday34.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg5wk2_monday:

                break;


            case R.id.checkBox_beg5wk2_Tuesday:

                break;


            case R.id.checkBox_beg5wk2_thursday:

                break;


            case R.id.checkBox_beg5wk2_Friday:

                break;

            case R.id.checkBox_beg5wk2_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS34, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY34, complete_workout_monday34.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY34, complete_workout_tuesday34.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY34, complete_workout_thursday34.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY34, complete_workout_friday34.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY34, complete_workout_saturday34.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS34, Context.MODE_PRIVATE);

        checkboxSaveMonday34 = sharedPreferences.getBoolean(CHECKBOX_MONDAY34, false);
        checkboxSaveTuesday34 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY34, false);
        checkboxSaveThursday34 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY34, false);
        checkboxSaveFriday34 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY34, false);
        checkboxSaveSaturday34 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY34, false);

    }

    public void updateViews1() {
        complete_workout_monday34.setChecked(checkboxSaveMonday34);
        complete_workout_tuesday34.setChecked(checkboxSaveTuesday34);
        complete_workout_thursday34.setChecked(checkboxSaveThursday34);
        complete_workout_friday34.setChecked(checkboxSaveFriday34);
        complete_workout_saturday34.setChecked(checkboxSaveSaturday34);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float52", rating);
        editor_rating.putInt("numStars52", numStars);
        editor_rating.apply();

    }
}

