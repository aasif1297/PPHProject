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


public class IntLevel2Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "INT1_Level2_Week3";

    private static final String SHARED_PREFS83= "sharedPrefs83";


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
        View view = inflater.inflate(R.layout.int_level2_week3,container,false);

        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_int2wk3_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_int2wk3_Tuesday);
        complete_workout_thursday71 = (CheckBox) view.findViewById(R.id.checkBox_int2wk3_thursday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_int2wk3_friday);
        complete_workout_saturday71 = (CheckBox) view.findViewById(R.id.checkBox_int2wk3_saturday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_i2w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something83", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float83", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_muscleups = view.findViewById(R.id.mon_muscleup);
        ImageButton mon_muscleup2 = view.findViewById(R.id.mon_muscleup2);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_pullups = view.findViewById(R.id.mon_pullups);
        ImageButton mon_isometric = view.findViewById(R.id.mon_isometric);
        ImageButton mon_muscleup3 = view.findViewById(R.id.mon_muscleup3);
        ImageButton mon_sbd2 = view.findViewById(R.id.mon_sbd2);
        ImageButton mon_pullups2 = view.findViewById(R.id.mon_pullups2);
        ImageButton mon_russiandips = view.findViewById(R.id.mon_russiandips);
        ImageButton mon_crushers = view.findViewById(R.id.mon_crushers);
        ImageButton mon_lsit = view.findViewById(R.id.mon_lsit);
        ImageButton mon_windhsield = view.findViewById(R.id.mon_windhsield);
        ImageButton mon_barkneeraises = view.findViewById(R.id.mon_barkneeraises);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_bulgarian = view.findViewById(R.id.tues_bulgarian);
        ImageButton tues_assispistol = view.findViewById(R.id.tues_assispistol);
        ImageButton tues_hollowhold = view.findViewById(R.id.tues_hollowhold);

        ImageButton wed_foamrolling = view.findViewById(R.id.foamicon);

        ImageButton thurs_muscleup = view.findViewById(R.id.thurs_muscleup);
        ImageButton thurs_sbd = view.findViewById(R.id.thurs_sbd);
        ImageButton thurs_pulls = view.findViewById(R.id.thurs_pulls);
        ImageButton thurs_muscleup2 = view.findViewById(R.id.thurs_muscleup2);
        ImageButton thurs_bandedmuscleup = view.findViewById(R.id.thurs_bandedmuscleup);
        ImageButton thurs_muscleup3 = view.findViewById(R.id.thurs_muscleup3);
        ImageButton thurs_bandedmuscleup2 = view.findViewById(R.id.thurs_bandedmuscleup2);
        ImageButton thurs_pushups = view.findViewById(R.id.thurs_pushups);
        ImageButton thurs_dips = view.findViewById(R.id.thurs_dips);
        ImageButton thurs_barlegraises = view.findViewById(R.id.thurs_barlegraises);
        ImageButton thurs_lsit = view.findViewById(R.id.thurs_lsit);


        ImageButton fri_pulls = view.findViewById(R.id.fri_pulls);
        ImageButton fri_squats = view.findViewById(R.id.fri_squats);
        ImageButton fri_chins = view.findViewById(R.id.fri_chins);
        ImageButton fri_lunges = view.findViewById(R.id.fri_lunges);
        ImageButton fri_ringdips = view.findViewById(R.id.fri_ringdips);
        ImageButton fri_ringchins = view.findViewById(R.id.fri_ringchins);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.fri_jumpingsquats);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.fri_jumpinglunges);
        ImageButton fri_wallsit = view.findViewById(R.id.fri_wallsit);

        ImageButton sat_windshield = view.findViewById(R.id.sat_windshield);
        ImageButton sat_dragonflags = view.findViewById(R.id.sat_dragonflags);
        ImageButton sat_backextensions = view.findViewById(R.id.sat_backextensions);
        ImageButton sat_fronttuck = view.findViewById(R.id.sat_fronttuck);
        ImageButton sat_lsit = view.findViewById(R.id.sat_lsit);

        ImageButton sun_foamrolling = view.findViewById(R.id.foamicon2);




        mon_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });


        mon_barkneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });


        mon_crushers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SkullCrushers.class);
                startActivity(intent);
            }
        });

        mon_isometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_pullups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Dips.class);
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

        mon_sbd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        mon_windhsield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Windshield_Wipers.class);
                startActivity(intent);
            }
        });

        tues_assispistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Assisted_Pistolsquats.class);
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

        tues_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
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

        wed_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });



        thurs_bandedmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        thurs_bandedmuscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
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

        thurs_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        thurs_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
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


        thurs_muscleup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        thurs_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        thurs_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        fri_chins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        fri_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        fri_ringchins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ringpulls.class);
                startActivity(intent);
            }
        });

        fri_ringdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Dips.class);
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


        sat_backextensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_BackExtensions.class);
                startActivity(intent);
            }
        });


        sat_dragonflags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dragonflags.class);
                startActivity(intent);
            }
        });



        sat_fronttuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
                startActivity(intent);
            }
        });


        sat_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });


        sat_windshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Windshield_Wipers.class);
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


            case R.id.checkBox_int2wk3_monday:

                break;


            case R.id.checkBox_int2wk3_Tuesday:

                break;


            case R.id.checkBox_int2wk3_thursday:

                break;


            case R.id.checkBox_int2wk3_friday:

                break;

            case R.id.checkBox_int2wk3_saturday:

                break;
        }
    }


    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS83, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY71, complete_workout_thursday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY71, complete_workout_saturday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS83, Context.MODE_PRIVATE);

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
        editor_rating.putFloat("float83", rating);
        editor_rating.putInt("numStars83", numStars);
        editor_rating.apply();
    }
}
