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

public class AdvLevel4Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "ADV1_Level4_Week3";

    private static final String SHARED_PREFS233= "sharedPrefs233";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_wednesday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_saturday71;
    private CheckBox complete_workout_sunday71;


    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_WEDNESDAY71 = "checkboxWednesday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SATURDAY71 = "checkboxSaturday71";
    private static final String CHECKBOX_SUNDAY71 = "checkboxSaturday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveWednesday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSaturday71;
    private boolean checkboxSaveSunday71;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adv_level4_week3,container,false);

        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_Tuesday);
        complete_workout_wednesday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_wednesday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_friday);
        complete_workout_saturday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_Saturday);
        complete_workout_sunday71 = (CheckBox) view.findViewById(R.id.checkBox_adv4wk3_Sunday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_a4w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something233", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float233", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_weightedmuscleup = view.findViewById(R.id.mon_weightedmuscleup);
        ImageButton mon_weightedmuscleup2 = view.findViewById(R.id.mon_weightedmuscleup2);
        ImageButton mon_weightedmuscleup3 = view.findViewById(R.id.mon_weightedmuscleup3);
        ImageButton mon_muscleup = view.findViewById(R.id.mon_muscleup);
        ImageButton mon_ninetydegree = view.findViewById(R.id.mon_ninetydegree);
        ImageButton mon_straddleplanche = view.findViewById(R.id.mon_straddleplanche);
        ImageButton mon_vsit = view.findViewById(R.id.mon_vsit);
        ImageButton mon_frontlever = view.findViewById(R.id.mon_frontlever);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_frontsquats = view.findViewById(R.id.tues_frontsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.tues_weightedlunges);
        ImageButton tues_ghr = view.findViewById(R.id.tues_ghr);
        ImageButton tues_onecalfraise = view.findViewById(R.id.tues_onecalfraise);
        ImageButton tues_handstandpushups = view.findViewById(R.id.tues_handstandpushups);

        ImageButton wed_weighteddips = view.findViewById(R.id.wed_weighteddips);
        ImageButton wed_muscleups = view.findViewById(R.id.wed_muscleups);
        ImageButton wed_weighteddips2 = view.findViewById(R.id.wed_weighteddips2);
        ImageButton wed_muscleups2 = view.findViewById(R.id.wed_muscleups2);
        ImageButton wed_weighteddips3 = view.findViewById(R.id.wed_weighteddips3);
        ImageButton wed_ringmuscleups = view.findViewById(R.id.wed_ringmuscleups);
        ImageButton wed_lsitmuscleup = view.findViewById(R.id.wed_lsitmuscleup);
        ImageButton wed_ringdips = view.findViewById(R.id.wed_ringdips);
        ImageButton wed_backlever = view.findViewById(R.id.wed_backlever);
        ImageButton wed_straddleplanche = view.findViewById(R.id.wed_straddleplanche);
        ImageButton wed_tuckedplanche = view.findViewById(R.id.wed_tuckedplanche);

        ImageButton thurs_foamrolling = view.findViewById(R.id.foamicon);

        ImageButton fri_weightedpulls = view.findViewById(R.id.fri_weightedpulls);
        ImageButton fri_muscleups = view.findViewById(R.id.fri_muscleups);
        ImageButton fri_onearmpullup = view.findViewById(R.id.fri_onearmpullup);
        ImageButton fri_weightedpulls2 = view.findViewById(R.id.fri_weightedpulls2);
        ImageButton fri_muscleups2 = view.findViewById(R.id.fri_muscleups2);
        ImageButton fri_ringmuscleups = view.findViewById(R.id.fri_ringmuscleups);
        ImageButton fri_frontlever = view.findViewById(R.id.fri_frontlever);
        ImageButton fri_frontleverpulls = view.findViewById(R.id.fri_frontleverpulls);
        ImageButton fri_ninetydegree = view.findViewById(R.id.fri_ninetydegree);

        ImageButton sat_straddleplanche = view.findViewById(R.id.sat_straddleplanche);
        ImageButton sat_frontlever = view.findViewById(R.id.sat_frontlever);
        ImageButton sat_backlever = view.findViewById(R.id.sat_backlever);
        ImageButton sat_vsit = view.findViewById(R.id.sat_vsit);
        ImageButton sat_humanflag = view.findViewById(R.id.sat_humanflag);

        ImageButton sun_weightedsquats = view.findViewById(R.id.sun_weightedsquats);
        ImageButton sun_pistolsquats = view.findViewById(R.id.sun_pistolsquats);
        ImageButton sun_weightedlunges = view.findViewById(R.id.sun_weightedlunges);
        ImageButton sun_bulgarian = view.findViewById(R.id.sun_bulgarian);
        ImageButton sun_ghr = view.findViewById(R.id.sun_ghr);





















        mon_weightedmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        mon_ninetydegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_NinetyDeg_Handstand.class);
                startActivity(intent);
            }
        });

        mon_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        mon_vsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Vsit.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        tues_frontsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FrontSquats.class);
                startActivity(intent);
            }
        });

        tues_ghr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GHR.class);
                startActivity(intent);
            }
        });

        tues_handstandpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Handstand_Pushups.class);
                startActivity(intent);
            }
        });

        tues_onecalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
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

        wed_backlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever.class);
                startActivity(intent);
            }
        });

        wed_lsitmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit_Muscleup.class);
                startActivity(intent);
            }
        });

        wed_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        wed_muscleups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        wed_ringdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Dips.class);
                startActivity(intent);
            }
        });

        wed_ringmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });

        wed_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        wed_tuckedplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Planche_Tucks.class);
                startActivity(intent);
            }
        });

        wed_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        wed_weighteddips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        wed_weighteddips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        thurs_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });


        fri_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        fri_frontleverpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lever_Pullups.class);
                startActivity(intent);
            }
        });

        fri_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        fri_muscleups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        fri_ninetydegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_NinetyDeg_Handstand.class);
                startActivity(intent);
            }
        });

        fri_onearmpullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Onearm.class);
                startActivity(intent);
            }
        });

        fri_ringmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        fri_weightedpulls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        sat_backlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever.class);
                startActivity(intent);
            }
        });

        sat_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        sat_humanflag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_HumanFlag.class);
                startActivity(intent);
            }
        });

        sat_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        sat_vsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Vsit.class);
                startActivity(intent);
            }
        });

        sun_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
                startActivity(intent);
            }
        });

        sun_ghr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GHR.class);
                startActivity(intent);
            }
        });

        sun_pistolsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pistolsquats.class);
                startActivity(intent);
            }
        });

        sun_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });

        sun_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });





        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_wednesday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_saturday71.setOnCheckedChangeListener(this);
        complete_workout_sunday71.setOnCheckedChangeListener(this);



        loadData();
        updateViews();

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
        switch (buttonView.getId()) {

            case R.id.checkBox_adv4wk3_monday:

                break;


            case R.id.checkBox_adv4wk3_Tuesday:

                break;


            case R.id.checkBox_adv4wk3_wednesday:

                break;


            case R.id.checkBox_adv4wk3_friday:

                break;

            case R.id.checkBox_adv4wk3_Saturday:

                break;

            case R.id.checkBox_adv4wk3_Sunday:

                break;
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS233, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY71, complete_workout_wednesday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY71, complete_workout_saturday71.isChecked());
        editor.putBoolean(CHECKBOX_SUNDAY71, complete_workout_sunday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS233, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveWednesday71 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSaturday71 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY71, false);
        checkboxSaveSunday71 = sharedPreferences.getBoolean(CHECKBOX_SUNDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_wednesday71.setChecked(checkboxSaveWednesday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_saturday71.setChecked(checkboxSaveSaturday71);
        complete_workout_sunday71.setChecked(checkboxSaveSunday71);

    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float233", rating);
        editor_rating.putInt("numStars233", numStars);
        editor_rating.apply();
    }
}
