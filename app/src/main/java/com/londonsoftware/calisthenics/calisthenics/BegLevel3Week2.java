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

public class BegLevel3Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "BEG1_Level3_Week2";

    private static final String SHARED_PREFS22 = "sharedPrefs22";

    private CheckBox complete_workout_monday22;
    private CheckBox complete_workout_tuesday22;
    private CheckBox complete_workout_wednesday22;
    private CheckBox complete_workout_friday22;
    private CheckBox complete_workout_saturday22;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY22 = "checkboxMonday22";
    private static final String CHECKBOX_TUESDAY22 = "checkboxTuesday22";
    private static final String CHECKBOX_WEDNESDAY22 = "checkboxWednesday22";
    private static final String CHECKBOX_FRIDAY22 = "checkboxFriday22";
    private static final String CHECKBOX_SATURDAY22 = "checkboxSaturday22";



    private boolean checkboxSaveMonday22;
    private boolean checkboxSaveTuesday22;
    private boolean checkboxSaveWednesday22;
    private boolean checkboxSaveFriday22;
    private boolean checkboxSaveSaturday22;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level3_week2,container,false);


        complete_workout_monday22 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk2_monday);
        complete_workout_tuesday22 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk2_Tuesday);
        complete_workout_wednesday22 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk2_wednesday);
        complete_workout_friday22 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk2_friday);
        complete_workout_saturday22 = (CheckBox) view.findViewById(R.id.checkBox_beg3wk2_saturday);


        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b3w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something32", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float32", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_pullups2 = view.findViewById(R.id.pullups2);
        ImageButton mon_iso20 = view.findViewById(R.id.isoicon20);
        ImageButton mon_dips20 = view.findViewById(R.id.dips20);
        ImageButton mon_pushups = view.findViewById(R.id.pushupicon);
        ImageButton mon_deadhang= view.findViewById(R.id.deadhangicon);
        ImageButton mon_diamonds= view.findViewById(R.id.diamond_pushupsicon);

        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_squats = view.findViewById(R.id.squatsicon);
        ImageButton tues_calfraises = view.findViewById(R.id.calfraisesicon);

        ImageButton wed_dips = view.findViewById(R.id.dips2);
        ImageButton wed_diamonds = view.findViewById(R.id.diamond_pushups2);
        ImageButton wed_widepushups = view.findViewById(R.id.widepushupicon);
        ImageButton wed_situps = view.findViewById(R.id.situpsicon2);
        ImageButton wed_floorlegraises= view.findViewById(R.id.floorraises);
        ImageButton wed_romantwists= view.findViewById(R.id.romantwistsicon);
        ImageButton wed_plank= view.findViewById(R.id.plankicon);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_chinups = view.findViewById(R.id.chinups);
        ImageButton fri_dips = view.findViewById(R.id.dips3);
        ImageButton fri_pushups = view.findViewById(R.id.pushupicon2);
        ImageButton fri_iso = view.findViewById(R.id.isoicon2);

        ImageButton sat_weightedlunges = view.findViewById(R.id.weightedlunges);
        ImageButton sat_lunges = view.findViewById(R.id.lungesicon);
        ImageButton sat_onelegglute = view.findViewById(R.id.oneleg_glute);
        ImageButton sat_glutebridges = view.findViewById(R.id.glutebridges);
        ImageButton sat_jumpingsquats= view.findViewById(R.id.jumpingsquatsicon);
        ImageButton sat_calfraises= view.findViewById(R.id.calfraisesicon2);

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

        mon_pullups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_dips20.setOnClickListener(new View.OnClickListener() {
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

        mon_iso20.setOnClickListener(new View.OnClickListener() {
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

        wed_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
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

        fri_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
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

        fri_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_PushUp.class);
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

        sat_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sat_onelegglute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
                startActivity(intent);
            }
        });

        sat_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
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






        complete_workout_monday22.setOnCheckedChangeListener(this);
        complete_workout_tuesday22.setOnCheckedChangeListener(this);
        complete_workout_wednesday22.setOnCheckedChangeListener(this);
        complete_workout_friday22.setOnCheckedChangeListener(this);
        complete_workout_saturday22.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg3wk2_monday:

                break;


            case R.id.checkBox_beg3wk2_Tuesday:

                break;


            case R.id.checkBox_beg3wk2_wednesday:

                break;


            case R.id.checkBox_beg3wk2_friday:

                break;

            case R.id.checkBox_beg3wk2_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS22, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY22, complete_workout_monday22.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY22, complete_workout_tuesday22.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY22, complete_workout_wednesday22.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY22, complete_workout_friday22.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY22, complete_workout_saturday22.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS22, Context.MODE_PRIVATE);

        checkboxSaveMonday22 = sharedPreferences.getBoolean(CHECKBOX_MONDAY22, false);
        checkboxSaveTuesday22 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY22, false);
        checkboxSaveWednesday22 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY22, false);
        checkboxSaveFriday22 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY22, false);
        checkboxSaveSaturday22 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY22, false);

    }

    public void updateViews1() {
        complete_workout_monday22.setChecked(checkboxSaveMonday22);
        complete_workout_tuesday22.setChecked(checkboxSaveTuesday22);
        complete_workout_wednesday22.setChecked(checkboxSaveWednesday22);
        complete_workout_friday22.setChecked(checkboxSaveFriday22);
        complete_workout_saturday22.setChecked(checkboxSaveSaturday22);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float32", rating);
        editor_rating.putInt("numStars32", numStars);
        editor_rating.apply();

    }
}

