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


public class BegLevel1Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {


    private static final String TAG = "BEG1_Level1_Week1";

    private static final String SHARED_PREFS = "sharedPrefs";


    private CheckBox complete_workout_monday;
    private CheckBox complete_workout_tuesday;
    private CheckBox complete_workout_thursday;
    private CheckBox complete_workout_friday;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;


    private static final String CHECKBOX_MONDAY = "checkboxMonday";
    private static final String CHECKBOX_TUESDAY = "checkboxTuesday";
    private static final String CHECKBOX_THURSDAY = "checkboxThursday";
    private static final String CHECKBOX_FRIDAY = "checkboxFriday";


    private boolean checkboxSaveMonday;
    private boolean checkboxSaveTuesday;
    private boolean checkboxSaveThursday;
    private boolean checkboxSaveFriday;





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level1_week1,container,false);


        complete_workout_monday = (CheckBox) view.findViewById(R.id.checkBox_beg1wk1_monday);
        complete_workout_tuesday = (CheckBox) view.findViewById(R.id.checkBox_beg1wk1_Tuesday);
        complete_workout_thursday = (CheckBox) view.findViewById(R.id.checkBox_beg1wk1_Thursday);
        complete_workout_friday = (CheckBox) view.findViewById(R.id.checkBox_beg1wk1_friday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b1w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_pushup = view.findViewById(R.id.pushup);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_situps = view.findViewById(R.id.situpsicon);
        ImageButton mon_roman = view.findViewById(R.id.romantwistsicon);
        ImageButton mon_plank = view.findViewById(R.id.plankicon);
        ImageButton mon_kneeraises = view.findViewById(R.id.barknee);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton tues_plank = view.findViewById(R.id.plankicon2);
        ImageButton tues_sidesquat = view.findViewById(R.id.sidesquatsicon);
        ImageButton tues_sideplank = view.findViewById(R.id.sideplank);
        ImageButton wed_foam = view.findViewById(R.id.foamicon);
        ImageButton thurs_band = view.findViewById(R.id.bandpulliconthurs);
        ImageButton thurs_iso = view.findViewById(R.id.isoicon);
        ImageButton thurs_pushups = view.findViewById(R.id.pushupicon);
        ImageButton thurs_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton thurs_widepushup = view.findViewById(R.id.widepushupicon);
        ImageButton thurs_floorraises = view.findViewById(R.id.floorraises);
        ImageButton thurs_plank = view.findViewById(R.id.plankicon3);
        ImageButton fri_squats = view.findViewById(R.id.squatsicon2);
        ImageButton fri_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton fri_jumpinglunges = view.findViewById(R.id.jumpinglungesicon2);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton fri_situps = view.findViewById(R.id.situpsicon2);
        ImageButton fri_sidelank = view.findViewById(R.id.sideplank2);
        ImageButton sat_foam = view.findViewById(R.id.foamicon2);
        ImageButton sun_foam = view.findViewById(R.id.foamicon3);













        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        mon_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        mon_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        mon_roman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        mon_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        mon_kneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        mon_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
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

        tues_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        tues_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        tues_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        tues_sidesquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sidesquats.class);
                startActivity(intent);
            }
        });

        tues_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        thurs_band.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        thurs_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });


        thurs_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        thurs_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        thurs_floorraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        thurs_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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

        fri_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
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

        fri_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        fri_sidelank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
                startActivity(intent);
            }
        });



        sat_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
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















        complete_workout_monday.setOnCheckedChangeListener(this);
        complete_workout_tuesday.setOnCheckedChangeListener(this);
        complete_workout_thursday.setOnCheckedChangeListener(this);
        complete_workout_friday.setOnCheckedChangeListener(this);




        loadData();
        updateViews();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
          switch (buttonView.getId()) {

              case R.id.checkBox_beg1wk1_monday:

                break;

            case R.id.checkBox_beg1wk1_Tuesday:

                break;

            case R.id.checkBox_beg1wk1_Thursday:

                break;

            case R.id.checkBox_beg1wk1_friday:

                break;
        }
    }





    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY, complete_workout_monday.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY, complete_workout_tuesday.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY, complete_workout_thursday.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY, complete_workout_friday.isChecked());


        editor.apply();
    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);

        checkboxSaveMonday = sharedPreferences.getBoolean(CHECKBOX_MONDAY, false);
        checkboxSaveTuesday = sharedPreferences.getBoolean(CHECKBOX_TUESDAY, false);
        checkboxSaveThursday = sharedPreferences.getBoolean(CHECKBOX_THURSDAY, false);
        checkboxSaveFriday = sharedPreferences.getBoolean(CHECKBOX_FRIDAY, false);
    }


    public void updateViews() {
        complete_workout_monday.setChecked(checkboxSaveMonday);
        complete_workout_tuesday.setChecked(checkboxSaveTuesday);
        complete_workout_thursday.setChecked(checkboxSaveThursday);
        complete_workout_friday.setChecked(checkboxSaveFriday);
    }







    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float", rating);
        editor_rating.putInt("numStars", numStars);
        editor_rating.apply();

    }

}


