package com.dev.miwok;

public class word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    // image resource id for the word
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // audio resource id for the word
    private int mAudioResourceID;

    private static int NO_IMAGE_PROVIDED = -1;

    public word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceID = mAudioResourceID;
    }

    public word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceID, int mAudioResourceID){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceID = mImageResourceID;
        this.mAudioResourceID = mAudioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getmImageResourceID(){
        return mImageResourceID;
    }

    public int getmAudioResourceID(){
        return mAudioResourceID;
    }
}
