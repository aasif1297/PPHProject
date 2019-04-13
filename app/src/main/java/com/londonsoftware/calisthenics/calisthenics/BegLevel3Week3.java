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

public class BegLevel3Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level3_Week3";

    private static final String SHARED_PREFS33 = "sharedPrefs33";

    private CheckBox complete_workout_monday33;
    private CheckBox complete_workout_tuesday33;
    private CheckBox complete_workout_wednesday33;
    private CheckBox complete_workout_friday33;
    private CheckBox complete_workout_saturday33;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY33 = "checkboxMonday33";
    private static final String CHECKBOX_TUESDAY33 = "checkboxTuesday33";
    private static final String CHECKBOX_WEDNESDAY33 = "checkboxWednesday33";
    private static final String CHECKBOX_FRIDAY33 = "checkboxFriday33";
    private static final String CHECKBOX_SATURDAY33 = "checkboxSaturday33";



    private boolean checkboxSaveMonday33;
    private boolean checkboxSaveTuesday33;
    private boolean checkboxSaveWednesday33;
    private boolean checkboxSaveFriday33;
    private boolean checkboxSaveSaturday33;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level3_week3,container,false);


        complete_workout_monday33 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk3_monday);
        complete_workout_tuesday33 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk3_Tuesday);
        complete_workout_wednesday33 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk3_wednesday);
        complete_workout_friday33 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk3_friday);
        complete_workout_saturday33 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk3_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b3w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something33", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float33", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_diamonds= view.findViewById(R.id.diamond_pushupsicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);

        ImageButton wed_pushups = view.findViewById(R.id.pushupicon);
        ImageButton wed_chinups = view.findViewById(R.id.chinups);
        ImageButton wed_iso = view.findViewById(R.id.isoicon2);
        ImageButton wed_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton wed_barkneeraises= view.findViewById(R.id.barknee);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_sideplank= view.findViewById(R.id.sideplank);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon2);
        ImageButton fri_pullups = view.findViewById(R.id.pullups2);
        ImageButton fri_chinups = view.findViewById(R.id.chinups2);
        ImageButton fri_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton fri_dips= view.findViewById(R.id.dips2);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton fri_jumpinglunges= view.findViewById(R.id.jumpinglungesicon);
        ImageButton fri_oneleg_glute = view.findViewById(R.id.oneleg_glute);
        ImageButton fri_onelegcalf= view.findViewById(R.id.onelegcalfraise);

        ImageButton sat_barlegraises = view.findViewById(R.id.bar_legraises2);
        ImageButton sat_situps = view.findViewById(R.id.situpsicon);
        ImageButton sat_plank = view.findViewById(R.id.plankicon2);
        ImageButton sat_hollowhold = view.findViewById(R.id.hollowhold);

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

        mon_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        tues_bulgarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bulgarian.class);
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

        wed_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
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

        wed_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        wed_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
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

        fri_oneleg_glute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
                startActivity(intent);
            }
        });

        fri_onelegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        fri_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        sat_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
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



        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });



        complete_workout_monday33.setOnCheckedChangeListener(this);
        complete_workout_tuesday33.setOnCheckedChangeListener(this);
        complete_workout_wednesday33.setOnCheckedChangeListener(this);
        complete_workout_friday33.setOnCheckedChangeListener(this);
        complete_workout_saturday33.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg3wk3_monday:

                break;


            case R.id.checkBox_beg3wk3_Tuesday:

                break;


            case R.id.checkBox_beg3wk3_wednesday:

                break;


            case R.id.checkBox_beg3wk3_friday:

                break;

            case R.id.checkBox_beg3wk3_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS33, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY33, complete_workout_monday33.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY33, complete_workout_tuesday33.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY33, complete_workout_wednesday33.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY33, complete_workout_friday33.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY33, complete_workout_saturday33.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS33, Context.MODE_PRIVATE);

        checkboxSaveMonday33 = sharedPreferences.getBoolean(CHECKBOX_MONDAY33, false);
        checkboxSaveTuesday33 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY33, false);
        checkboxSaveWednesday33 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY33, false);
        checkboxSaveFriday33 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY33, false);
        checkboxSaveSaturday33 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY33, false);

    }

    public void updateViews1() {
        complete_workout_monday33.setChecked(checkboxSaveMonday33);
        complete_workout_tuesday33.setChecked(checkboxSaveTuesday33);
        complete_workout_wednesday33.setChecked(checkboxSaveWednesday33);
        complete_workout_friday33.setChecked(checkboxSaveFriday33);
        complete_workout_saturday33.setChecked(checkboxSaveSaturday33);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float33", rating);
        editor_rating.putInt("numStars33", numStars);
        editor_rating.apply();

    }
}

