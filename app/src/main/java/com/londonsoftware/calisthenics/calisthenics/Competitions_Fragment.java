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
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class Competitions_Fragment extends Fragment {
    View view;
    Button repsbutton;
    Button repsnsets_button_stre;
    Button videos_button;
    ImageView mweblogo;
    ImageView mcalender;
    ImageView mvideos;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    //Coding is used to connect the fitnessprogram fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_competitions, container, false);

        repsbutton = view.findViewById(R.id.repsnsets_button);
        repsnsets_button_stre = view.findViewById(R.id.repsnsets_button_stre);
        mweblogo = view.findViewById(R.id.imageView11_weblogo);
        mcalender = view.findViewById(R.id.imageView11_upcoming);
        mvideos = view.findViewById(R.id.imageView11_videos);
        videos_button = view.findViewById(R.id.vide_button);





        videos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VidofMonthtabs.class);
                startActivity(intent);
            }
        });



        repsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_RepsnSets_homepage.class);
                startActivity(intent);
            }
        });


        repsnsets_button_stre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Streetworkout_homepage.class);
                startActivity(intent);
            }
        });


        mweblogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(getContext(), "Coming Soon!", Toast.LENGTH_SHORT, R.style.mytoast).show();
            }
        });

        mcalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(getContext(), "Coming Soon!", Toast.LENGTH_SHORT, R.style.mytoast).show();
            }
        });

        mvideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VidofMonthtabs.class);
                startActivity(intent);
            }
        });





        return view;
    }




    }


