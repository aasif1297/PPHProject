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


public class IntLevel3Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "INT1_Level3_Week3";

    private static final String SHARED_PREFS93= "sharedPrefs93";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_thursday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_saturday71;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_THURSDAY71 = "checkboxThursday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SATURDAY71 = "checkboxSaturday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveThursday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSaturday71;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.int_level3_week3,container,false);

        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_int3wk3_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_int3wk3_Tuesday);
        complete_workout_thursday71 = (CheckBox) view.findViewById(R.id.checkBox_int3wk3_thursday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_int3wk3_friday);
        complete_workout_saturday71 = (CheckBox) view.findViewById(R.id.checkBox_int3wk3_saturday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_i3w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something93", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float93", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_muscleups = view.findViewById(R.id.mon_muscleup);
        ImageButton mon_muscleup2 = view.findViewById(R.id.mon_muscleup2);
        ImageButton mon_muscleup3 = view.findViewById(R.id.mon_muscleup3);
        ImageButton mon_lsit = view.findViewById(R.id.mon_lsit);
        ImageButton mon_muscleup4 = view.findViewById(R.id.mon_muscleup4);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_weightedpulls = view.findViewById(R.id.mon_weightedpulls);
        ImageButton mon_pulls = view.findViewById(R.id.mon_pulls);
        ImageButton mon_dragonflags = view.findViewById(R.id.mon_dragonflags);
        ImageButton mon_pushups = view.findViewById(R.id.mon_pushups);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_weightedlunges = view.findViewById(R.id.tues_weightedlunges);
        ImageButton tues_windshield = view.findViewById(R.id.tues_windshield);
        ImageButton tues_backextensions = view.findViewById(R.id.tues_backextensions);
        ImageButton tues_frontleverraises = view.findViewById(R.id.tues_frontleverraises);

        ImageButton wed_foamrolling = view.findViewById(R.id.foamicon);

        ImageButton thurs_ringdips = view.findViewById(R.id.thurs_ringdips);
        ImageButton thurs_weighteddips = view.findViewById(R.id.thurs_weighteddips);
        ImageButton thurs_muscleup2 = view.findViewById(R.id.thurs_muscleup2);
        ImageButton thurs_diamonds = view.findViewById(R.id.thurs_diamonds);
        ImageButton thurs_ringpushups = view.findViewById(R.id.thurs_ringpushups);
        ImageButton thurs_highpulls = view.findViewById(R.id.thurs_highpulls);
        ImageButton thurs_lsit = view.findViewById(R.id.thurs_lsit);
        ImageButton thurs_barlegraises = view.findViewById(R.id.thurs_barlegraises);

        ImageButton fri_pulls = view.findViewById(R.id.fri_pulls);
        ImageButton fri_bandedmuscleups = view.findViewById(R.id.fri_bandedmuscleups);
        ImageButton fri_situps = view.findViewById(R.id.fri_situps);
        ImageButton fri_romantwists = view.findViewById(R.id.fri_romantwists);
        ImageButton fri_hollowhold = view.findViewById(R.id.fri_hollowhold);

        ImageButton sat_frontsquats = view.findViewById(R.id.sat_frontsquats);
        ImageButton sat_bulgarian = view.findViewById(R.id.sat_bulgarian);
        ImageButton sat_weightedlunges = view.findViewById(R.id.sat_weightedlunges);
        ImageButton sat_wallsit = view.findViewById(R.id.sat_wallsit);


        ImageButton sun_foamrolling = view.findViewById(R.id.foamicon2);



        mon_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_dragonflags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dragonflags.class);
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

        mon_muscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_muscleup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_muscleup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_pulls.setOnClickListener(new View.OnClickListener() {
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

        mon_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        mon_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        tues_backextensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_BackExtensions.class);
                startActivity(intent);
            }
        });

        tues_frontleverraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Kneetuck_Raises.class);
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

        tues_windshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Windshield_Wipers.class);
                startActivity(intent);
            }
        });


        wed_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
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

        thurs_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_highpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Highpull.class);
                startActivity(intent);
            }
        });

        thurs_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        thurs_muscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        thurs_ringdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Dips.class);
                startActivity(intent);
            }
        });

        thurs_ringpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ringpushups.class);
                startActivity(intent);
            }
        });

        thurs_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        fri_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        fri_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        sat_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
                startActivity(intent);
            }
        });

        sat_frontsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FrontSquats.class);
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

        sun_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });






        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_thursday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_saturday71.setOnCheckedChangeListener(this);


        loadData();
        updateViews();

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
        switch (buttonView.getId()) {


            case R.id.checkBox_int3wk3_monday:

                break;


            case R.id.checkBox_int3wk3_Tuesday:

                break;


            case R.id.checkBox_int3wk3_thursday:

                break;


            case R.id.checkBox_int3wk3_friday:

                break;

            case R.id.checkBox_int3wk3_saturday:

                break;
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS93, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY71, complete_workout_thursday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY71, complete_workout_saturday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS93, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveThursday71 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSaturday71 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_thursday71.setChecked(checkboxSaveThursday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_saturday71.setChecked(checkboxSaveSaturday71);

    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float93", rating);
        editor_rating.putInt("numStars93", numStars);
        editor_rating.apply();
    }
}
