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

public class BegLevel4Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level4_Week1";

    private static final String SHARED_PREFS66 = "sharedPrefs66";

    private CheckBox complete_workout_monday66;
    private CheckBox complete_workout_tuesday66;
    private CheckBox complete_workout_wednesday66;
    private CheckBox complete_workout_friday66;
    private CheckBox complete_workout_saturday66;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY66 = "checkboxMonday66";
    private static final String CHECKBOX_TUESDAY66 = "checkboxTuesday66";
    private static final String CHECKBOX_WEDNESDAY66 = "checkboxWednesday66";
    private static final String CHECKBOX_FRIDAY66 = "checkboxFriday66";
    private static final String CHECKBOX_SATURDAY66 = "checkboxSaturday66";



    private boolean checkboxSaveMonday66;
    private boolean checkboxSaveTuesday66;
    private boolean checkboxSaveWednesday66;
    private boolean checkboxSaveFriday66;
    private boolean checkboxSaveSaturday66;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level4_week1,container,false);


        complete_workout_monday66 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk1_monday);
        complete_workout_tuesday66 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk1_Tuesday);
        complete_workout_wednesday66 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk1_wednesday);
        complete_workout_friday66 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk1_friday);
        complete_workout_saturday66 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk1_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b4w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something41", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float41", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_sbdips = view.findViewById(R.id.sbd);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_widepushups = view.findViewById(R.id.widepushupicon);


        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_onelegglute = view.findViewById(R.id.oneleg_glute);
        ImageButton tues_onelegcalfraises = view.findViewById(R.id.onelegcalfraise);

        ImageButton wed_chinups = view.findViewById(R.id.chinups2);
        ImageButton wed_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton wed_pikepush = view.findViewById(R.id.pikepush);
        ImageButton wed_widepush = view.findViewById(R.id.widepushupicon2);
        ImageButton wed_widgrippulls = view.findViewById(R.id.widegrip_pulls);
        ImageButton wed_hollowhold = view.findViewById(R.id.hollowhold);
        ImageButton wed_plank = view.findViewById(R.id.plankicon2);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton fri_wallsit = view.findViewById(R.id.wallsiticon);

        ImageButton sat_dips = view.findViewById(R.id.dips2);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);
        ImageButton sat_pikes = view.findViewById(R.id.pikes);
        ImageButton sat_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton sat_hollowhold = view.findViewById(R.id.hollowhold2);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);













        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        mon_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        mon_sbdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        mon_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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

        tues_onelegcalfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        tues_onelegglute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
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

        wed_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        wed_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        wed_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        wed_pikepush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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

        wed_widepush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        wed_widgrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widegrip_Pull.class);
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

        sat_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        sat_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        sat_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        sat_pikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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



        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });




        complete_workout_monday66.setOnCheckedChangeListener(this);
        complete_workout_tuesday66.setOnCheckedChangeListener(this);
        complete_workout_wednesday66.setOnCheckedChangeListener(this);
        complete_workout_friday66.setOnCheckedChangeListener(this);
        complete_workout_saturday66.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg4wk1_monday:

                break;


            case R.id.checkBox_beg4wk1_Tuesday:

                break;


            case R.id.checkBox_beg4wk1_wednesday:

                break;


            case R.id.checkBox_beg4wk1_friday:

                break;

            case R.id.checkBox_beg4wk1_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS66, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY66, complete_workout_monday66.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY66, complete_workout_tuesday66.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY66, complete_workout_wednesday66.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY66, complete_workout_friday66.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY66, complete_workout_saturday66.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS66, Context.MODE_PRIVATE);

        checkboxSaveMonday66 = sharedPreferences.getBoolean(CHECKBOX_MONDAY66, false);
        checkboxSaveTuesday66 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY66, false);
        checkboxSaveWednesday66 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY66, false);
        checkboxSaveFriday66 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY66, false);
        checkboxSaveSaturday66 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY66, false);

    }

    public void updateViews1() {
        complete_workout_monday66.setChecked(checkboxSaveMonday66);
        complete_workout_tuesday66.setChecked(checkboxSaveTuesday66);
        complete_workout_wednesday66.setChecked(checkboxSaveWednesday66);
        complete_workout_friday66.setChecked(checkboxSaveFriday66);
        complete_workout_saturday66.setChecked(checkboxSaveSaturday66);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float41", rating);
        editor_rating.putInt("numStars41", numStars);
        editor_rating.apply();

    }
}

