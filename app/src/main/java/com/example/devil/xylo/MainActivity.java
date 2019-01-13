package com.example.devil.xylo;

import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;

public class MainActivity extends Activity {

    private SoundPool mSoundPool;
    private int mASound;
    private int mBSound;
    private int mCSound;
    private int mDSound;
    private int mESound;
    private int mFSound;
    private int mGSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool.Builder().setMaxStreams(7).build();

        mASound = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSound = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);
        mCSound = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSound = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESound = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSound = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSound = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);

    }

    public void playA(View v) {
        Log.d("Xylo", "Sound A");
        mSoundPool.play(mASound,1.0f,1.0f,0,0,1.0f);
    }

    public void playB(View v) {
        Log.d("Xylo", "Sound B");
        mSoundPool.play(mBSound,1.0f,1.0f,0,0,1.0f);
    }

    public void playC(View v) {
        Log.d("Xylo", "Sound C");
        mSoundPool.play(mCSound,1.0f,1.0f,0,0,1.0f);
    }

    public void playD(View v) {
        Log.d("Xylo", "Sound D");
        mSoundPool.play(mDSound,1.0f,1.0f,0,0,1.0f);
    }

    public void playE(View v) {
        Log.d("Xylo", "Sound E");
        mSoundPool.play(mESound,1.0f,1.0f,0,0,1.0f);
    }

    public void playF(View v) {
        Log.d("Xylo", "Sound F");
        mSoundPool.play(mFSound,1.0f,1.0f,0,0,1.0f);
    }

    public void playG(View v) {
        Log.d("Xylo", "Sound G");
        mSoundPool.play(mGSound,1.0f,1.0f,0,0,1.0f);
    }
}
