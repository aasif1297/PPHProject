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


public class BegLevel5Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level5_Week3";

    private static final String SHARED_PREFS45 = "sharedPrefs45";


    private CheckBox complete_workout_monday45;
    private CheckBox complete_workout_tuesday45;
    private CheckBox complete_workout_thursday45;
    private CheckBox complete_workout_friday45;
    private CheckBox complete_workout_saturday45;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY45 = "checkboxMonday45";
    private static final String CHECKBOX_TUESDAY45 = "checkboxTuesday45";
    private static final String CHECKBOX_THURSDAY45 = "checkboxThursday45";
    private static final String CHECKBOX_FRIDAY45 = "checkboxFriday45";
    private static final String CHECKBOX_SATURDAY45 = "checkboxSaturday45";



    private boolean checkboxSaveMonday45;
    private boolean checkboxSaveTuesday45;
    private boolean checkboxSaveThursday45;
    private boolean checkboxSaveFriday45;
    private boolean checkboxSaveSaturday45;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level5_week3,container,false);


        complete_workout_monday45 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk3_monday);
        complete_workout_tuesday45 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk3_Tuesday);
        complete_workout_thursday45 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk3_thursday);
        complete_workout_friday45 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk3_Friday);
        complete_workout_saturday45 = (CheckBox) view.findViewById(R.id.checkBox_beg5wk3_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b5w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something53", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float53", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_weighteddips = view.findViewById(R.id.weighted_dips);
        ImageButton mon_diamondpushes = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_pullups2222 = view.findViewById(R.id.pullups222);
        ImageButton iso2222 = view.findViewById(R.id.iso2222);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_weightedsquats22 = view.findViewById(R.id.weightedsquats22);
        ImageButton tues_weightedsquats222 = view.findViewById(R.id.weightedsquats222);

        ImageButton wed_foam = view.findViewById(R.id.foamicon);

        ImageButton thurs_pullups = view.findViewById(R.id.pullups2);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon);
        ImageButton thurs_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton thurs_clappingpushups = view.findViewById(R.id.clapping_pushups);
        ImageButton thurs_sbd = view.findViewById(R.id.sbd);
        ImageButton thurs_dips = view.findViewById(R.id.dips2);
        ImageButton thurs_diamondpushups = view.findViewById(R.id.diamond_pushups2);
        ImageButton thurs_pikepush = view.findViewById(R.id.pikepush);
        ImageButton thurs_lsit = view.findViewById(R.id.lsit);
        ImageButton thurs_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton thurs_barknee = view.findViewById(R.id.barknee);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton fri_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton fri_situps = view.findViewById(R.id.situpsicon);
        ImageButton fri_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton fri_plank = view.findViewById(R.id.plankicon);

        ImageButton sat_chinups = view.findViewById(R.id.chinups);
        ImageButton sat_pushup = view.findViewById(R.id.pushupicon2);
        ImageButton sat_fronttuck = view.findViewById(R.id.front_tuck);
        ImageButton sat_backtuck = view.findViewById(R.id.back_tuck);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);












        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_pullups2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });
        iso2222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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


        mon_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
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


        mon_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        tues_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
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
        tues_weightedsquats22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats222.setOnClickListener(new View.OnClickListener() {
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

        thurs_clappingpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Clapping_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_diamondpushups.setOnClickListener(new View.OnClickListener() {
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

        thurs_pikepush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        fri_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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

        fri_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
                startActivity(intent);
            }
        });

        fri_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });

        sat_backtuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        sat_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        sat_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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






        complete_workout_monday45.setOnCheckedChangeListener(this);
        complete_workout_tuesday45.setOnCheckedChangeListener(this);
        complete_workout_thursday45.setOnCheckedChangeListener(this);
        complete_workout_friday45.setOnCheckedChangeListener(this);
        complete_workout_saturday45.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg5wk3_monday:

                break;


            case R.id.checkBox_beg5wk3_Tuesday:

                break;


            case R.id.checkBox_beg5wk3_thursday:

                break;


            case R.id.checkBox_beg5wk3_Friday:

                break;

            case R.id.checkBox_beg5wk3_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS45, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY45, complete_workout_monday45.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY45, complete_workout_tuesday45.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY45, complete_workout_thursday45.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY45, complete_workout_friday45.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY45, complete_workout_saturday45.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS45, Context.MODE_PRIVATE);

        checkboxSaveMonday45 = sharedPreferences.getBoolean(CHECKBOX_MONDAY45, false);
        checkboxSaveTuesday45 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY45, false);
        checkboxSaveThursday45 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY45, false);
        checkboxSaveFriday45 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY45, false);
        checkboxSaveSaturday45 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY45, false);

    }

    public void updateViews1() {
        complete_workout_monday45.setChecked(checkboxSaveMonday45);
        complete_workout_tuesday45.setChecked(checkboxSaveTuesday45);
        complete_workout_thursday45.setChecked(checkboxSaveThursday45);
        complete_workout_friday45.setChecked(checkboxSaveFriday45);
        complete_workout_saturday45.setChecked(checkboxSaveSaturday45);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float53", rating);
        editor_rating.putInt("numStars53", numStars);
        editor_rating.apply();

    }
}

