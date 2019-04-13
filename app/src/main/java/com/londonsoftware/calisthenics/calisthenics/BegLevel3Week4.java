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

public class BegLevel3Week4 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level3_Week4";

    private static final String SHARED_PREFS44 = "sharedPrefs44";

    private CheckBox complete_workout_monday44;
    private CheckBox complete_workout_tuesday44;
    private CheckBox complete_workout_wednesday44;
    private CheckBox complete_workout_friday44;
    private CheckBox complete_workout_saturday44;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY44 = "checkboxMonday44";
    private static final String CHECKBOX_TUESDAY44 = "checkboxTuesday44";
    private static final String CHECKBOX_WEDNESDAY44 = "checkboxWednesday44";
    private static final String CHECKBOX_FRIDAY44 = "checkboxFriday44";
    private static final String CHECKBOX_SATURDAY44 = "checkboxSaturday44";



    private boolean checkboxSaveMonday44;
    private boolean checkboxSaveTuesday44;
    private boolean checkboxSaveWednesday44;
    private boolean checkboxSaveFriday44;
    private boolean checkboxSaveSaturday44;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level3_week4,container,false);


        complete_workout_monday44 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk4_monday);
        complete_workout_tuesday44 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk4_Tuesday);
        complete_workout_wednesday44 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk4_wednesday);
        complete_workout_friday44 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk4_friday);
        complete_workout_saturday44 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk4_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b3w4);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something34", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float34", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_diamonds= view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_chins= view.findViewById(R.id.chinups);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_widepushups = view.findViewById(R.id.widepushupicon);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_jmpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_calfraises = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_pulls = view.findViewById(R.id.pullups2);
        ImageButton wed_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton wed_dips = view.findViewById(R.id.dips2);
        ImageButton wed_pushup = view.findViewById(R.id.pushupicon2);
        ImageButton wed_widepushup = view.findViewById(R.id.widepushupicon2);
        ImageButton wed_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton wed_barkneeraises = view.findViewById(R.id.barknee);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_situp = view.findViewById(R.id.situpsicon);
        ImageButton wed_plank2 = view.findViewById(R.id.plankicon2);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton fri_pushups = view.findViewById(R.id.pushupicon3);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton fri_diamondpushups = view.findViewById(R.id.diamond_pushups2);
        ImageButton fri_onelegcalf = view.findViewById(R.id.onelegcalfraise2);
        ImageButton fri_onelegglute = view.findViewById(R.id.oneleg_glute);

        ImageButton sat_bandchins = view.findViewById(R.id.bandpullsicon2);
        ImageButton sat_hollowhold = view.findViewById(R.id.hollowhold);
        ImageButton sat_plank = view.findViewById(R.id.plankicon3);
        ImageButton sat_floorraises = view.findViewById(R.id.floorraises);

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

        mon_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        mon_chins.setOnClickListener(new View.OnClickListener() {
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

        mon_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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

        tues_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
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

        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        wed_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        wed_barkneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        wed_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });

        wed_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        wed_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        wed_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        wed_situp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        wed_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        wed_plank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });



        thurs_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        fri_diamondpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        fri_jumpingsquats.setOnClickListener(new View.OnClickListener() {
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

        fri_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        sat_bandchins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        sat_floorraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        sat_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        sat_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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


        complete_workout_monday44.setOnCheckedChangeListener(this);
        complete_workout_tuesday44.setOnCheckedChangeListener(this);
        complete_workout_wednesday44.setOnCheckedChangeListener(this);
        complete_workout_friday44.setOnCheckedChangeListener(this);
        complete_workout_saturday44.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg3wk4_monday:

                break;


            case R.id.checkBox_beg3wk4_Tuesday:

                break;


            case R.id.checkBox_beg3wk4_wednesday:

                break;


            case R.id.checkBox_beg3wk4_friday:

                break;

            case R.id.checkBox_beg3wk4_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS44, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY44, complete_workout_monday44.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY44, complete_workout_tuesday44.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY44, complete_workout_wednesday44.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY44, complete_workout_friday44.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY44, complete_workout_saturday44.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS44, Context.MODE_PRIVATE);

        checkboxSaveMonday44 = sharedPreferences.getBoolean(CHECKBOX_MONDAY44, false);
        checkboxSaveTuesday44 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY44, false);
        checkboxSaveWednesday44 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY44, false);
        checkboxSaveFriday44 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY44, false);
        checkboxSaveSaturday44 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY44, false);

    }

    public void updateViews1() {
        complete_workout_monday44.setChecked(checkboxSaveMonday44);
        complete_workout_tuesday44.setChecked(checkboxSaveTuesday44);
        complete_workout_wednesday44.setChecked(checkboxSaveWednesday44);
        complete_workout_friday44.setChecked(checkboxSaveFriday44);
        complete_workout_saturday44.setChecked(checkboxSaveSaturday44);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float34", rating);
        editor_rating.putInt("numStars34", numStars);
        editor_rating.apply();

    }
}

