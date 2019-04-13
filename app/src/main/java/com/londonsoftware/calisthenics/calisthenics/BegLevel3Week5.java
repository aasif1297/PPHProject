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

public class BegLevel3Week5 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level3_Week5";

    private static final String SHARED_PREFS55 = "sharedPrefs55";


    private CheckBox complete_workout_monday55;
    private CheckBox complete_workout_tuesday55;
    private CheckBox complete_workout_thursday55;
    private CheckBox complete_workout_friday55;
    private CheckBox complete_workout_saturday55;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY55 = "checkboxMonday55";
    private static final String CHECKBOX_TUESDAY55 = "checkboxTuesday55";
    private static final String CHECKBOX_THURSDAY55 = "checkboxThursday55";
    private static final String CHECKBOX_FRIDAY55 = "checkboxFriday55";
    private static final String CHECKBOX_SATURDAY55 = "checkboxSaturday55";



    private boolean checkboxSaveMonday55;
    private boolean checkboxSaveTuesday55;
    private boolean checkboxSaveThursday55;
    private boolean checkboxSaveFriday55;
    private boolean checkboxSaveSaturday55;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level3_week5,container,false);


        complete_workout_monday55 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk5_monday);
        complete_workout_tuesday55 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk5_Tuesday);
        complete_workout_thursday55 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk5_thursday);
        complete_workout_friday55 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk5_friday);
        complete_workout_saturday55 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk5_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b3w5);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something35", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float35", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso20 = view.findViewById(R.id.isoicon20);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.weightedsquats2);
        ImageButton tues_jmpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_calfraises = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_widepulls = view.findViewById(R.id.wide_pulls);
        ImageButton thurs_closegrippulls = view.findViewById(R.id.closegrip_pulls);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_widepushup = view.findViewById(R.id.widepushupicon);
        ImageButton thurs_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton thurs_barknee = view.findViewById(R.id.barknee);
        ImageButton thurs_hollowholds = view.findViewById(R.id.hollowhold);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon);

        ImageButton fri_weightedsquats = view.findViewById(R.id.weightedsquats3);
        ImageButton fri_jumpingsquat = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton fri_wallsit = view.findViewById(R.id.wallsiticon2);
        ImageButton fri_onelegglute = view.findViewById(R.id.oneleg_glute);
        ImageButton fri_broadjumps = view.findViewById(R.id.leapfrogsicon);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon);

        ImageButton sat_diamondpushes = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton sat_dips = view.findViewById(R.id.dips3);
        ImageButton sat_isohold = view.findViewById(R.id.isohold);
        ImageButton sat_widepushups = view.findViewById(R.id.widepushupicon2);
        ImageButton sat_barlegraises = view.findViewById(R.id.bar_legraises2);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);
        ImageButton sat_chinups = view.findViewById(R.id.chinups2);

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

        mon_iso20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        mon_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        mon_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        tues_jmpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        tues_weightedsquats2.setOnClickListener(new View.OnClickListener() {
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

        thurs_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });

        thurs_closegrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Closegrip_Pull.class);
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

        thurs_hollowholds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
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

        thurs_widepulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widegrip_Pull.class);
                startActivity(intent);
            }
        });

        thurs_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        fri_broadjumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Broadjumps.class);
                startActivity(intent);
            }
        });

        fri_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        fri_jumpingsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
                startActivity(intent);
            }
        });

        fri_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
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

        fri_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
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

        sat_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
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

        sat_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        sat_isohold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        sat_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        sat_widepushups.setOnClickListener(new View.OnClickListener() {
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








        complete_workout_monday55.setOnCheckedChangeListener(this);
        complete_workout_tuesday55.setOnCheckedChangeListener(this);
        complete_workout_thursday55.setOnCheckedChangeListener(this);
        complete_workout_friday55.setOnCheckedChangeListener(this);
        complete_workout_saturday55.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg3wk5_monday:

                break;


            case R.id.checkBox_beg3wk5_Tuesday:

                break;


            case R.id.checkBox_beg3wk5_thursday:

                break;


            case R.id.checkBox_beg3wk5_friday:

                break;

            case R.id.checkBox_beg3wk5_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS55, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY55, complete_workout_monday55.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY55, complete_workout_tuesday55.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY55, complete_workout_thursday55.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY55, complete_workout_friday55.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY55, complete_workout_saturday55.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS55, Context.MODE_PRIVATE);

        checkboxSaveMonday55 = sharedPreferences.getBoolean(CHECKBOX_MONDAY55, false);
        checkboxSaveTuesday55 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY55, false);
        checkboxSaveThursday55 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY55, false);
        checkboxSaveFriday55 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY55, false);
        checkboxSaveSaturday55 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY55, false);

    }

    public void updateViews1() {
        complete_workout_monday55.setChecked(checkboxSaveMonday55);
        complete_workout_tuesday55.setChecked(checkboxSaveTuesday55);
        complete_workout_thursday55.setChecked(checkboxSaveThursday55);
        complete_workout_friday55.setChecked(checkboxSaveFriday55);
        complete_workout_saturday55.setChecked(checkboxSaveSaturday55);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float35", rating);
        editor_rating.putInt("numStars35", numStars);
        editor_rating.apply();

    }
}

