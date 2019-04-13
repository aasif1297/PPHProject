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

public class BegLevel1Week5 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String SHARED_PREFS4 = "sharedPrefs4";


    private CheckBox complete_workout_monday4;
    private CheckBox complete_workout_tuesday4;
    private CheckBox complete_workout_wednesday4;
    private CheckBox complete_workout_friday4;
    private CheckBox complete_workout_saturday4;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY4 = "checkboxMonday4";
    private static final String CHECKBOX_TUESDAY4 = "checkboxTuesday4";
    private static final String CHECKBOX_WEDNESDAY4 = "checkboxWednesday4";
    private static final String CHECKBOX_FRIDAY4 = "checkboxFriday4";
    private static final String CHECKBOX_SATURDAY4 = "checkboxSaturday4";



    private boolean checkboxSaveMonday4;
    private boolean checkboxSaveTuesday4;
    private boolean checkboxSaveWednesday4;
    private boolean checkboxSaveFriday4;
    private boolean checkboxSaveSaturday4;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level1_week5,container,false);


        complete_workout_monday4 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk5_monday);
        complete_workout_tuesday4 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk5_Tuesday);
        complete_workout_wednesday4 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk5_wednesday);
        complete_workout_friday4 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk5_friday);
        complete_workout_saturday4 = (CheckBox) view.findViewById(R.id.checkBox_beg1wk5_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b1w5);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something4", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float4", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_widepushups = view.findViewById(R.id.widepushupicon);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);

        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_bandpulls = view.findViewById(R.id.bandpullsicon3);
        ImageButton wed_isohold = view.findViewById(R.id.isoicon3);
        ImageButton wed_widegrippulls = view.findViewById(R.id.widegrip_pulls);
        ImageButton wed_widepushup = view.findViewById(R.id.widepushupicon3);
        ImageButton wed_pushup = view.findViewById(R.id.pushupicon2);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_floorraises = view.findViewById(R.id.floorraises);
        ImageButton wed_deadhang = view.findViewById(R.id.deadhangicon3);
        ImageButton wed_barknee = view.findViewById(R.id.barknee);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon2);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon2);
        ImageButton fri_calfraises = view.findViewById(R.id.calfraisesicon2);

        ImageButton sat_bandpulls = view.findViewById(R.id.bandpullicon3);
        ImageButton sat_bandpulls4 = view.findViewById(R.id.bandpullicon4);
        ImageButton sat_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton sat_widepushup = view.findViewById(R.id.widepushupicon2);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);

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

        mon_widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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


        tues_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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

        tues_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
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

        tues_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        wed_isohold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        wed_widegrippulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widegrip_Pull.class);
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

        wed_pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        wed_floorraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        wed_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        wed_barknee.setOnClickListener(new View.OnClickListener() {
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

        fri_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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

        fri_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
                startActivity(intent);
            }
        });

        sat_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        sat_bandpulls4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        sat_widepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Widepushup.class);
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














        complete_workout_monday4.setOnCheckedChangeListener(this);
        complete_workout_tuesday4.setOnCheckedChangeListener(this);
        complete_workout_wednesday4.setOnCheckedChangeListener(this);
        complete_workout_friday4.setOnCheckedChangeListener(this);
        complete_workout_saturday4.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg1wk5_monday:

                break;


            case R.id.checkBox_beg1wk5_Tuesday:

                break;


            case R.id.checkBox_beg1wk5_wednesday:

                break;


            case R.id.checkBox_beg1wk5_friday:

                break;

            case R.id.checkBox_beg1wk5_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS4, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY4, complete_workout_monday4.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY4, complete_workout_tuesday4.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY4, complete_workout_wednesday4.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY4, complete_workout_friday4.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY4, complete_workout_saturday4.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS4, Context.MODE_PRIVATE);

        checkboxSaveMonday4 = sharedPreferences.getBoolean(CHECKBOX_MONDAY4, false);
        checkboxSaveTuesday4 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY4, false);
        checkboxSaveWednesday4 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY4, false);
        checkboxSaveFriday4 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY4, false);
        checkboxSaveSaturday4 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY4, false);

    }

    public void updateViews1() {
        complete_workout_monday4.setChecked(checkboxSaveMonday4);
        complete_workout_tuesday4.setChecked(checkboxSaveTuesday4);
        complete_workout_wednesday4.setChecked(checkboxSaveWednesday4);
        complete_workout_friday4.setChecked(checkboxSaveFriday4);
        complete_workout_saturday4.setChecked(checkboxSaveSaturday4);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float4", rating);
        editor_rating.putInt("numStars4", numStars);
        editor_rating.apply();

    }
}

