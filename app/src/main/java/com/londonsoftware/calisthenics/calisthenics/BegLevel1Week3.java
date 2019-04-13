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

public class BegLevel1Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level1_Week3";

    private static final String SHARED_PREFS2 = "sharedPrefs2";


    private CheckBox complete_workout_monday2;
    private CheckBox complete_workout_tuesday2;
    private CheckBox complete_workout_thursday2;
    private CheckBox complete_workout_friday2;
    private CheckBox complete_workout_saturday2;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;


    private static final String CHECKBOX_MONDAY2 = "checkboxMonday2";
    private static final String CHECKBOX_TUESDAY2 = "checkboxTuesday2";
    private static final String CHECKBOX_THURSDAY2 = "checkboxThursday2";
    private static final String CHECKBOX_FRIDAY2 = "checkboxFriday2";
    private static final String CHECKBOX_SATURDAY2 = "checkboxSaturday2";



    private boolean checkboxSaveMonday2;
    private boolean checkboxSaveTuesday2;
    private boolean checkboxSaveThursday2;
    private boolean checkboxSaveFriday2;
    private boolean checkboxSaveSaturday2;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level1_week3,container,false);


        complete_workout_monday2 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk3_monday);
        complete_workout_tuesday2 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk3_Tuesday);
        complete_workout_thursday2 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk3_wednesday);
        complete_workout_friday2 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk3_friday);
        complete_workout_saturday2 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk3_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b1w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something2", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float2", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_widepushup = view.findViewById(R.id.widepushupicon);
        ImageButton mon_pushup = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton wed_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_sideplank = view.findViewById(R.id.sideplank);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_widepushup = view.findViewById(R.id.widepushupicon2);
        ImageButton wed_barkneeraises = view.findViewById(R.id.barknee);
        ImageButton thurs_foam = view.findViewById(R.id.foamicon);
        ImageButton fri_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton fri_widepushups = view.findViewById(R.id.widepushupicon3);
        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullicon3);
        ImageButton fri_iso = view.findViewById(R.id.isoicon3);
        ImageButton fri_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton sat_squats = view.findViewById(R.id.squatsicon2);
        ImageButton sat_plank = view.findViewById(R.id.plankicon3);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);
        ImageButton sat_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton sat_plank2 = view.findViewById(R.id.plankicon4);
        ImageButton sat_romantwists = view.findViewById(R.id.romantwistsicon2);
        ImageButton sun_foam = view.findViewById(R.id.foamicon2);






        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        mon_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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

        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        tues_jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        wed_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
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

        wed_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
                startActivity(intent);
            }
        });

        wed_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        wed_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        wed_barkneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
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

        fri_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        fri_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        fri_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        fri_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        fri_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        sat_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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

        sat_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sat_plank2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
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


        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });






        complete_workout_monday2.setOnCheckedChangeListener(this);
        complete_workout_tuesday2.setOnCheckedChangeListener(this);
        complete_workout_thursday2.setOnCheckedChangeListener(this);
        complete_workout_friday2.setOnCheckedChangeListener(this);
        complete_workout_saturday2.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg1wk3_monday:

                break;


            case R.id.checkBox_beg1wk3_Tuesday:

                break;


            case R.id.checkBox_beg1wk3_wednesday:

                break;


            case R.id.checkBox_beg1wk3_friday:

                break;

            case R.id.checkBox_beg1wk3_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS2, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY2, complete_workout_monday2.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY2, complete_workout_tuesday2.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY2, complete_workout_thursday2.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY2, complete_workout_friday2.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY2, complete_workout_saturday2.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS2, Context.MODE_PRIVATE);

        checkboxSaveMonday2 = sharedPreferences.getBoolean(CHECKBOX_MONDAY2, false);
        checkboxSaveTuesday2 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY2, false);
        checkboxSaveThursday2 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY2, false);
        checkboxSaveFriday2 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY2, false);
        checkboxSaveSaturday2 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY2, false);

    }

    public void updateViews1() {
        complete_workout_monday2.setChecked(checkboxSaveMonday2);
        complete_workout_tuesday2.setChecked(checkboxSaveTuesday2);
        complete_workout_thursday2.setChecked(checkboxSaveThursday2);
        complete_workout_friday2.setChecked(checkboxSaveFriday2);
        complete_workout_saturday2.setChecked(checkboxSaveSaturday2);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float2", rating);
        editor_rating.putInt("numStars2", numStars);
        editor_rating.apply();

    }
}

