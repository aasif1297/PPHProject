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

public class BegLevel2Week4 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level2_Week4";

    private static final String SHARED_PREFS8 = "sharedPrefs8";


    private CheckBox complete_workout_monday8;
    private CheckBox complete_workout_tuesday8;
    private CheckBox complete_workout_wednesday8;
    private CheckBox complete_workout_friday8;
    private CheckBox complete_workout_saturday8;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY8 = "checkboxMonday8";
    private static final String CHECKBOX_TUESDAY8 = "checkboxTuesday8";
    private static final String CHECKBOX_WEDNESDAY8 = "checkboxWednesday8";
    private static final String CHECKBOX_FRIDAY8 = "checkboxFriday8";
    private static final String CHECKBOX_SATURDAY8 = "checkboxSaturday8";



    private boolean checkboxSaveMonday8;
    private boolean checkboxSaveTuesday8;
    private boolean checkboxSaveWednesday8;
    private boolean checkboxSaveFriday8;
    private boolean checkboxSaveSaturday8;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level2_week4,container,false);


        complete_workout_monday8 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk4_monday);
        complete_workout_tuesday8 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk4_Tuesday);
        complete_workout_wednesday8 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk4_wednesday);
        complete_workout_friday8 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk4_friday);
        complete_workout_saturday8 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk4_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b2w4);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something24", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float24", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_diamondpushup = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_floorlegraises = view.findViewById(R.id.floorraises);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups);
        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullsicon2);
        ImageButton fri_isohold = view.findViewById(R.id.isoicon3);
        ImageButton fri_dips = view.findViewById(R.id.dips2);
        ImageButton fri_pushup = view.findViewById(R.id.pushupicon3);

        ImageButton sat_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton sat_jumpingluges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton sat_onelegcalf = view.findViewById(R.id.onelegcalfraise);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);






        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });


        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
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


        mon_diamondpushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        tues_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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

        wed_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
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

        wed_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        wed_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
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

        fri_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        fri_isohold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        fri_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        sat_jumpingluges.setOnClickListener(new View.OnClickListener() {
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

        sat_onelegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
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

        sat_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
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




















        complete_workout_monday8.setOnCheckedChangeListener(this);
        complete_workout_tuesday8.setOnCheckedChangeListener(this);
        complete_workout_wednesday8.setOnCheckedChangeListener(this);
        complete_workout_friday8.setOnCheckedChangeListener(this);
        complete_workout_saturday8.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg2wk4_monday:

                break;


            case R.id.checkBox_beg2wk4_Tuesday:

                break;


            case R.id.checkBox_beg2wk4_wednesday:

                break;


            case R.id.checkBox_beg2wk4_friday:

                break;

            case R.id.checkBox_beg2wk4_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS8, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY8, complete_workout_monday8.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY8, complete_workout_tuesday8.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY8, complete_workout_wednesday8.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY8, complete_workout_friday8.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY8, complete_workout_saturday8.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS8, Context.MODE_PRIVATE);

        checkboxSaveMonday8 = sharedPreferences.getBoolean(CHECKBOX_MONDAY8, false);
        checkboxSaveTuesday8 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY8, false);
        checkboxSaveWednesday8 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY8, false);
        checkboxSaveFriday8 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY8, false);
        checkboxSaveSaturday8 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY8, false);

    }

    public void updateViews1() {
        complete_workout_monday8.setChecked(checkboxSaveMonday8);
        complete_workout_tuesday8.setChecked(checkboxSaveTuesday8);
        complete_workout_wednesday8.setChecked(checkboxSaveWednesday8);
        complete_workout_friday8.setChecked(checkboxSaveFriday8);
        complete_workout_saturday8.setChecked(checkboxSaveSaturday8);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float24", rating);
        editor_rating.putInt("numStars24", numStars);
        editor_rating.apply();

    }
}

