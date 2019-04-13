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

public class ExercisesProgramsFragment extends Fragment {
    View view;
    private ArrayList<ExercisesCardViewItem> exerciseList = new ArrayList<>();
    private RecyclerView mRecyclerView_exercise;
    private RecyclerView.Adapter mAdapter_exercise;
    private RecyclerView.LayoutManager mLayoutManager_exercise;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter_exercise = new ExercisesAdapter(exerciseList);
        mLayoutManager_exercise = new LinearLayoutManager(getActivity());
        getFitnessCards();
    }

    //Coding is used to connect the exercises fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_all_exercises, container, false);
        mRecyclerView_exercise = view.findViewById(R.id.recyclerView_exercises);
        mRecyclerView_exercise.setAdapter(mAdapter_exercise);
        mRecyclerView_exercise.setLayoutManager(mLayoutManager_exercise);
        return view;
    }


    public void getFitnessCards() {
        exerciseList.add(new ExercisesCardViewItem(R.drawable.pullups_exercises, "PULL UPS", "Bar and Ring variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.ring_dips_new_exercises, "DIPS", "Bar and Ring variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.pushups_exercises, "PUSH UPS", "Floor, Bar and Ring variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.core_exercises, "CORE", "Floor, Bar and Ring variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.squats_new_exercise, "LEGS", "Bodyweight and Weighted variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.muscleup_main, "MUSCLE UPS", "Bar and Ring variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.flag_new_exercise, "HUMAN FLAG", "Different variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.levers_exercise, "LEVERS", "Front and Back variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.handstands_exercises, "HANDSTANDS", "Different variations", "Explore"));
        exerciseList.add(new ExercisesCardViewItem(R.drawable.planche_exercises, "PLANCHE/MALTESE", "Straddle and Full variations", "Explore"));
    }
}


