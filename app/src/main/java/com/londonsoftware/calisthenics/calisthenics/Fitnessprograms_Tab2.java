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


public class Fitnessprograms_Tab2 extends Fragment {
    CircleImageView int_one;
    CircleImageView int_two;
    CircleImageView int_three;
    CircleImageView int_four;
    ImageView int_trophy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fitnessprograms_tab2,container,false);

        int_one = view.findViewById(R.id.imageView11_upcoming_vegpro222);
        int_two = view.findViewById(R.id.imageView11_upcoming_vegpro22992);
        int_three = view.findViewById(R.id.imageView11_upcoming_vegpro229192);
        int_four = view.findViewById(R.id.imageView11_upcoming_vegpro);
        int_trophy = view.findViewById(R.id.imageView11_videos_tea);

        int_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntLevel1.class);
                startActivity(intent);
            }
        });

        int_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntLevel2.class);
                startActivity(intent);
            }
        });

        int_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntLevel3.class);
                startActivity(intent);
            }
        });

        int_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntLevel4.class);
                startActivity(intent);
            }
        });

        int_trophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), IntLevel5.class);
                startActivity(intent);
            }
        });

        return view;
    }






















}


