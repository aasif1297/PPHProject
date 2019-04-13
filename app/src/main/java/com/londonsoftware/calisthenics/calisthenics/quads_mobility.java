package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class quads_mobility extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button button;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quads_mobility);

        button = findViewById(R.id.button_play_quadsmobility);
        youTubePlayerView = findViewById(R.id.quadsmobility_youtubePlay);

        //textView = findViewById(R.id.website);       for making textviews open websites
        //textView.setMovementMethod(LinkMovementMethod.getInstance());


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("nNTCWv54DiI");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(YoutubeConfig.getApiKey(), onInitializedListener);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void stretchinfo_quads(View view) {
        Intent stretch_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myrehabconnection.com/5-simple-quad-stretches/"));
        startActivity(stretch_intent);
    }

    public void anatomyinfo_quads(View view) {
        Intent anatomy_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yoganatomy.com/quadriceps-muscles/"));
        startActivity(anatomy_intent);
    }

    public void extravideos_quads(View view) {
        Intent videos_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZI3Nx1ycPWg"));
        startActivity(videos_intent);
    }


}

//public void browsermethod(View view) {
//Intent brow_intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
//startActivity(brow_intent);
//}

