package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class Youtube_Mobility extends Fragment {
    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //Coding is used to connect the exercises fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mobility, container, false);


        ImageButton bicepsmobility = view.findViewById(R.id.biceps_imagebutton);
        Button bicepsmobility_btn = view.findViewById(R.id.biceps_textview);

        ImageButton tricepsmobility = view.findViewById(R.id.triceps_imagebutton);
        Button tricepsmobility_btn = view.findViewById(R.id.triceps_textview);

        ImageButton pectoralsmobility = view.findViewById(R.id.chest_imagebutton);
        Button pectoralsmobility_btn = view.findViewById(R.id.chest_textview);

        ImageButton shouldermobility = view.findViewById(R.id.shoulders_imagebutton);
        Button shouldermobility_btn = view.findViewById(R.id.shoulders_textview);

        ImageButton scapulamobility = view.findViewById(R.id.scapula_imagebutton);
        Button scapulamobility_btn = view.findViewById(R.id.scapula_textview);

        ImageButton latmobility = view.findViewById(R.id.lats_imagebutton);
        Button latmobility_btn = view.findViewById(R.id.lats_textview);

        ImageButton neckmobility = view.findViewById(R.id.neck_imagebutton);
        Button neckmobility_btn = view.findViewById(R.id.neck_textview);

        ImageButton coremobility = view.findViewById(R.id.core_imagebutton);
        Button coremobility_btn = view.findViewById(R.id.core_textview);

        ImageButton quads = view.findViewById(R.id.quads_imagebutton);
        Button quads_btn = view.findViewById(R.id.quads_textview);

        ImageButton hams = view.findViewById(R.id.hamstrings_imagebutton);
        Button hams_btn = view.findViewById(R.id.hamstrings_textview);

        ImageButton calfs = view.findViewById(R.id.calves_imagebutton);
        Button calfs_btn = view.findViewById(R.id.calves_textview);

        ImageButton glutes = view.findViewById(R.id.glutes_imagebutton);
        Button glutes_btn = view.findViewById(R.id.glutes_textview);







        bicepsmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), biceps_mobility.class);
                startActivity(intent);
            }
        });

        bicepsmobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), biceps_mobility.class);
                startActivity(intent);
            }
        });

        tricepsmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), triceps_mobility.class);
                startActivity(intent);
            }
        });

        tricepsmobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), triceps_mobility.class);
                startActivity(intent);
            }
        });


        pectoralsmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), pectorals_mobility.class);
                startActivity(intent);
            }
        });

        pectoralsmobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), pectorals_mobility.class);
                startActivity(intent);
            }
        });

        shouldermobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), shoulders_mobility.class);
                startActivity(intent);
            }
        });

        shouldermobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), shoulders_mobility.class);
                startActivity(intent);
            }
        });

        scapulamobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), scapula_mobility.class);
                startActivity(intent);
            }
        });

        scapulamobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), scapula_mobility.class);
                startActivity(intent);
            }
        });

        latmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), lats_mobility.class);
                startActivity(intent);
            }
        });

        latmobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), lats_mobility.class);
                startActivity(intent);
            }
        });


        neckmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), neck_mobility.class);
                startActivity(intent);
            }
        });

        neckmobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), neck_mobility.class);
                startActivity(intent);
            }
        });

        coremobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abdominals_mobility.class);
                startActivity(intent);
            }
        });

        coremobility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), abdominals_mobility.class);
                startActivity(intent);
            }
        });

        quads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), quads_mobility.class);
                startActivity(intent);
            }
        });

        quads_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), quads_mobility.class);
                startActivity(intent);
            }
        });

        hams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), hamstrings_mobility.class);
                startActivity(intent);
            }
        });

        hams_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), hamstrings_mobility.class);
                startActivity(intent);
            }
        });

        calfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), calves_mobility.class);
                startActivity(intent);
            }
        });

        calfs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), calves_mobility.class);
                startActivity(intent);
            }
        });

        glutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), glutes_mobility.class);
                startActivity(intent);
            }
        });

        glutes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), glutes_mobility.class);
                startActivity(intent);
            }
        });


        return view;
    }



}
