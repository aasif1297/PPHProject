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


public class BegLevel4Week3 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level4_Week3";

    private static final String SHARED_PREFS88 = "sharedPrefs88";

    private CheckBox complete_workout_monday88;
    private CheckBox complete_workout_tuesday88;
    private CheckBox complete_workout_wednesday88;
    private CheckBox complete_workout_friday88;
    private CheckBox complete_workout_saturday88;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY88 = "checkboxMonday88";
    private static final String CHECKBOX_TUESDAY88 = "checkboxTuesday88";
    private static final String CHECKBOX_WEDNESDAY88 = "checkboxWednesday88";
    private static final String CHECKBOX_FRIDAY88 = "checkboxFriday88";
    private static final String CHECKBOX_SATURDAY88 = "checkboxSaturday88";



    private boolean checkboxSaveMonday88;
    private boolean checkboxSaveTuesday88;
    private boolean checkboxSaveWednesday88;
    private boolean checkboxSaveFriday88;
    private boolean checkboxSaveSaturday88;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level4_week3,container,false);


        complete_workout_monday88 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk3_monday);
        complete_workout_tuesday88 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk3_Tuesday);
        complete_workout_wednesday88 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk3_wednesday);
        complete_workout_friday88 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk3_friday);
        complete_workout_saturday88 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk3_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b4w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something43", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float43", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);



        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);
        ImageButton mon_iso2 = view.findViewById(R.id.isoicon2);
        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_russianpushups = view.findViewById(R.id.russianpushups);
        ImageButton mon_diamonds = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton mon_pikes = view.findViewById(R.id.pikepush);
        ImageButton mon_dips = view.findViewById(R.id.dips);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_onelegcalfraises = view.findViewById(R.id.onelegcalfraise);
        ImageButton tues_jumpinglunges = view.findViewById(R.id.jumpinglungesicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);

        ImageButton wed_pullups = view.findViewById(R.id.pullups2);
        ImageButton wed_pullups2 = view.findViewById(R.id.pullups3);
        ImageButton wed_pullups3 = view.findViewById(R.id.pullups4);
        ImageButton wed_pullups4 = view.findViewById(R.id.pullups5);
        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_russianpushups = view.findViewById(R.id.russianpushups3);
        ImageButton wed_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton wed_pushups = view.findViewById(R.id.pushupicon);
        ImageButton wed_dips = view.findViewById(R.id.dips2);
        ImageButton wed_romantwists = view.findViewById(R.id.romantwistsicon);
        ImageButton wed_plank = view.findViewById(R.id.plankicon);


        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups2);
        ImageButton fri_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton fri_barknee = view.findViewById(R.id.barknee);
        ImageButton fri_hollowhold = view.findViewById(R.id.hollowhold);
        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon);

        ImageButton sat_russianpushups = view.findViewById(R.id.russianpushups4);
        ImageButton sat_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton sat_dips = view.findViewById(R.id.dips3);
        ImageButton sat_widepushup = view.findViewById(R.id.widepushupicon);

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

        mon_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        mon_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        mon_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        mon_pikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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

        tues_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
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

        wed_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
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

        wed_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        wed_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_pullups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_pullups3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_pullups4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        wed_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
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



        thurs_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        fri_barknee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        fri_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
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

        fri_hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Hollowholds.class);
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

        sat_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        sat_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        sat_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
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



        sun_foam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });




















        complete_workout_monday88.setOnCheckedChangeListener(this);
        complete_workout_tuesday88.setOnCheckedChangeListener(this);
        complete_workout_wednesday88.setOnCheckedChangeListener(this);
        complete_workout_friday88.setOnCheckedChangeListener(this);
        complete_workout_saturday88.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg4wk3_monday:

                break;


            case R.id.checkBox_beg4wk3_Tuesday:

                break;


            case R.id.checkBox_beg4wk3_wednesday:

                break;


            case R.id.checkBox_beg4wk3_friday:

                break;

            case R.id.checkBox_beg4wk3_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS88, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY88, complete_workout_monday88.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY88, complete_workout_tuesday88.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY88, complete_workout_wednesday88.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY88, complete_workout_friday88.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY88, complete_workout_saturday88.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS88, Context.MODE_PRIVATE);

        checkboxSaveMonday88 = sharedPreferences.getBoolean(CHECKBOX_MONDAY88, false);
        checkboxSaveTuesday88 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY88, false);
        checkboxSaveWednesday88 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY88, false);
        checkboxSaveFriday88 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY88, false);
        checkboxSaveSaturday88 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY88, false);

    }

    public void updateViews1() {
        complete_workout_monday88.setChecked(checkboxSaveMonday88);
        complete_workout_tuesday88.setChecked(checkboxSaveTuesday88);
        complete_workout_wednesday88.setChecked(checkboxSaveWednesday88);
        complete_workout_friday88.setChecked(checkboxSaveFriday88);
        complete_workout_saturday88.setChecked(checkboxSaveSaturday88);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float43", rating);
        editor_rating.putInt("numStars43", numStars);
        editor_rating.apply();

    }
}

