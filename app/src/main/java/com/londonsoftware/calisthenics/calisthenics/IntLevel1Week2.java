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


public class IntLevel1Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "INT1_Level1_Week2";



    private static final String SHARED_PREFS72 = "sharedPrefs72";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_wednesday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_sunday71;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_WEDNESDAY71 = "checkboxWednesday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SUNDAY71 = "checkboxSunday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveWednesday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSunday71;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.int_level1_week2,container,false);


        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk2_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk2_Tuesday);
        complete_workout_wednesday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk2_thursday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk2_Friday);
        complete_workout_sunday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk2_Saturday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_i1w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something72", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float72", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_bandedmuscleups = view.findViewById(R.id.mon_bandedmuscleups);
        ImageButton mon_weightedpulls = view.findViewById(R.id.mon_weightedpulls);
        ImageButton mon_weighteddips = view.findViewById(R.id.mon_weighteddips);
        ImageButton mon_onearmpushups = view.findViewById(R.id.mon_onearmpushups);
        ImageButton mon_crushers = view.findViewById(R.id.mon_crushers);
        ImageButton mon_russianpush = view.findViewById(R.id.mon_russianpush);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_pulls = view.findViewById(R.id.mon_pulls);
        ImageButton mon_iso = view.findViewById(R.id.mon_iso);
        ImageButton mon_barlegraises = view.findViewById(R.id.mon_barlegraises);
        ImageButton mon_fronttuck = view.findViewById(R.id.mon_fronttuck);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.tues_weightedlunges);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_weightedlunges2 = view.findViewById(R.id.tues_weightedlunges2);
        ImageButton tues_wallsit = view.findViewById(R.id.tues_wallsit);
        ImageButton tues_calfraises = view.findViewById(R.id.tues_calfraises);


        ImageButton wed_foamicon = view.findViewById(R.id.foamicon);

        ImageButton thurs_bandmuscleups = view.findViewById(R.id.thurs_bandmuscleups);
        ImageButton thurs_bandmuscleups2 = view.findViewById(R.id.thurs_bandmuscleups2);
        ImageButton thurs_bandmuscleups3 = view.findViewById(R.id.thurs_bandmuscleups3);
        ImageButton thurs_sbd = view.findViewById(R.id.thurs_sbd);
        ImageButton thurs_pulls = view.findViewById(R.id.thurs_pulls);
        ImageButton thurs_chins = view.findViewById(R.id.thurs_chins);
        ImageButton thurs_russiandips = view.findViewById(R.id.thurs_russiandips);
        ImageButton thurs_dips = view.findViewById(R.id.thurs_dips);
        ImageButton thurs_russianpushups = view.findViewById(R.id.thurs_russianpushups);

        ImageButton fri_weightedsquats = view.findViewById(R.id.fri_weightedsquats);
        ImageButton fri_bulgarian = view.findViewById(R.id.fri_bulgarian);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.fri_jumpinglunges);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.fri_jumpingsquats);
        ImageButton fri_bandedmuscleups = view.findViewById(R.id.fri_bandedmuscleups);

        ImageButton sat_fronttuck = view.findViewById(R.id.sat_fronttuck);
        ImageButton sat_backtucks = view.findViewById(R.id.sat_backtucks);
        ImageButton sat_lsit = view.findViewById(R.id.sat_lsit);

        ImageButton sun_foamicon2 = view.findViewById(R.id.foamicon2);


        mon_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
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

        mon_crushers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SkullCrushers.class);
                startActivity(intent);
            }
        });


        mon_fronttuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
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


        mon_onearmpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Onearm_Pushups.class);
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


        mon_russianpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
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

        mon_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
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


        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
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

        tues_weightedlunges2.setOnClickListener(new View.OnClickListener() {
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

        wed_foamicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });




        thurs_bandmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        thurs_bandmuscleups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        thurs_bandmuscleups3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        thurs_chins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        thurs_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        thurs_russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Dips.class);
                startActivity(intent);
            }
        });

        thurs_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
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

        fri_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
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


        fri_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sat_backtucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever_Kneetucks.class);
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

        sun_foamicon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });



        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_wednesday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_sunday71.setOnCheckedChangeListener(this);




        loadData();
        updateViews();


        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        saveData();
        switch (buttonView.getId()) {


            case R.id.checkBox_int1wk2_monday:

                break;


            case R.id.checkBox_int1wk2_Tuesday:

                break;


            case R.id.checkBox_int1wk2_thursday:

                break;



            case R.id.checkBox_int1wk2_Friday:

                break;

            case R.id.checkBox_int1wk2_Saturday:

                break;
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS72, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY71, complete_workout_wednesday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SUNDAY71, complete_workout_sunday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS72, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveWednesday71 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSunday71 = sharedPreferences.getBoolean(CHECKBOX_SUNDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_wednesday71.setChecked(checkboxSaveWednesday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_sunday71.setChecked(checkboxSaveSunday71);

    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            final int numStars = ratingBar.getNumStars();
            editor_rating = sharedPreferences_rating.edit();
            editor_rating.putFloat("float72", rating);
            editor_rating.putInt("numStars72", numStars);
            editor_rating.apply();

        }


}
