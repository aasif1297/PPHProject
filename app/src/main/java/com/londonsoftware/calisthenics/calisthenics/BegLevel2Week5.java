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

public class BegLevel2Week5 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level2_Week5";

    private static final String SHARED_PREFS9 = "sharedPrefs9";


    private CheckBox complete_workout_monday9;
    private CheckBox complete_workout_tuesday9;
    private CheckBox complete_workout_wednesday9;
    private CheckBox complete_workout_friday9;
    private CheckBox complete_workout_saturday9;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY9 = "checkboxMonday9";
    private static final String CHECKBOX_TUESDAY9 = "checkboxTuesday9";
    private static final String CHECKBOX_WEDNESDAY9 = "checkboxWednesday9";
    private static final String CHECKBOX_FRIDAY9 = "checkboxFriday9";
    private static final String CHECKBOX_SATURDAY9 = "checkboxSaturday9";



    private boolean checkboxSaveMonday9;
    private boolean checkboxSaveTuesday9;
    private boolean checkboxSaveWednesday9;
    private boolean checkboxSaveFriday9;
    private boolean checkboxSaveSaturday9;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level2_week5,container,false);


        complete_workout_monday9 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk5_monday);
        complete_workout_tuesday9 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk5_Tuesday);
        complete_workout_wednesday9 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk5_wednesday);
        complete_workout_friday9 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk5_friday);
        complete_workout_saturday9 = (CheckBox) view.findViewById(R.id.checkBox_beg2wk5_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b2w5);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something25", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float25", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_bandpulls = view.findViewById(R.id.bandpullsicon);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang= view.findViewById(R.id.deadhangicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_lunges = view.findViewById(R.id.lungesicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);
        ImageButton tues_glutebridges = view.findViewById(R.id.glutebridges);

        ImageButton wed_dips = view.findViewById(R.id.dips2);
        ImageButton wed_diamondpushups = view.findViewById(R.id.diamond_pushupsicon);
        ImageButton wed_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton wed_bandpulls = view.findViewById(R.id.bandpullsicon2);
        ImageButton wed_situps = view.findViewById(R.id.situpsicon);
        ImageButton wed_bandpulls2 = view.findViewById(R.id.bandpullicon3);
        ImageButton wed_floorlegraises = view.findViewById(R.id.floorraises);
        ImageButton wed_sideplank = view.findViewById(R.id.sideplank);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups);
        ImageButton fri_iso = view.findViewById(R.id.isoicon2);
        ImageButton fri_bandpulls = view.findViewById(R.id.bandpullsicon3);
        ImageButton fri_weightedsquats = view.findViewById(R.id.weightedsquats2);
        ImageButton fri_jumpingsquats = view.findViewById(R.id.jumpingsquatsicon);
        ImageButton fri_bulgarian = view.findViewById(R.id.bulgarianicon2);
        ImageButton fri_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton fri_calfraises = view.findViewById(R.id.calfraisesicon2);

        ImageButton sat_pushups = view.findViewById(R.id.pushupicon3);
        ImageButton sat_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton sat_bandedpulls = view.findViewById(R.id.bandpullsicon4);
        ImageButton sat_iso = view.findViewById(R.id.isoicon4);
        ImageButton sat_plank = view.findViewById(R.id.plankicon);

        ImageButton sun_foam = view.findViewById(R.id.foamicon2);


        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
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


        tues_glutebridges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GluteBridges.class);
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

        wed_bandpulls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        wed_diamondpushups.setOnClickListener(new View.OnClickListener() {
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

        wed_floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FloorLegRaises.class);
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

        wed_sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Sideplank.class);
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

        fri_bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        fri_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Calfraises.class);
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

        fri_jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Jumpingsquats.class);
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

        fri_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });

        fri_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sat_bandedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        sat_diamonds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        sat_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        sat_pushups.setOnClickListener(new View.OnClickListener() {
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



        complete_workout_monday9.setOnCheckedChangeListener(this);
        complete_workout_tuesday9.setOnCheckedChangeListener(this);
        complete_workout_wednesday9.setOnCheckedChangeListener(this);
        complete_workout_friday9.setOnCheckedChangeListener(this);
        complete_workout_saturday9.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg2wk5_monday:

                break;


            case R.id.checkBox_beg2wk5_Tuesday:

                break;


            case R.id.checkBox_beg2wk5_wednesday:

                break;


            case R.id.checkBox_beg2wk5_friday:

                break;

            case R.id.checkBox_beg2wk5_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS9, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY9, complete_workout_monday9.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY9, complete_workout_tuesday9.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY9, complete_workout_wednesday9.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY9, complete_workout_friday9.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY9, complete_workout_saturday9.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS9, Context.MODE_PRIVATE);

        checkboxSaveMonday9 = sharedPreferences.getBoolean(CHECKBOX_MONDAY9, false);
        checkboxSaveTuesday9 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY9, false);
        checkboxSaveWednesday9 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY9, false);
        checkboxSaveFriday9 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY9, false);
        checkboxSaveSaturday9 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY9, false);

    }

    public void updateViews1() {
        complete_workout_monday9.setChecked(checkboxSaveMonday9);
        complete_workout_tuesday9.setChecked(checkboxSaveTuesday9);
        complete_workout_wednesday9.setChecked(checkboxSaveWednesday9);
        complete_workout_friday9.setChecked(checkboxSaveFriday9);
        complete_workout_saturday9.setChecked(checkboxSaveSaturday9);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float25", rating);
        editor_rating.putInt("numStars25", numStars);
        editor_rating.apply();

    }

}

