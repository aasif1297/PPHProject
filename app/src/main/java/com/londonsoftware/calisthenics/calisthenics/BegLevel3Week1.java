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

public class BegLevel3Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level3_Week1";

    private static final String SHARED_PREFS11 = "sharedPrefs11";


    private CheckBox complete_workout_monday11;
    private CheckBox complete_workout_tuesday11;
    private CheckBox complete_workout_wednesday11;
    private CheckBox complete_workout_friday11;
    private CheckBox complete_workout_saturday11;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY11 = "checkboxMonday11";
    private static final String CHECKBOX_TUESDAY11 = "checkboxTuesday11";
    private static final String CHECKBOX_WEDNESDAY11 = "checkboxWednesday11";
    private static final String CHECKBOX_FRIDAY11 = "checkboxFriday11";
    private static final String CHECKBOX_SATURDAY11 = "checkboxSaturday11";



    private boolean checkboxSaveMonday11;
    private boolean checkboxSaveTuesday11;
    private boolean checkboxSaveWednesday11;
    private boolean checkboxSaveFriday11;
    private boolean checkboxSaveSaturday11;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level3_week1,container,false);


        complete_workout_monday11 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk1_monday);
        complete_workout_tuesday11 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk1_Tuesday);
        complete_workout_wednesday11 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk1_wednesday);
        complete_workout_friday11 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk1_friday);
        complete_workout_saturday11 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk1_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b3w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something31", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float31", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);




        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_deadhang= view.findViewById(R.id.deadhangicon);
        ImageButton mon_diamonds= view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_pullups2 = view.findViewById(R.id.pullups2);
        ImageButton mon_pullups3 = view.findViewById(R.id.pullups3);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_iso3 = view.findViewById(R.id.isoicon3);


        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton wed_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton wed_widepushups = view.findViewById(R.id.widepushupicon);
        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups);
        ImageButton fri_dips = view.findViewById(R.id.dips);
        ImageButton fri_chinups2 = view.findViewById(R.id.chinups2);
        ImageButton fri_dips2 = view.findViewById(R.id.dips2);
        ImageButton fri_chinups3 = view.findViewById(R.id.chinups3);
        ImageButton fri_dips3 = view.findViewById(R.id.dips3);
        ImageButton fri_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton fri_deadhang = view.findViewById(R.id.deadhangicon2);
        ImageButton fri_widepushups = view.findViewById(R.id.widepushupicon2);

        ImageButton sat_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton sat_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton sat_glutebridges = view.findViewById(R.id.glutebridges);
        ImageButton sat_calfraises = view.findViewById(R.id.calfraisesicon2);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);




        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_pullups3.setOnClickListener(new View.OnClickListener() {
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

        mon_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        mon_iso3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        mon_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        tues_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Squats.class);
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

        wed_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        wed_situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        wed_widepushups.setOnClickListener(new View.OnClickListener() {
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

        fri_chinups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        fri_chinups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        fri_chinups3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Chinup.class);
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

        fri_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        fri_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        fri_dips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        fri_dips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
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

        sat_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
                startActivity(intent);
            }
        });

        sat_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
                startActivity(intent);
            }
        });

        sat_glutebridges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GluteBridges.class);
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



        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });




        complete_workout_monday11.setOnCheckedChangeListener(this);
        complete_workout_tuesday11.setOnCheckedChangeListener(this);
        complete_workout_wednesday11.setOnCheckedChangeListener(this);
        complete_workout_friday11.setOnCheckedChangeListener(this);
        complete_workout_saturday11.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg3wk1_monday:

                break;


            case R.id.checkBox_beg3wk1_Tuesday:

                break;


            case R.id.checkBox_beg3wk1_wednesday:

                break;


            case R.id.checkBox_beg3wk1_friday:

                break;

            case R.id.checkBox_beg3wk1_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS11, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY11, complete_workout_monday11.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY11, complete_workout_tuesday11.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY11, complete_workout_wednesday11.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY11, complete_workout_friday11.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY11, complete_workout_saturday11.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS11, Context.MODE_PRIVATE);

        checkboxSaveMonday11 = sharedPreferences.getBoolean(CHECKBOX_MONDAY11, false);
        checkboxSaveTuesday11 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY11, false);
        checkboxSaveWednesday11 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY11, false);
        checkboxSaveFriday11 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY11, false);
        checkboxSaveSaturday11 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY11, false);

    }

    public void updateViews1() {
        complete_workout_monday11.setChecked(checkboxSaveMonday11);
        complete_workout_tuesday11.setChecked(checkboxSaveTuesday11);
        complete_workout_wednesday11.setChecked(checkboxSaveWednesday11);
        complete_workout_friday11.setChecked(checkboxSaveFriday11);
        complete_workout_saturday11.setChecked(checkboxSaveSaturday11);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float31", rating);
        editor_rating.putInt("numStars31", numStars);
        editor_rating.apply();

    }
}

