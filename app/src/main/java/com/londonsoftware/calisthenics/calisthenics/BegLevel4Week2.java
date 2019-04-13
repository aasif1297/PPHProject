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

public class BegLevel4Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level4_Week2";

    private static final String SHARED_PREFS77 = "sharedPrefs77";


    private CheckBox complete_workout_monday77;
    private CheckBox complete_workout_tuesday77;
    private CheckBox complete_workout_thursday77;
    private CheckBox complete_workout_friday77;
    private CheckBox complete_workout_saturday77;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY77 = "checkboxMonday77";
    private static final String CHECKBOX_TUESDAY77 = "checkboxTuesday77";
    private static final String CHECKBOX_THURSDAY77 = "checkboxThursday77";
    private static final String CHECKBOX_FRIDAY77 = "checkboxFriday77";
    private static final String CHECKBOX_SATURDAY77 = "checkboxSaturday77";



    private boolean checkboxSaveMonday77;
    private boolean checkboxSaveTuesday77;
    private boolean checkboxSaveThursday77;
    private boolean checkboxSaveFriday77;
    private boolean checkboxSaveSaturday77;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level4_week2,container,false);


        complete_workout_monday77 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk2_monday);
        complete_workout_tuesday77 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk2_Tuesday);
        complete_workout_thursday77 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk2_thursday);
        complete_workout_friday77 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk2_friday);
        complete_workout_saturday77 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk2_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b4w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something42", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float42", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_sbdips = view.findViewById(R.id.sbd);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_widepulls = view.findViewById(R.id.wide_pulls);
        ImageButton mon_closegrippulls = view.findViewById(R.id.closegrip_pulls);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_barlegraises = view.findViewById(R.id.bar_legraises);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_onelegcalfraises = view.findViewById(R.id.onelegcalfraise);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.weightedsquats2);
        ImageButton tues_weightedsquats3 = view.findViewById(R.id.weightedsquats3);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_chinups = view.findViewById(R.id.chinups);
        ImageButton thurs_diamonds = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton thurs_sbd = view.findViewById(R.id.sbd2);
        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton fri_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton fri_onelegcalf = view.findViewById(R.id.onelegcalfraise2);
        ImageButton fri_onelegglute = view.findViewById(R.id.oneleg_glute);

        ImageButton sat_pullups = view.findViewById(R.id.pullups2);
        ImageButton sat_iso = view.findViewById(R.id.isoicon2);
        ImageButton sat_chinups = view.findViewById(R.id.chinups2);
        ImageButton sat_iso2 = view.findViewById(R.id.isoicon3);
        ImageButton sat_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton sat_sbd = view.findViewById(R.id.sbd3);
        ImageButton sat_widepushup = view.findViewById(R.id.widepushupicon);
        ImageButton sat_dips = view.findViewById(R.id.dips3);

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

        mon_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        mon_sbdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
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

        mon_widepulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widegrip_Pull.class);
                startActivity(intent);
            }
        });

        mon_closegrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Closegrip_Pull.class);
                startActivity(intent);
            }
        });

        mon_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });

        tues_onelegcalfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
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
        tues_weightedsquats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats3.setOnClickListener(new View.OnClickListener() {
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

        thurs_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        thurs_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        fri_onelegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        fri_onelegglute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
                startActivity(intent);
            }
        });

        fri_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
                startActivity(intent);
            }
        });

        fri_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
                startActivity(intent);
            }
        });

        fri_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
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

        sat_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        sat_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
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

        sat_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        sat_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        sat_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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














        complete_workout_monday77.setOnCheckedChangeListener(this);
        complete_workout_tuesday77.setOnCheckedChangeListener(this);
        complete_workout_thursday77.setOnCheckedChangeListener(this);
        complete_workout_friday77.setOnCheckedChangeListener(this);
        complete_workout_saturday77.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg4wk2_monday:

                break;


            case R.id.checkBox_beg4wk2_Tuesday:

                break;


            case R.id.checkBox_beg4wk2_thursday:

                break;


            case R.id.checkBox_beg4wk2_friday:

                break;

            case R.id.checkBox_beg4wk2_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS77, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY77, complete_workout_monday77.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY77, complete_workout_tuesday77.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY77, complete_workout_thursday77.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY77, complete_workout_friday77.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY77, complete_workout_saturday77.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS77, Context.MODE_PRIVATE);

        checkboxSaveMonday77 = sharedPreferences.getBoolean(CHECKBOX_MONDAY77, false);
        checkboxSaveTuesday77 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY77, false);
        checkboxSaveThursday77 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY77, false);
        checkboxSaveFriday77 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY77, false);
        checkboxSaveSaturday77 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY77, false);

    }

    public void updateViews1() {
        complete_workout_monday77.setChecked(checkboxSaveMonday77);
        complete_workout_tuesday77.setChecked(checkboxSaveTuesday77);
        complete_workout_thursday77.setChecked(checkboxSaveThursday77);
        complete_workout_friday77.setChecked(checkboxSaveFriday77);
        complete_workout_saturday77.setChecked(checkboxSaveSaturday77);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float42", rating);
        editor_rating.putInt("numStars42", numStars);
        editor_rating.apply();

    }
}

