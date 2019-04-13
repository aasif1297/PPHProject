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

public class BegLevel5Week5 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level5_Week5";

    private static final String SHARED_PREFS67 = "sharedPrefs67";


    private CheckBox complete_workout_monday67;
    private CheckBox complete_workout_tuesday67;
    private CheckBox complete_workout_thursday67;
    private CheckBox complete_workout_saturday67;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY67 = "checkboxMonday67";
    private static final String CHECKBOX_TUESDAY67 = "checkboxTuesday67";
    private static final String CHECKBOX_THURSDAY67 = "checkboxThursday67";
    private static final String CHECKBOX_SATURDAY67 = "checkboxSaturday67";



    private boolean checkboxSaveMonday67;
    private boolean checkboxSaveTuesday67;
    private boolean checkboxSaveThursday67;
    private boolean checkboxSaveSaturday67;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level5_week5,container,false);


        complete_workout_monday67 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk5_monday);
        complete_workout_tuesday67 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk5_Tuesday);
        complete_workout_thursday67 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk5_thursday);
        complete_workout_saturday67 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk5_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b5w5);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something55", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float55", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pikepush = view.findViewById(R.id.pikepush);
        ImageButton mon_russianpushes = view.findViewById(R.id.russianpushups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_sbd = view.findViewById(R.id.sbd);
        ImageButton mon_diamondpushes = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_pullups2 = view.findViewById(R.id.pullups3);
        ImageButton mon_lsit = view.findViewById(R.id.lsit);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_pullups11 = view.findViewById(R.id.pullups11);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_weightedpulls = view.findViewById(R.id.weighted_pullups);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon2);
        ImageButton thurs_closegrippulls = view.findViewById(R.id.closegrip_pulls);
        ImageButton thurs_weighteddips = view.findViewById(R.id.weighted_dips);
        ImageButton thurs_weightedpushups = view.findViewById(R.id.weighted_pushups);
        ImageButton thurs_russianpushes = view.findViewById(R.id.russianpushups2);
        ImageButton thurs_lsit = view.findViewById(R.id.lsit2);
        ImageButton thurs_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton thurs_sideplank = view.findViewById(R.id.sideplank);
        ImageButton thurs_weightedchins = view.findViewById(R.id.weighted_pullups20);
        ImageButton isoicon20 = view.findViewById(R.id.isoicon20);
        ImageButton closegrip_chins = view.findViewById(R.id.closegrip_chins);

        ImageButton fri_foam = view.findViewById(R.id.foamicon2);

        ImageButton sat_weightedsquats2 = view.findViewById(R.id.weightedsquats2);
        ImageButton sat_weightedlunges2 = view.findViewById(R.id.weightedlunges2);
        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton sat_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton sat_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);

        ImageButton sun_foam = view.findViewById(R.id.foamicon3);





        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });
        mon_pullups11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_diamondpushes.setOnClickListener(new View.OnClickListener() {
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

        mon_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        mon_pikepush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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

        mon_russianpushes.setOnClickListener(new View.OnClickListener() {
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

        tues_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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

        thurs_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });


        thurs_closegrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Closegrip_Pull.class);
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
        thurs_weightedchins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        isoicon20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        closegrip_chins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Closegrip_Chin.class);
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

        thurs_russianpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        thurs_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        thurs_weightedpushups.setOnClickListener(new View.OnClickListener() {
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


        sat_jumpinglunges.setOnClickListener(new View.OnClickListener() {
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

        sat_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
                startActivity(intent);
            }
        });


        sat_weightedlunges2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
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



        complete_workout_monday67.setOnCheckedChangeListener(this);
        complete_workout_tuesday67.setOnCheckedChangeListener(this);
        complete_workout_thursday67.setOnCheckedChangeListener(this);
        complete_workout_saturday67.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg5wk5_monday:

                break;


            case R.id.checkBox_beg5wk5_Tuesday:

                break;


            case R.id.checkBox_beg5wk5_thursday:

                break;



            case R.id.checkBox_beg5wk5_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS67, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY67, complete_workout_monday67.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY67, complete_workout_tuesday67.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY67, complete_workout_thursday67.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY67, complete_workout_saturday67.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS67, Context.MODE_PRIVATE);

        checkboxSaveMonday67 = sharedPreferences.getBoolean(CHECKBOX_MONDAY67, false);
        checkboxSaveTuesday67 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY67, false);
        checkboxSaveThursday67 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY67, false);
        checkboxSaveSaturday67 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY67, false);

    }

    public void updateViews1() {
        complete_workout_monday67.setChecked(checkboxSaveMonday67);
        complete_workout_tuesday67.setChecked(checkboxSaveTuesday67);
        complete_workout_thursday67.setChecked(checkboxSaveThursday67);
        complete_workout_saturday67.setChecked(checkboxSaveSaturday67);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float55", rating);
        editor_rating.putInt("numStars55", numStars);
        editor_rating.apply();

    }
}

