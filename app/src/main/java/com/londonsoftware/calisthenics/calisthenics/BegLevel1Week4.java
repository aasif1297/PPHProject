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

public class BegLevel1Week4 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level1_Week4";
    private static final String SHARED_PREFS3 = "sharedPrefs3";


    private CheckBox complete_workout_monday3;
    private CheckBox complete_workout_tuesday3;
    private CheckBox complete_workout_wednesday3;
    private CheckBox complete_workout_friday3;
    private CheckBox complete_workout_saturday3;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY3 = "checkboxMonday3";
    private static final String CHECKBOX_TUESDAY3 = "checkboxTuesday3";
    private static final String CHECKBOX_WEDNESDAY3 = "checkboxWednesday3";
    private static final String CHECKBOX_FRIDAY3 = "checkboxFriday3";
    private static final String CHECKBOX_SATURDAY3 = "checkboxSaturday3";



    private boolean checkboxSaveMonday3;
    private boolean checkboxSaveTuesday3;
    private boolean checkboxSaveWednesday3;
    private boolean checkboxSaveFriday3;
    private boolean checkboxSaveSaturday3;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level1_week4,container,false);


        complete_workout_monday3 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk4_monday);
        complete_workout_tuesday3 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk4_Tuesday);
        complete_workout_wednesday3 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk4_wednesday);
        complete_workout_friday3 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk4_friday);
        complete_workout_saturday3 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk4_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b1w4);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something3", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float3", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_bandpull2 = view.findViewById(R.id.bandpullsicon2);
        ImageButton mon_pushup = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_barkneeraises = view.findViewById(R.id.barknee);
        ImageButton mon_plank = view.findViewById(R.id.plankicon);
        ImageButton mon_situps = view.findViewById(R.id.situpsicon);

        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_leapfrogs = view.findViewById(R.id.leapfrogsicon);


        ImageButton wed_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton wed_dips = view.findViewById(R.id.dips);
        ImageButton wed_widepushup = view.findViewById(R.id.widepushupicon);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_pushups = view.findViewById(R.id.pushupicon3);
        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullsicon3);
        ImageButton fri_iso = view.findViewById(R.id.isoicon2);
        ImageButton fri_situps = view.findViewById(R.id.situpsicon2);
        ImageButton fri_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton fri_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton fri_sideplank = view.findViewById(R.id.sideplank);


        ImageButton sat_squats = view.findViewById(R.id.squatsicon2);
        ImageButton sat_lunges = view.findViewById(R.id.lungesicon2);

        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon2);
        ImageButton sat_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);


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

        mon_bandpull2.setOnClickListener(new View.OnClickListener() {
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

        mon_barkneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
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

        tues_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
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

        tues_leapfrogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Broadjumps.class);
                startActivity(intent);
            }
        });






        wed_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        wed_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
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

        fri_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
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

        fri_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        fri_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        fri_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        sat_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        sat_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
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



        complete_workout_monday3.setOnCheckedChangeListener(this);
        complete_workout_tuesday3.setOnCheckedChangeListener(this);
        complete_workout_wednesday3.setOnCheckedChangeListener(this);
        complete_workout_friday3.setOnCheckedChangeListener(this);
        complete_workout_saturday3.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg1wk4_monday:

                break;


            case R.id.checkBox_beg1wk4_Tuesday:

                break;


            case R.id.checkBox_beg1wk4_wednesday:

                break;


            case R.id.checkBox_beg1wk4_friday:

                break;

            case R.id.checkBox_beg1wk4_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS3, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY3, complete_workout_monday3.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY3, complete_workout_tuesday3.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY3, complete_workout_wednesday3.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY3, complete_workout_friday3.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY3, complete_workout_saturday3.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS3, Context.MODE_PRIVATE);

        checkboxSaveMonday3 = sharedPreferences.getBoolean(CHECKBOX_MONDAY3, false);
        checkboxSaveTuesday3 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY3, false);
        checkboxSaveWednesday3 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY3, false);
        checkboxSaveFriday3 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY3, false);
        checkboxSaveSaturday3 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY3, false);

    }

    public void updateViews1() {
        complete_workout_monday3.setChecked(checkboxSaveMonday3);
        complete_workout_tuesday3.setChecked(checkboxSaveTuesday3);
        complete_workout_wednesday3.setChecked(checkboxSaveWednesday3);
        complete_workout_friday3.setChecked(checkboxSaveFriday3);
        complete_workout_saturday3.setChecked(checkboxSaveSaturday3);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float3", rating);
        editor_rating.putInt("numStars3", numStars);
        editor_rating.apply();

    }

}

