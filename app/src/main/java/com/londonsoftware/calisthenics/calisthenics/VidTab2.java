package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class VidTab2 extends Fragment {
    TextView mTextview;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vid_tab2,container,false);

        mTextview = view.findViewById(R.id.textView_Monday_usrtab2);

        mTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        return view;
    }






















}


