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

public class BegLevel2Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level2_Week2";
    private static final String SHARED_PREFS6 = "sharedPrefs6";


    private CheckBox complete_workout_monday6;
    private CheckBox complete_workout_tuesday6;
    private CheckBox complete_workout_thursday6;
    private CheckBox complete_workout_friday6;
    private CheckBox complete_workout_saturday6;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY6 = "checkboxMonday6";
    private static final String CHECKBOX_TUESDAY6 = "checkboxTuesday6";
    private static final String CHECKBOX_THURSDAY6 = "checkboxThursday6";
    private static final String CHECKBOX_FRIDAY6 = "checkboxFriday6";
    private static final String CHECKBOX_SATURDAY6 = "checkboxSaturday6";



    private boolean checkboxSaveMonday6;
    private boolean checkboxSaveTuesday6;
    private boolean checkboxSaveThursday6;
    private boolean checkboxSaveFriday6;
    private boolean checkboxSaveSaturday6;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level2_week2,container,false);


        complete_workout_monday6 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk2_monday);
        complete_workout_tuesday6 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk2_Tuesday);
        complete_workout_thursday6 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk2_thursday);
        complete_workout_friday6 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk2_friday);
        complete_workout_saturday6 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk2_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b2w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something22", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float22", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_diamonds = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_pushup = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullicon2);
        ImageButton thurs_isohold = view.findViewById(R.id.isoicon);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton thurs_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton thurs_barkneeraises = view.findViewById(R.id.barknee);
        ImageButton thurs_situps = view.findViewById(R.id.situpsicon);
        ImageButton thurs_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton thurs_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon);
        ImageButton thurs_sideplank = view.findViewById(R.id.sideplank);

        ImageButton fri_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton fri_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton fri_calfraises = view.findViewById(R.id.calfraisesicon2);

        ImageButton sat_diamonds = view.findViewById(R.id.diamond_pushups3);
        ImageButton sat_pushups = view.findViewById(R.id.pushupicon3);
        ImageButton sat_widepushups = view.findViewById(R.id.widepushups_icon);
        ImageButton sat_plank = view.findViewById(R.id.plankicon2);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon2);
        ImageButton sat_floorlegraises = view.findViewById(R.id.floorraises2);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);







        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        mon_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        mon_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        tues_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
                startActivity(intent);
            }
        });

        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        thurs_barkneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        thurs_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        thurs_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        thurs_isohold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        thurs_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        thurs_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
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

        thurs_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        fri_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        fri_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        sat_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
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

        sat_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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



        complete_workout_monday6.setOnCheckedChangeListener(this);
        complete_workout_tuesday6.setOnCheckedChangeListener(this);
        complete_workout_thursday6.setOnCheckedChangeListener(this);
        complete_workout_friday6.setOnCheckedChangeListener(this);
        complete_workout_saturday6.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg2wk2_monday:

                break;


            case R.id.checkBox_beg2wk2_Tuesday:

                break;


            case R.id.checkBox_beg2wk2_thursday:

                break;


            case R.id.checkBox_beg2wk2_friday:

                break;

            case R.id.checkBox_beg2wk2_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS6, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY6, complete_workout_monday6.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY6, complete_workout_tuesday6.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY6, complete_workout_thursday6.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY6, complete_workout_friday6.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY6, complete_workout_saturday6.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS6, Context.MODE_PRIVATE);

        checkboxSaveMonday6 = sharedPreferences.getBoolean(CHECKBOX_MONDAY6, false);
        checkboxSaveTuesday6 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY6, false);
        checkboxSaveThursday6 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY6, false);
        checkboxSaveFriday6 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY6, false);
        checkboxSaveSaturday6 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY6, false);

    }

    public void updateViews1() {
        complete_workout_monday6.setChecked(checkboxSaveMonday6);
        complete_workout_tuesday6.setChecked(checkboxSaveTuesday6);
        complete_workout_thursday6.setChecked(checkboxSaveThursday6);
        complete_workout_friday6.setChecked(checkboxSaveFriday6);
        complete_workout_saturday6.setChecked(checkboxSaveSaturday6);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float22", rating);
        editor_rating.putInt("numStars22", numStars);
        editor_rating.apply();

    }
}

