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


public class Fitnessprograms_Tab1 extends Fragment {
    CircleImageView beg_one;
    CircleImageView beg_two;
    CircleImageView beg_three;
    CircleImageView beg_four;
    ImageView beg_trophy;
    ImageView equipreq_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fitnessprograms_tab1,container,false);

        beg_one = view.findViewById(R.id.imageView11_upcoming_vegpro22);
        beg_two = view.findViewById(R.id.imageView11_upcoming_vegpro223);
        beg_three = view.findViewById(R.id.imageView11_upcoming_vegpro2298);
        beg_four = view.findViewById(R.id.imageView11_upcoming_vegpro);
        beg_trophy = view.findViewById(R.id.imageView11_videos_tea);
        equipreq_btn = view.findViewById(R.id.equipreq_btn);

        equipreq_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Fitnessprograms_Disclaimer.class);
                startActivity(intent);            }
        });



        beg_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel1.class);
                startActivity(intent);
            }
        });

        beg_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel2.class);
                startActivity(intent);
            }
        });

        beg_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel3.class);
                startActivity(intent);
            }
        });

        beg_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel4.class);
                startActivity(intent);
            }
        });

        beg_trophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel5.class);
                startActivity(intent);
            }
        });


        return view;
    }






















}


