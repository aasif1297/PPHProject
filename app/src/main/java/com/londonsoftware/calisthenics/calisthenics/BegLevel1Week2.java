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

public class BegLevel1Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level1_Week2";

    private static final String SHARED_PREFS1 = "sharedPrefs1";


    private CheckBox complete_workout_monday1;
    private CheckBox complete_workout_tuesday1;
    private CheckBox complete_workout_thursday1;
    private CheckBox complete_workout_friday1;
    private CheckBox complete_workout_sunday1;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY1 = "checkboxMonday1";
    private static final String CHECKBOX_TUESDAY1 = "checkboxTuesday1";
    private static final String CHECKBOX_THURSDAY1 = "checkboxThursday1";
    private static final String CHECKBOX_FRIDAY1 = "checkboxFriday1";
    private static final String CHECKBOX_SUNDAY1 = "checkboxSunday1";



    private boolean checkboxSaveMonday1;
    private boolean checkboxSaveTuesday1;
    private boolean checkboxSaveThursday1;
    private boolean checkboxSaveFriday1;
    private boolean checkboxSaveSunday1;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level1_week2,container,false);


        complete_workout_monday1 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk2_monday);
        complete_workout_tuesday1 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk2_Tuesday);
        complete_workout_thursday1 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk2_Thursday);
        complete_workout_friday1 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk2_friday);
        complete_workout_sunday1 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk2_Sunday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b1w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something1", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float1", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_pushup = view.findViewById(R.id.pushupicon);
        ImageButton mon_widepushup = view.findViewById(R.id.widepushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_situps = view.findViewById(R.id.situpsicon);
        ImageButton mon_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton mon_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton mon_plank = view.findViewById(R.id.plankicon);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_broadjumps = view.findViewById(R.id.leapfrogsicon);
        ImageButton tues_plank = view.findViewById(R.id.plankicon2);
        ImageButton tues_sideplank = view.findViewById(R.id.sideplank);
        ImageButton tues_bandpullsicon = view.findViewById(R.id.tues_bandpullsicon);


        ImageButton wed_foam = view.findViewById(R.id.foamicon);
        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullsicon2);
        ImageButton thurs_pushup = view.findViewById(R.id.pushupicon2);
        ImageButton thurs_widepushup = view.findViewById(R.id.widepushupicon2);
        ImageButton thurs_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton fri_squats = view.findViewById(R.id.squatsicon2);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton fri_leapfrogs = view.findViewById(R.id.leapfrogsicon2);
        ImageButton sat_foam = view.findViewById(R.id.foamicon2);
        ImageButton sun_situps = view.findViewById(R.id.situpsicon2);
        ImageButton sun_romantwists = view.findViewById(R.id.romantwistsicon2);
        ImageButton sun_plank = view.findViewById(R.id.plankicon3);
        ImageButton sun_barknee = view.findViewById(R.id.barknee);



        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        mon_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        mon_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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

        mon_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        mon_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        mon_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        mon_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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

        tues_bandpullsicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        tues_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        tues_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
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

        tues_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        tues_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        thurs_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        thurs_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        fri_leapfrogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Broadjumps.class);
                startActivity(intent);
            }
        });


        sat_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        sun_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        sun_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        sun_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        sun_barknee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });



        complete_workout_monday1.setOnCheckedChangeListener(this);
        complete_workout_tuesday1.setOnCheckedChangeListener(this);
        complete_workout_thursday1.setOnCheckedChangeListener(this);
        complete_workout_friday1.setOnCheckedChangeListener(this);
        complete_workout_sunday1.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg1wk2_monday:

                break;


            case R.id.checkBox_beg1wk2_Tuesday:

                break;


            case R.id.checkBox_beg1wk2_Thursday:

                break;


            case R.id.checkBox_beg1wk2_friday:

                break;

            case R.id.checkBox_beg1wk2_Sunday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS1, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY1, complete_workout_monday1.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY1, complete_workout_tuesday1.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY1, complete_workout_thursday1.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY1, complete_workout_friday1.isChecked());
        editor.putBoolean(CHECKBOX_SUNDAY1, complete_workout_sunday1.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS1, Context.MODE_PRIVATE);

        checkboxSaveMonday1 = sharedPreferences.getBoolean(CHECKBOX_MONDAY1, false);
        checkboxSaveTuesday1 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY1, false);
        checkboxSaveThursday1 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY1, false);
        checkboxSaveFriday1 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY1, false);
        checkboxSaveSunday1 = sharedPreferences.getBoolean(CHECKBOX_SUNDAY1, false);

    }

    public void updateViews1() {
        complete_workout_monday1.setChecked(checkboxSaveMonday1);
        complete_workout_tuesday1.setChecked(checkboxSaveTuesday1);
        complete_workout_thursday1.setChecked(checkboxSaveThursday1);
        complete_workout_friday1.setChecked(checkboxSaveFriday1);
        complete_workout_sunday1.setChecked(checkboxSaveSunday1);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float1", rating);
        editor_rating.putInt("numStars1", numStars);
        editor_rating.apply();

    }

}

