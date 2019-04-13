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

public class BegLevel2Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level2_Week3";

    private static final String SHARED_PREFS7 = "sharedPrefs7";


    private CheckBox complete_workout_monday7;
    private CheckBox complete_workout_tuesday7;
    private CheckBox complete_workout_wednesday7;
    private CheckBox complete_workout_friday7;
    private CheckBox complete_workout_saturday7;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;


    private static final String CHECKBOX_MONDAY7 = "checkboxMonday7";
    private static final String CHECKBOX_TUESDAY7 = "checkboxTuesday7";
    private static final String CHECKBOX_WEDNESDAY7 = "checkboxWednesday7";
    private static final String CHECKBOX_FRIDAY7 = "checkboxFriday7";
    private static final String CHECKBOX_SATURDAY7 = "checkboxSaturday7";



    private boolean checkboxSaveMonday7;
    private boolean checkboxSaveTuesday7;
    private boolean checkboxSaveWednesday7;
    private boolean checkboxSaveFriday7;
    private boolean checkboxSaveSaturday7;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level2_week3,container,false);


        complete_workout_monday7 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk3_monday);
        complete_workout_tuesday7 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk3_Tuesday);
        complete_workout_wednesday7 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk3_wednesday);
        complete_workout_friday7 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk3_friday);
        complete_workout_saturday7 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk3_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b2w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something23", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float23", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pushup = view.findViewById(R.id.pushupicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);

        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_floorraises = view.findViewById(R.id.floorraises);
        ImageButton wed_barkneeraises = view.findViewById(R.id.barknee);
        ImageButton wed_bandedpulls = view.findViewById(R.id.bandpullsicon2);
        ImageButton wed_widepushups = view.findViewById(R.id.widepushupicon);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups);
        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullsicon3);
        ImageButton fri_bandpulls2 = view.findViewById(R.id.bandpullicon4);
        ImageButton fri_iso = view.findViewById(R.id.isoicon);
        ImageButton fri_dips = view.findViewById(R.id.dips2);
        ImageButton fri_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton fri_deadhang = view.findViewById(R.id.deadhangicon2);

        ImageButton sat_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton sat_weightedlunges = view.findViewById(R.id.weightedlunges2);
        ImageButton sat_broadjumps = view.findViewById(R.id.leapfrogsicon);
        ImageButton sat_calfraises = view.findViewById(R.id.calfraisesicon);

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

        tues_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
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

        wed_bandedpulls.setOnClickListener(new View.OnClickListener() {
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

        wed_floorraises.setOnClickListener(new View.OnClickListener() {
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

        wed_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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

        fri_bandpulls2.setOnClickListener(new View.OnClickListener() {
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

        fri_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        fri_iso.setOnClickListener(new View.OnClickListener() {
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

        sat_broadjumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Broadjumps.class);
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

        sat_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        sat_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
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







        complete_workout_monday7.setOnCheckedChangeListener(this);
        complete_workout_tuesday7.setOnCheckedChangeListener(this);
        complete_workout_wednesday7.setOnCheckedChangeListener(this);
        complete_workout_friday7.setOnCheckedChangeListener(this);
        complete_workout_saturday7.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg2wk3_monday:

                break;


            case R.id.checkBox_beg2wk3_Tuesday:

                break;


            case R.id.checkBox_beg2wk3_wednesday:

                break;


            case R.id.checkBox_beg2wk3_friday:

                break;

            case R.id.checkBox_beg2wk3_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS7, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY7, complete_workout_monday7.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY7, complete_workout_tuesday7.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY7, complete_workout_wednesday7.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY7, complete_workout_friday7.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY7, complete_workout_saturday7.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS7, Context.MODE_PRIVATE);

        checkboxSaveMonday7 = sharedPreferences.getBoolean(CHECKBOX_MONDAY7, false);
        checkboxSaveTuesday7 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY7, false);
        checkboxSaveWednesday7 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY7, false);
        checkboxSaveFriday7 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY7, false);
        checkboxSaveSaturday7 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY7, false);

    }

    public void updateViews1() {
        complete_workout_monday7.setChecked(checkboxSaveMonday7);
        complete_workout_tuesday7.setChecked(checkboxSaveTuesday7);
        complete_workout_wednesday7.setChecked(checkboxSaveWednesday7);
        complete_workout_friday7.setChecked(checkboxSaveFriday7);
        complete_workout_saturday7.setChecked(checkboxSaveSaturday7);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float23", rating);
        editor_rating.putInt("numStars23", numStars);
        editor_rating.apply();

    }
}

