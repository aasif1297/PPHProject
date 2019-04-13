package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.ExampleViewHolder> {

    public ArrayList<ExercisesCardViewItem> mExampleList_exercises;


    public ExercisesAdapter(ArrayList<ExercisesCardViewItem> exampleList_exercises) {

        mExampleList_exercises = exampleList_exercises;
    }


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView_exercises;
        public TextView mTextView1_exercises;
        public TextView mTextView2_exercises;
        public Button mButtonStart_exercises;


        public ExampleViewHolder(@NonNull final View itemView) {
            super(itemView);
            mImageView_exercises = itemView.findViewById(R.id.cardImageView_exercises);
            mTextView1_exercises = itemView.findViewById(R.id.titleCardTextView_exercises);
            mTextView2_exercises = itemView.findViewById(R.id.subtitle_exercises);
            mButtonStart_exercises = itemView.findViewById(R.id.cardViewButton_exercises);

            //This coding is setting the onClickListeners for the individual cardviews
            itemView.setOnClickListener(new View.OnClickListener() {

                //This is to set individual cards to individual activities. Add accordingly
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    if (getAdapterPosition() == 0) {
                        intent = new Intent(itemView.getContext(), Pullups_Exercise.class);
                    } else if (getAdapterPosition() == 1) {
                        intent = new Intent(itemView.getContext(), Dips_Exercise.class);
                    } else if (getAdapterPosition() == 2) {
                        intent = new Intent(itemView.getContext(), Pushups_Exercise.class);
                    } else if (getAdapterPosition() == 3) {
                        intent = new Intent(itemView.getContext(), Core_Exercise.class);
                    } else if (getAdapterPosition() == 4) {
                        intent = new Intent(itemView.getContext(), Legs_Exercise.class);
                    } else if (getAdapterPosition() == 5) {
                        intent = new Intent(itemView.getContext(), Muscleups_Exercise.class);
                    } else if (getAdapterPosition() == 6) {
                        intent = new Intent(itemView.getContext(), Humanflag_Exercise.class);
                    } else if (getAdapterPosition() == 7) {
                        intent = new Intent(itemView.getContext(), Levers_Exercise.class);
                    } else if (getAdapterPosition() == 8) {
                        intent = new Intent(itemView.getContext(), Handstands_Exercise.class);
                    } else if (getAdapterPosition() == 9) {
                        intent = new Intent(itemView.getContext(), Planche_Exercise.class);
                    } else
                        intent = new Intent(itemView.getContext(),Pullups_Exercise.class);
                    itemView.getContext().startActivity(intent);
                }
            });

            }
        }



    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercises_cardview_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }


    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, final int position) {

        //Setting the background colour for the textviews in the CardViews
        if(position==0){
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);

        } else if(position==1) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==2) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==3) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==4) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==5) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==6) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==7) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==8) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);


        } else if(position==9) {
            holder.mTextView1_exercises.setBackgroundResource(R.drawable.rounded_corner_cardview);
            holder.mTextView1_exercises.setTextSize((float) 15.0);
            holder.mTextView2_exercises.setTextSize((float) 11.0);
            holder.mButtonStart_exercises.setTextSize((float) 11.5);
        }



        ExercisesCardViewItem currentItem = mExampleList_exercises.get(position);
        holder.mImageView_exercises.setImageResource(currentItem.getImageResource());
        holder.mTextView1_exercises.setText(currentItem.getText1());
        holder.mTextView2_exercises.setText(currentItem.getText2());
        holder.mButtonStart_exercises.setText(currentItem.getText4());




    }




    @Override
    public int getItemCount() {
        return mExampleList_exercises.size();
    }
}
