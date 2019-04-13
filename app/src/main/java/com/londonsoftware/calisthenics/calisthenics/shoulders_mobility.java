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

public class shoulders_mobility extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button button;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulders_mobility);

        button = findViewById(R.id.button_play_shouldersmobility);
        youTubePlayerView = findViewById(R.id.shouldersmobility_youtubePlay);

        //textView = findViewById(R.id.website);       for making textviews open websites
        //textView.setMovementMethod(LinkMovementMethod.getInstance());


        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("kAQFQgS7P2A");
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

    public void stretchinfo_shoulders(View view) {
        Intent stretch_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thebarbellphysio.com/8-best-drills-unlock-shoulder-mobility/"));
        startActivity(stretch_intent);
    }

    public void anatomyinfo_shoulders(View view) {
        Intent anatomy_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.webmd.com/pain-management/picture-of-the-shoulder#1"));
        startActivity(anatomy_intent);
    }

    public void extravideos_shoulders(View view) {
        Intent videos_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZFF0TdJcQ28"));
        startActivity(videos_intent);
    }


}

//public void browsermethod(View view) {
//Intent brow_intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
//startActivity(brow_intent);
//}

