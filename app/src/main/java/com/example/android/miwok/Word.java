package com.example.android.miwok;

/**
 * Created by chris on 28-02-17.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * + * It contains a default translation, a Miwok translation, and an image for that word.
 */

public class Word {

    private final static int NO_IMAGE = -1;
    /**
     * Holds the Default Language Translation of the word
     */
    private String mDefaultTranslation;
    /**
     * Holds the Miwok Language Translation of the word
     */
    private String mMiwokTranslation;
    /**
     * Holds the Drawable Resource ID
     */
    private int mImageResourceId = NO_IMAGE;
    /**
     * Holds the Audio file Resource ID
     */
    private int mAudioResourceId;

    /**
     * Construct a new Word object containing the word translation
     *
     * @param defaultTranslation is the default language translation of the word
     * @param miwokTranslation   is the Miwok translation fo the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Construct a new Word object containing the word translation with image
     *
     * @param defaultTranslation is the default language translation of the word
     * @param miwokTranslation   is the Miwok translation fo the word
     * @param imageResourceId    is the Drawable Resource ID of the image associated with the workd
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Return the Miwok translation of the word
     *
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the default language translation of the word
     *
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Return the Drawable Resource ID of image associated with the word
     *
     * @return
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return (mImageResourceId != NO_IMAGE);
    }

    /**
     * Return the RAW Resource ID of the Audio associated with the word
     * @return
     */
    public int getAudioResourceId() {return mAudioResourceId;}
}
