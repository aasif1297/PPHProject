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

public class BegLevel5Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level5_Week1";

    private static final String SHARED_PREFS23 = "sharedPrefs23";


    private CheckBox complete_workout_monday23;
    private CheckBox complete_workout_tuesday23;
    private CheckBox complete_workout_thursday23;
    private CheckBox complete_workout_saturday23;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY23 = "checkboxMonday23";
    private static final String CHECKBOX_TUESDAY23 = "checkboxTuesday23";
    private static final String CHECKBOX_THURSDAY23 = "checkboxThursday23";
    private static final String CHECKBOX_SATURDAY23 = "checkboxSaturday23";



    private boolean checkboxSaveMonday23;
    private boolean checkboxSaveTuesday23;
    private boolean checkboxSaveThursday23;
    private boolean checkboxSaveSaturday23;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level5_week1,container,false);


        complete_workout_monday23 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk1_monday);
        complete_workout_tuesday23 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk1_Tuesday);
        complete_workout_thursday23 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk1_thursday);
        complete_workout_saturday23 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk1_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b5w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something51", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float51", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_weightedpulls = view.findViewById(R.id.weighted_pullups);
        ImageButton mon_weighteddips = view.findViewById(R.id.weighted_dips);
        ImageButton mon_russianpushups = view.findViewById(R.id.russianpushups);
        ImageButton mon_sbd = view.findViewById(R.id.sbd);
        ImageButton mon_lsit = view.findViewById(R.id.lsit);
        ImageButton mon_barlegraises = view.findViewById(R.id.bar_legraises);


        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_pulls = view.findViewById(R.id.pullups2);
        ImageButton thurs_sbd = view.findViewById(R.id.sbd2);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_chinups = view.findViewById(R.id.chinups);
        ImageButton thurs_diamondpush = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton thurs_dips2 = view.findViewById(R.id.dips3);
        ImageButton thurs_pulls2 = view.findViewById(R.id.pullups3);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon2);
        ImageButton thurs_pushup = view.findViewById(R.id.pushupicon);
        ImageButton thurs_iso2 = view.findViewById(R.id.isoicon3);
        ImageButton thurs_russianpushes = view.findViewById(R.id.russianpushups2);

        ImageButton fri_foam = view.findViewById(R.id.foamicon2);

        ImageButton sat_squats = view.findViewById(R.id.squatsicon2);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon2);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton sat_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton sat_onelegglute = view.findViewById(R.id.oneleg_glute);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);
        ImageButton sat_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton sat_hollowholds = view.findViewById(R.id.hollowhold);

        ImageButton sun_foam = view.findViewById(R.id.foamicon3);





        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        mon_russianpushups.setOnClickListener(new View.OnClickListener() {
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

        tues_onelegcalf.setOnClickListener(new View.OnClickListener() {
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




        wed_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        thurs_diamondpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        thurs_dips2.setOnClickListener(new View.OnClickListener() {
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

        thurs_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        thurs_pulls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        thurs_russianpushes.setOnClickListener(new View.OnClickListener() {
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


        thurs_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        sat_hollowholds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        sat_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        sat_onelegglute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
                startActivity(intent);
            }
        });


        sat_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
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

        sat_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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



        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });


        complete_workout_monday23.setOnCheckedChangeListener(this);
        complete_workout_tuesday23.setOnCheckedChangeListener(this);
        complete_workout_thursday23.setOnCheckedChangeListener(this);
        complete_workout_saturday23.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg5wk1_monday:

                break;


            case R.id.checkBox_beg5wk1_Tuesday:

                break;


            case R.id.checkBox_beg5wk1_thursday:

                break;



            case R.id.checkBox_beg5wk1_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS23, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY23, complete_workout_monday23.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY23, complete_workout_tuesday23.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY23, complete_workout_thursday23.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY23, complete_workout_saturday23.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS23, Context.MODE_PRIVATE);

        checkboxSaveMonday23 = sharedPreferences.getBoolean(CHECKBOX_MONDAY23, false);
        checkboxSaveTuesday23 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY23, false);
        checkboxSaveThursday23 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY23, false);
        checkboxSaveSaturday23 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY23, false);

    }

    public void updateViews1() {
        complete_workout_monday23.setChecked(checkboxSaveMonday23);
        complete_workout_tuesday23.setChecked(checkboxSaveTuesday23);
        complete_workout_thursday23.setChecked(checkboxSaveThursday23);
        complete_workout_saturday23.setChecked(checkboxSaveSaturday23);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float51", rating);
        editor_rating.putInt("numStars51", numStars);
        editor_rating.apply();

    }
}

