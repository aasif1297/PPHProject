package com.londonsoftware.calisthenics.calisthenics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FitnessProgramsFragment extends Fragment {
    View view;
    private ArrayList<ProgramCardViewItem> programList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ProgramAdapter(programList);
        mLayoutManager = new LinearLayoutManager(getActivity());
        getFitnessCards();
    }

    //Coding is used to connect the fitnessprogram fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fitnessprograms, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
        return view;
    }


    public void getFitnessCards() {
            programList.add(new ProgramCardViewItem(R.drawable.warningtriangle, "IMPORTANT INFO", " Workout Essentials and Disclaimer", "", "READ"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 1", " Fundamentals of Calisthenics", " Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 2", " Bodyweight Pull Up", " Calf Raises and Glute Bridges", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 3", " Building Pull Up Endurance", " Bar Leg Raises and Hollow Holds", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 4", " Sets of 15 Pull Ups", " Straight Bar Dips", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "BEGINNER - LEVEL 5", " Weighted Pull Ups and Dips", " Lever Conditioning", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 1", " Banded Muscle Ups", " Russian and Transitional Dips", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 2", " Muscle Ups", " Dragon Flags and L-Sit Chin Ups", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 3", " Muscle Up Endurance", " 100kg Squats", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 4", " Ring Muscle Ups", " Wall Handstand Push Ups", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "INTERMEDIATE - LEVEL 5", " Weighted Muscle Ups", " 120kg Squats", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 1", " 50kg Pull Ups and 60kg Dips", " Levers, HSPU, GHR and Pistol Squats", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 2", " 10x 10kg Muscle Ups", " Lever Pull Ups", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 3", " 15kg Muscle Up Circuits", " 90 Degree Handstand Push Ups", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 4", " Straddle Planche"," 20kg Muscle Up Circuits", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "ADVANCED - LEVEL 5", " 30kg Muscle Up, Weighted Planche", " Maltese and One Arm Pull Ups", "Start"));

        }
    }


