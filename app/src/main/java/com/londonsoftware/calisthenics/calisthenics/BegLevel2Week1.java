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

public class BegLevel2Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level2_Week1";

    private static final String SHARED_PREFS5 = "sharedPrefs5";


    private CheckBox complete_workout_monday5;
    private CheckBox complete_workout_tuesday5;
    private CheckBox complete_workout_wednesday5;
    private CheckBox complete_workout_friday5;
    private CheckBox complete_workout_saturday5;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY5 = "checkboxMonday5";
    private static final String CHECKBOX_TUESDAY5 = "checkboxTuesday5";
    private static final String CHECKBOX_WEDNESDAY5 = "checkboxWednesday5";
    private static final String CHECKBOX_FRIDAY5 = "checkboxFriday5";
    private static final String CHECKBOX_SATURDAY5 = "checkboxSaturday5";



    private boolean checkboxSaveMonday5;
    private boolean checkboxSaveTuesday5;
    private boolean checkboxSaveWednesday5;
    private boolean checkboxSaveFriday5;
    private boolean checkboxSaveSaturday5;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level2_week1,container,false);


        complete_workout_monday5 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk1_monday);
        complete_workout_tuesday5 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk1_Tuesday);
        complete_workout_wednesday5 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk1_wednesday);
        complete_workout_friday5 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk1_friday);
        complete_workout_saturday5 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk1_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b2w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something21", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float21", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_bandpulls2 = view.findViewById(R.id.bandpullsicon2);
        ImageButton mon_bandpulls3 = view.findViewById(R.id.bandpullsicon3);
        ImageButton mon_bandpulls4 = view.findViewById(R.id.bandpullsicon4);

        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_floorraises = view.findViewById(R.id.floorraises);
        ImageButton wed_sideplank = view.findViewById(R.id.sideplank);
        ImageButton wed_barkneeraises = view.findViewById(R.id.barknee);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullsicon6);
        ImageButton fri_isoholds = view.findViewById(R.id.isoicon);
        ImageButton fri_dips = view.findViewById(R.id.dips);
        ImageButton fri_pushups = view.findViewById(R.id.pushupicon);
        ImageButton fri_widepushups = view.findViewById(R.id.widepushupicon);
        ImageButton fri_deadhang = view.findViewById(R.id.deadhangicon2);

        ImageButton sat_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton sat_squats = view.findViewById(R.id.squatsicon);
        ImageButton sat_weightedlunges = view.findViewById(R.id.weightedlunges2);
        ImageButton sat_lunges = view.findViewById(R.id.lungesicon);
        ImageButton sat_calfraises = view.findViewById(R.id.calfraisesicon2);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);


        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        mon_bandpulls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        mon_bandpulls3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        mon_bandpulls4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        tues_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
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

        wed_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        wed_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        wed_floorraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
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

        wed_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        wed_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        fri_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        fri_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        fri_isoholds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        fri_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        fri_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        sat_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sat_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
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

        sat_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sat_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
                startActivity(intent);
            }
        });

        sat_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
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




        complete_workout_monday5.setOnCheckedChangeListener(this);
        complete_workout_tuesday5.setOnCheckedChangeListener(this);
        complete_workout_wednesday5.setOnCheckedChangeListener(this);
        complete_workout_friday5.setOnCheckedChangeListener(this);
        complete_workout_saturday5.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg2wk1_monday:

                break;


            case R.id.checkBox_beg2wk1_Tuesday:

                break;


            case R.id.checkBox_beg2wk1_wednesday:

                break;


            case R.id.checkBox_beg2wk1_friday:

                break;

            case R.id.checkBox_beg2wk1_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS5, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY5, complete_workout_monday5.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY5, complete_workout_tuesday5.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY5, complete_workout_wednesday5.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY5, complete_workout_friday5.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY5, complete_workout_saturday5.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS5, Context.MODE_PRIVATE);

        checkboxSaveMonday5 = sharedPreferences.getBoolean(CHECKBOX_MONDAY5, false);
        checkboxSaveTuesday5 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY5, false);
        checkboxSaveWednesday5 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY5, false);
        checkboxSaveFriday5 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY5, false);
        checkboxSaveSaturday5 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY5, false);

    }

    public void updateViews1() {
        complete_workout_monday5.setChecked(checkboxSaveMonday5);
        complete_workout_tuesday5.setChecked(checkboxSaveTuesday5);
        complete_workout_wednesday5.setChecked(checkboxSaveWednesday5);
        complete_workout_friday5.setChecked(checkboxSaveFriday5);
        complete_workout_saturday5.setChecked(checkboxSaveSaturday5);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float21", rating);
        editor_rating.putInt("numStars21", numStars);
        editor_rating.apply();

    }
}

