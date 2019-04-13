package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ExampleViewHolder> {

    public ArrayList<ProgramCardViewItem> mExampleList;


    public ProgramAdapter(ArrayList<ProgramCardViewItem> exampleList) {

        mExampleList = exampleList;
    }


    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public Button mButtonStart;


        public ExampleViewHolder(@NonNull final View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.cardImageView);
            mTextView1 = itemView.findViewById(R.id.titleCardTextView);
            mTextView2 = itemView.findViewById(R.id.subTitleTextView);
            mTextView3 = itemView.findViewById(R.id.subTitleTextView2);
            mButtonStart = itemView.findViewById(R.id.cardViewButton);

            //This coding is setting the onClickListeners for the individual cardviews
            itemView.setOnClickListener(new View.OnClickListener() {

                //This is to set individual cards to individual activities. Add accordingly
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    if (getAdapterPosition() == 0) {
                        intent = new Intent(itemView.getContext(), Fitnessprograms_Disclaimer.class);
                    } else if (getAdapterPosition() == 1) {
                        intent = new Intent(itemView.getContext(), BegLevel1.class);
                    } else if (getAdapterPosition() == 2) {
                        intent = new Intent(itemView.getContext(), BegLevel2.class);
                    } else if (getAdapterPosition() == 3) {
                        intent = new Intent(itemView.getContext(), BegLevel3.class);
                    } else if (getAdapterPosition() == 4) {
                        intent = new Intent(itemView.getContext(), BegLevel4.class);
                    } else if (getAdapterPosition() == 5) {
                        intent = new Intent(itemView.getContext(), BegLevel5.class);
                    } else if (getAdapterPosition() == 6) {
                        intent = new Intent(itemView.getContext(), IntLevel1.class);
                    } else if (getAdapterPosition() == 7) {
                        intent = new Intent(itemView.getContext(), IntLevel2.class);
                    } else if (getAdapterPosition() == 8) {
                        intent = new Intent(itemView.getContext(), IntLevel3.class);
                    } else if (getAdapterPosition() == 9) {
                        intent = new Intent(itemView.getContext(), IntLevel4.class);
                    } else if (getAdapterPosition() == 10) {
                        intent = new Intent(itemView.getContext(), IntLevel5.class);
                    } else if (getAdapterPosition() == 11) {
                        intent = new Intent(itemView.getContext(), AdvLevel1.class);
                    } else if (getAdapterPosition() == 12) {
                        intent = new Intent(itemView.getContext(), AdvLevel2.class);
                    } else if (getAdapterPosition() == 13) {
                        intent = new Intent(itemView.getContext(), AdvLevel3.class);
                    } else if (getAdapterPosition() == 14) {
                        intent = new Intent(itemView.getContext(), AdvLevel4.class);
                    } else if (getAdapterPosition() == 15) {
                        intent = new Intent(itemView.getContext(), AdvLevel5.class);
                    } else
                        intent = new Intent(itemView.getContext(),BegLevel1.class);
                    itemView.getContext().startActivity(intent);
                }
            });

            }
        }



    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.program_cardview_item, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }


    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, final int position) {

        //Setting the background colour for the textviews in the CardViews
        if(position==0){
            holder.mTextView1.setTextColor(Color.parseColor("#ff0000"));
            holder.mTextView1.setBackgroundColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setTextSize((float) 17.4);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design_disclaimer);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==1) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_beginnerfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==2) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_beginnerfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==3) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_beginnerfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==4) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_beginnerfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==5) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_beginnerfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==6) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_intermediatefit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==7) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_intermediatefit_cardview);
            holder.mTextView1.setTextSize((float) 13.8);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==8) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_intermediatefit_cardview);
            holder.mTextView1.setTextSize((float) 13.8);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==9) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_intermediatefit_cardview);
            holder.mTextView1.setTextSize((float) 13.8);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==10) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_intermediatefit_cardview);
            holder.mTextView1.setTextSize((float) 13.8);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==11) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_advancedfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==12) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_advancedfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==13) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_advancedfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==14) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_advancedfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        } else if(position==15) {
            holder.mTextView1.setTextColor(Color.parseColor("#ffffff"));
            holder.mTextView1.setBackgroundResource(R.drawable.rounded_corner_advancedfit_cardview);
            holder.mTextView1.setTextSize((float) 14.0);
            holder.mButtonStart.setBackgroundResource(R.drawable.button_design);
            holder.mButtonStart.setTextSize((float) 13.0);

        }



        ProgramCardViewItem currentItem = mExampleList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mTextView3.setText(currentItem.getText3());
        holder.mButtonStart.setText(currentItem.getText4());




    }




    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
