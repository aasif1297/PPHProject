package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HealthNutrition_New_fragment extends Fragment {
    View view;
    Button herbpowders;
    ImageView bmi;
    ImageView vegprot;
    ImageView herbpic;
    ImageView herbteapic;
    ImageView diary;





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    //Coding is used to connect the fitnessprogram fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_healthnutrition_new, container, false);



        herbpowders = view.findViewById(R.id.repsnsets_button_health);
        bmi = view.findViewById(R.id.imageView11_weblogo_bmi);
        vegprot = view.findViewById(R.id.imageView11_upcoming_vegpro);
        herbpic = view.findViewById(R.id.imageView11_pic);
        herbteapic = view.findViewById(R.id.imageView11_videos_tea);
        diary = view.findViewById(R.id.imageView11_videos_tea4);


        diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Herbal_Diary_Prelogin.class);
                startActivity(intent);
            }
        });





        herbpowders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Herbal_Powders.class);
                startActivity(intent);
            }
        });



        herbpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Herbal_Powders.class);
                startActivity(intent);
            }
        });


        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BMI_Calculator.class);
                startActivity(intent);
            }
        });



        vegprot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Vegan_Protein_Sources.class);
                startActivity(intent);
            }
        });




        herbteapic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Herbal_Teas.class);
                startActivity(intent);
            }
        });




        return view;
    }


}


