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

public class IntLevel1Week1 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "INT1_Level1_Week1";

    private static final String SHARED_PREFS71 = "sharedPrefs71";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_wednesday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_sunday71;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_WEDNESDAY71 = "checkboxWednesday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SUNDAY71 = "checkboxSunday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveWednesday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSunday71;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.int_level1_week1,container,false);



        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk1_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk1_Tuesday);
        complete_workout_wednesday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk1_wednesday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_intwk1_friday);
        complete_workout_sunday71 = (CheckBox) view.findViewById(R.id.checkBox_int1wk1_sunday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_i1w1);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something71", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float71", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_bandedmuscleups = view.findViewById(R.id.banded_muscleup);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_pulls = view.findViewById(R.id.mon_pulls);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_diamonds = view.findViewById(R.id.mon_diamondspush);
        ImageButton mon_russianpushups = view.findViewById(R.id.mon_russianpush);
        ImageButton mon_fronttuck = view.findViewById(R.id.mon_fronttuck);
        ImageButton mon_backtuck = view.findViewById(R.id.mon_backtuck);


        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_asspistols = view.findViewById(R.id.ass_pistolsquat);
        ImageButton tues_onelegcalf = view.findViewById(R.id.onelegcalfraise);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);

        ImageButton wed_bandedmuscleups = view.findViewById(R.id.banded_muscleup2);
        ImageButton wed_sbd = view.findViewById(R.id.wed_sbd);
        ImageButton wed_weightedpulls = view.findViewById(R.id.wed_weightedpulls);
        ImageButton wed_russiandips = view.findViewById(R.id.russiandips);
        ImageButton wed_dips = view.findViewById(R.id.wed_dips);
        ImageButton wed_russianpushes = view.findViewById(R.id.wed_russianpushes);
        ImageButton wed_lsit = view.findViewById(R.id.lsit);
        ImageButton wed_toestobar = view.findViewById(R.id.toestobar);
        ImageButton wed_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton wed_barknee = view.findViewById(R.id.barknee);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_bandedmuscleups = view.findViewById(R.id.banded_muscleup3);
        ImageButton fri_sbd = view.findViewById(R.id.fri_sbd);
        ImageButton fri_pulls = view.findViewById(R.id.fri_pulls);
        ImageButton fri_iso = view.findViewById(R.id.fri_iso);
        ImageButton fri_russiandips = view.findViewById(R.id.fri_russiandips);
        ImageButton fri_raisedpike = view.findViewById(R.id.fri_raisedpike);
        ImageButton fri_lsit = view.findViewById(R.id.fri_lsit);
        ImageButton fri_toes2bar = view.findViewById(R.id.fri_toes2bar);
        ImageButton fri_barlegraises = view.findViewById(R.id.fri_barlegraises);
        ImageButton fri_fronttuck = view.findViewById(R.id.fri_fronttuck);

        ImageButton sat_foam = view.findViewById(R.id.foamicon2);

        ImageButton sun_weightedsquats = view.findViewById(R.id.sun_weightedsquats);
        ImageButton sun_assistedpistol = view.findViewById(R.id.sun_assistedpistol);
        ImageButton sun_lunges = view.findViewById(R.id.sun_lunges);
        ImageButton sun_weightedsquats2 = view.findViewById(R.id.sun_weightedsquats2);
        ImageButton sun_weightedsquats3 = view.findViewById(R.id.sun_weightedsquats3);


        mon_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_backtuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever_Kneetucks.class);
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

        mon_fronttuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
                startActivity(intent);
            }
        });

        mon_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        mon_russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        mon_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        tues_asspistols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Assisted_Pistolsquats.class);
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


        tues_onelegcalf.setOnClickListener(new View.OnClickListener() {
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


        wed_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
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

        wed_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        wed_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
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

        wed_russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Dips.class);
                startActivity(intent);
            }
        });

        wed_russianpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        wed_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });


        wed_toestobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Toestobar.class);
                startActivity(intent);
            }
        });

        wed_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
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



        fri_bandedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Muscleup.class);
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


        fri_fronttuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever_Kneetucks.class);
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


        fri_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        fri_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        fri_raisedpike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Raised_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        fri_russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Dips.class);
                startActivity(intent);
            }
        });


        fri_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });


        fri_toes2bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Toestobar.class);
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




        sun_assistedpistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Assisted_Pistolsquats.class);
                startActivity(intent);
            }
        });


        sun_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sun_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sun_weightedsquats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sun_weightedsquats3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });







        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_wednesday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_sunday71.setOnCheckedChangeListener(this);




        loadData();
        updateViews();
        return view;
    }





    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
        switch (buttonView.getId()) {


            case R.id.checkBox_int1wk1_monday:

                break;


            case R.id.checkBox_int1wk1_Tuesday:

                break;


            case R.id.checkBox_int1wk1_wednesday:

                break;



            case R.id.checkBox_intwk1_friday:

                break;

            case R.id.checkBox_int1wk1_sunday:

                break;
        }
    }


    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS71, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY71, complete_workout_wednesday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SUNDAY71, complete_workout_sunday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS71, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveWednesday71 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSunday71 = sharedPreferences.getBoolean(CHECKBOX_SUNDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_wednesday71.setChecked(checkboxSaveWednesday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_sunday71.setChecked(checkboxSaveSunday71);

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float71", rating);
        editor_rating.putInt("numStars71", numStars);
        editor_rating.apply();

    }

}
