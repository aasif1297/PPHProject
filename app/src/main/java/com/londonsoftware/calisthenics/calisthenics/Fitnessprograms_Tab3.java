package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;


public class Fitnessprograms_Tab3 extends Fragment {
    CircleImageView adv_one;
    CircleImageView adv_two;
    CircleImageView adv_three;
    CircleImageView adv_four;
    ImageView adv_trophy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fitnessprograms_tab3,container,false);



        adv_one = view.findViewById(R.id.imageView11_upcoming_vegpro229192);
        adv_two = view.findViewById(R.id.imageView11_upcoming_vegpro229);
        adv_three = view.findViewById(R.id.imageView11_upcoming_vegpro227);
        adv_four = view.findViewById(R.id.imageView11_upcoming_vegpro27);
        adv_trophy = view.findViewById(R.id.imageView11_videos_tea);



        adv_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel1.class);
                startActivity(intent);
            }
        });


        adv_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel2.class);
                startActivity(intent);
            }
        });


        adv_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel3.class);
                startActivity(intent);
            }
        });


        adv_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel4.class);
                startActivity(intent);
            }
        });


        adv_trophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel5.class);
                startActivity(intent);
            }
        });





        return view;
    }






















}


