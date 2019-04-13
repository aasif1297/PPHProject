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


public class BegLevel4Week5 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener {
    private static final String TAG = "BEG1_Level4_Week5";

    private static final String SHARED_PREFS12 = "sharedPrefs12";

    private CheckBox complete_workout_monday12;
    private CheckBox complete_workout_tuesday12;
    private CheckBox complete_workout_wednesday12;
    private CheckBox complete_workout_friday12;
    private CheckBox complete_workout_saturday12;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY12 = "checkboxMonday12";
    private static final String CHECKBOX_TUESDAY12 = "checkboxTuesday12";
    private static final String CHECKBOX_WEDNESDAY12 = "checkboxWednesday12";
    private static final String CHECKBOX_FRIDAY12 = "checkboxFriday12";
    private static final String CHECKBOX_SATURDAY12 = "checkboxSaturday12";



    private boolean checkboxSaveMonday12;
    private boolean checkboxSaveTuesday12;
    private boolean checkboxSaveWednesday12;
    private boolean checkboxSaveFriday12;
    private boolean checkboxSaveSaturday12;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.beg_level4_week5,container,false);


        complete_workout_monday12 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk5_monday);
        complete_workout_tuesday12 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk5_Tuesday);
        complete_workout_wednesday12 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk5_wednesday);
        complete_workout_friday12 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk5_friday);
        complete_workout_saturday12 = (CheckBox) view.findViewById(R.id.checkBox_beg4wk5_saturday);

        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_b4w5);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something45", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float45", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_highpulls = view.findViewById(R.id.highpulls);
        ImageButton mon_weightedpushups = view.findViewById(R.id.weighted_pushups);
        ImageButton mon_pullups = view.findViewById(R.id.pullups);
        ImageButton mon_highpulls2 = view.findViewById(R.id.highpulls2);
        ImageButton mon_chinups = view.findViewById(R.id.chinups);
        ImageButton mon_iso = view.findViewById(R.id.isoicon);
        ImageButton mon_dips = view.findViewById(R.id.dips);
        ImageButton mon_deadhang = view.findViewById(R.id.deadhangicon);
        ImageButton mon_iso22 = view.findViewById(R.id.isoicon22);


        ImageButton tues_weightedsquats = view.findViewById(R.id.weightedsquats);
        ImageButton tues_bulgarian = view.findViewById(R.id.bulgarianicon);
        ImageButton tues_wallsit = view.findViewById(R.id.wallsiticon);

        ImageButton wed_pullups = view.findViewById(R.id.pullups2);
        ImageButton wed_iso = view.findViewById(R.id.isoicon2);
        ImageButton wed_lsit = view.findViewById(R.id.lsit);
        ImageButton wed_pikepush = view.findViewById(R.id.pikepush);
        ImageButton wed_barlegraises = view.findViewById(R.id.bar_legraises);
        ImageButton wed_barknee = view.findViewById(R.id.barknee);
        ImageButton wed_pullups222 = view.findViewById(R.id.pullups222);
        ImageButton wed_bandpulls222 = view.findViewById(R.id.bandpulls222);

        ImageButton thurs_foam = view.findViewById(R.id.foamicon);

        ImageButton fri_squats = view.findViewById(R.id.squatsicon);
        ImageButton fri_lunges = view.findViewById(R.id.lungesicon);
        ImageButton fri_onelegcalf = view.findViewById(R.id.onelegcalfraise);
        ImageButton fri_onelegglute = view.findViewById(R.id.oneleg_glute);
        ImageButton fri_chinups = view.findViewById(R.id.chinups2);
        ImageButton fri_iso = view.findViewById(R.id.isoicon3);

        ImageButton sat_dips = view.findViewById(R.id.dips2);
        ImageButton sat_sbd = view.findViewById(R.id.sbd);
        ImageButton sat_russianpushes = view.findViewById(R.id.russianpushups);


        ImageButton sun_foam = view.findViewById(R.id.foamicon2);
















        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_weightedpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Pushups.class);
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

        mon_deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Deadhang.class);
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

        mon_highpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Highpull.class);
                startActivity(intent);
            }
        });

        mon_highpulls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Highpull.class);
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
        mon_iso22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });
        mon_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        tues_wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wallsit.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
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

        wed_barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bar_Legraises.class);
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

        wed_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        wed_pikepush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pike_Pushups.class);
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

        wed_pullups222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_bandpulls222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Bandpulls.class);
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

        fri_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
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

        fri_onelegcalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        fri_onelegglute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_Glutebridges.class);
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

        sat_russianpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });


        sat_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
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






        complete_workout_monday12.setOnCheckedChangeListener(this);
        complete_workout_tuesday12.setOnCheckedChangeListener(this);
        complete_workout_wednesday12.setOnCheckedChangeListener(this);
        complete_workout_friday12.setOnCheckedChangeListener(this);
        complete_workout_saturday12.setOnCheckedChangeListener(this);




        loadData1();
        updateViews1();
        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData1();
        switch (buttonView.getId()) {


            case R.id.checkBox_beg4wk5_monday:

                break;


            case R.id.checkBox_beg4wk5_Tuesday:

                break;


            case R.id.checkBox_beg4wk5_wednesday:

                break;


            case R.id.checkBox_beg4wk5_friday:

                break;

            case R.id.checkBox_beg4wk5_saturday:

                break;
        }
    }





    public void saveData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS12, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY12, complete_workout_monday12.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY12, complete_workout_tuesday12.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY12, complete_workout_wednesday12.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY12, complete_workout_friday12.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY12, complete_workout_saturday12.isChecked());


        editor.apply();

    }


    public void loadData1(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS12, Context.MODE_PRIVATE);

        checkboxSaveMonday12 = sharedPreferences.getBoolean(CHECKBOX_MONDAY12, false);
        checkboxSaveTuesday12 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY12, false);
        checkboxSaveWednesday12 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY12, false);
        checkboxSaveFriday12 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY12, false);
        checkboxSaveSaturday12 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY12, false);

    }

    public void updateViews1() {
        complete_workout_monday12.setChecked(checkboxSaveMonday12);
        complete_workout_tuesday12.setChecked(checkboxSaveTuesday12);
        complete_workout_wednesday12.setChecked(checkboxSaveWednesday12);
        complete_workout_friday12.setChecked(checkboxSaveFriday12);
        complete_workout_saturday12.setChecked(checkboxSaveSaturday12);
    }
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float45", rating);
        editor_rating.putInt("numStars45", numStars);
        editor_rating.apply();

    }
}

