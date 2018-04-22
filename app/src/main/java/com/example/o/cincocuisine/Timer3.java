package com.example.o.cincocuisine;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Timer3 extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS3 = 3000000;
    private TextView mTextViewCountDown3;
    private Button mButtonStartPause3;
    private Button mButtonReset3;

    private CountDownTimer mCountDownTimer3;

    private boolean mTimerRunning3;

    private long mTimeLeftInMillis3= START_TIME_IN_MILLIS3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer3);

        mTextViewCountDown3= findViewById(R.id.text_view_countdown3);
        mButtonStartPause3=findViewById(R.id.button_start_pause3);
        mButtonReset3=findViewById(R.id.button_reset3);

        mButtonStartPause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mTimerRunning3){
                    pauseTimer();
                } else  {
                    startTimer();
                }

            }
        });

        mButtonReset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();

            }
        });

        updateCountDownText();
    }

    private void startTimer(){
        mCountDownTimer3= new CountDownTimer(mTimeLeftInMillis3,1000) {
            @Override
            public void onTick(long millisUntilFinished3) {
                mTimeLeftInMillis3=millisUntilFinished3;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning3= false;
                mButtonStartPause3.setText("start");
                mButtonStartPause3.setVisibility(View.INVISIBLE);
                mButtonReset3.setVisibility(View.VISIBLE);

            }
        }.start();
        mTimerRunning3=true;
        mButtonStartPause3.setText("pause");
        mButtonReset3.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mCountDownTimer3.cancel();
        mTimerRunning3=false;
        mButtonStartPause3.setText("start");
        mButtonReset3.setVisibility(View.VISIBLE);

    }

    private void resetTimer() {
        mTimeLeftInMillis3=START_TIME_IN_MILLIS3;
        updateCountDownText();
        mButtonReset3.setVisibility(View.INVISIBLE);
        mButtonStartPause3.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText(){
        int minutes=(int)(mTimeLeftInMillis3 / 1000) / 60;
        int seconds=(int)(mTimeLeftInMillis3 / 1000) % 60;

        String timeLeftFormatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        mTextViewCountDown3.setText(timeLeftFormatted);
    }
}

