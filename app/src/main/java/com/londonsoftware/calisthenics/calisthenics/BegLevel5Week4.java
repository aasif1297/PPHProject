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

public class BegLevel5Week4 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level5_Week4";

    private static final String SHARED_PREFS56 = "sharedPrefs56";


    private CheckBox complete_workout_monday56;
    private CheckBox complete_workout_tuesday56;
    private CheckBox complete_workout_wednesday56;
    private CheckBox complete_workout_thursday56;
    private CheckBox complete_workout_saturday56;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY56 = "checkboxMonday56";
    private static final String CHECKBOX_TUESDAY56 = "checkboxTuesday56";
    private static final String CHECKBOX_WEDNESDAY56 = "checkboxWednesday56";
    private static final String CHECKBOX_THURSDAY56 = "checkboxThursday56";
    private static final String CHECKBOX_SATURDAY56 = "checkboxSaturday56";



    private boolean checkboxSaveMonday56;
    private boolean checkboxSaveTuesday56;
    private boolean checkboxSaveWednesday56;
    private boolean checkboxSaveThursday56;
    private boolean checkboxSaveSaturday56;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level5_week4,container,false);


        complete_workout_monday56 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk4_monday);
        complete_workout_tuesday56 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk4_Tuesday);
        complete_workout_wednesday56 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk4_Wednesday);
        complete_workout_thursday56 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk4_thursday);
        complete_workout_saturday56 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk4_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b5w4);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something54", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float54", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_weighteddips = view.findViewById(R.id.weighted_dips);
        ImageButton mon_highchins = view.findViewById(R.id.highchins);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);
        ImageButton mon_pullups2 = view.findViewById(R.id.pullups2);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_sbd = view.findViewById(R.id.sbd);
        ImageButton mon_weightedpushups = view.findViewById(R.id.weighted_pushups);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.weightedsquats2);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_fronttuck = view.findViewById(R.id.front_tuck);
        ImageButton wed_backtuck = view.findViewById(R.id.back_tuck);

        ImageButton thurs_pulls = view.findViewById(R.id.pullups3);
        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon3);
        ImageButton thurs_pikes = view.findViewById(R.id.pikepush);
        ImageButton thurs_weightedpushes = view.findViewById(R.id.weighted_pushups2);
        ImageButton thurs_dips = view.findViewById(R.id.dips);
        ImageButton thurs_lsit = view.findViewById(R.id.lsit);
        ImageButton thurs_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton thurs_barknee = view.findViewById(R.id.barknee);

        ImageButton fri_foam = view.findViewById(R.id.foamicon2);

        ImageButton sat_weightedsquats = view.findViewById(R.id.weightedsquats3);
        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton sat_weightedsquats2 = view.findViewById(R.id.weightedsquats4);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);

        ImageButton sun_foam = view.findViewById(R.id.foamicon);

        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        mon_highchins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Highpull.class);
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

        mon_pullups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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


        mon_weightedpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });

        tues_onelegcalf.setOnClickListener(new View.OnClickListener() {
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

        wed_backtuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        wed_fronttuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
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

        thurs_barknee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
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

        thurs_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        thurs_pikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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

        thurs_weightedpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });



        fri_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
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

        sat_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        sat_weightedsquats2.setOnClickListener(new View.OnClickListener() {
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

        complete_workout_monday56.setOnCheckedChangeListener(this);
        complete_workout_tuesday56.setOnCheckedChangeListener(this);
        complete_workout_wednesday56.setOnCheckedChangeListener(this);
        complete_workout_thursday56.setOnCheckedChangeListener(this);
        complete_workout_saturday56.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg5wk4_monday:

                break;


            case R.id.checkBox_beg5wk4_Tuesday:

                break;

            case R.id.checkBox_beg5wk4_Wednesday:

                break;


            case R.id.checkBox_beg5wk4_thursday:

                break;




            case R.id.checkBox_beg5wk4_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS56, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY56, complete_workout_monday56.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY56, complete_workout_tuesday56.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY56, complete_workout_thursday56.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY56, complete_workout_wednesday56.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY56, complete_workout_saturday56.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS56, Context.MODE_PRIVATE);

        checkboxSaveMonday56 = sharedPreferences.getBoolean(CHECKBOX_MONDAY56, false);
        checkboxSaveTuesday56 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY56, false);
        checkboxSaveThursday56 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY56, false);
        checkboxSaveWednesday56 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY56, false);
        checkboxSaveSaturday56 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY56, false);

    }

    public void updateViews1() {
        complete_workout_monday56.setChecked(checkboxSaveMonday56);
        complete_workout_tuesday56.setChecked(checkboxSaveTuesday56);
        complete_workout_thursday56.setChecked(checkboxSaveThursday56);
        complete_workout_wednesday56.setChecked(checkboxSaveWednesday56);
        complete_workout_saturday56.setChecked(checkboxSaveSaturday56);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float54", rating);
        editor_rating.putInt("numStars54", numStars);
        editor_rating.apply();

    }
}

