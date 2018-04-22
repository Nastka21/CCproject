package com.example.o.cincocuisine;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Timer4 extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS4 = 720000;
    private TextView mTextViewCountDown4;
    private Button mButtonStartPause4;
    private Button mButtonReset4;

    private CountDownTimer mCountDownTimer4;

    private boolean mTimerRunning4;

    private long mTimeLeftInMillis4= START_TIME_IN_MILLIS4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer4);

        mTextViewCountDown4= findViewById(R.id.text_view_countdown4);
        mButtonStartPause4=findViewById(R.id.button_start_pause4);
        mButtonReset4=findViewById(R.id.button_reset4);

        mButtonStartPause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTimerRunning4){
                    pauseTimer();
                } else  {
                    startTimer();
                }

            }
        });

        mButtonReset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();

            }
        });

        updateCountDownText();
    }

    private void startTimer(){
        mCountDownTimer4= new CountDownTimer(mTimeLeftInMillis4,1000) {
            @Override
            public void onTick(long millisUntilFinished4) {
                mTimeLeftInMillis4=millisUntilFinished4;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning4= false;
                mButtonStartPause4.setText("start");
                mButtonStartPause4.setVisibility(View.INVISIBLE);
                mButtonReset4.setVisibility(View.VISIBLE);

            }
        }.start();
        mTimerRunning4=true;
        mButtonStartPause4.setText("pause");
        mButtonReset4.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mCountDownTimer4.cancel();
        mTimerRunning4=false;
        mButtonStartPause4.setText("start");
        mButtonReset4.setVisibility(View.VISIBLE);

    }

    private void resetTimer() {
        mTimeLeftInMillis4=START_TIME_IN_MILLIS4;
        updateCountDownText();
        mButtonReset4.setVisibility(View.INVISIBLE);
        mButtonStartPause4.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText(){
        int minutes=(int)(mTimeLeftInMillis4 / 1000) / 60;
        int seconds=(int)(mTimeLeftInMillis4 / 1000) % 60;

        String timeLeftFormatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        mTextViewCountDown4.setText(timeLeftFormatted);
    }
}

