package com.londonsoftware.calisthenics.calisthenics;

public class ExercisesCardViewItem {
    public int mImageResource_exercises;
    public String mText1_exercises;
    public String mText2_exercises;
    public String mButton_exercises;

    public ExercisesCardViewItem(int imageResource, String text1, String text2, String text4) {
        mImageResource_exercises = imageResource;
        mText1_exercises = text1;
        mText2_exercises = text2;
        mButton_exercises = text4;
    }

    public int getImageResource() {
        return mImageResource_exercises;
    }

    public String getText1() {
        return mText1_exercises;
    }

    public String getText2 () {
        return mText2_exercises;
    }

    public String getText4 () {
        return mButton_exercises;
    }
}
