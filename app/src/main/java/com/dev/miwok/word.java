package com.dev.miwok;

public class word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static int NO_IMAGE_PROVIDED = -1;

    public word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public void setmImageResourceID(int mImageResourceID){
        this.mImageResourceID = mImageResourceID;
    }

}
