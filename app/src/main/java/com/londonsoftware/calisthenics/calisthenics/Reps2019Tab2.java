package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Reps2019Tab2 extends Fragment {

    /*
    YouTubePlayer.OnInitializedListener onInitializedListener;
    Button button;*/



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.reps2019_tab2,container,false);

        /*
        button = view.findViewById(R.id.button_play_reps2019tabs2);


        final YouTubePlayerSupportFragment youTubePlayerFragment = new YouTubePlayerSupportFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.reps2019tabs2_youtubePlay, youTubePlayerFragment);
        fragmentTransaction.commit();

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("NHj7VHwFBr8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerFragment.initialize(YoutubeConfig.getApiKey(), onInitializedListener);
            }
        });*/


        return view;
    }






















}


