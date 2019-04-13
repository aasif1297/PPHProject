package com.londonsoftware.calisthenics.calisthenics;

public class ProgramCardViewItem {
    public int mImageResource;
    public String mText1;
    public String mText2;
    public String mText3;
    public String mButton;

    public ProgramCardViewItem(int imageResource, String text1, String text2, String text3, String text4) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mText3 = text3;
        mButton = text4;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String getText2 () {
        return mText2;
    }

    public String getText3 () {
        return mText3;
    }

    public String getText4 () {
        return mButton;
    }
}
