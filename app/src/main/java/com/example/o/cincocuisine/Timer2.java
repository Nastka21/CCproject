package com.example.o.cincocuisine;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Timer2 extends AppCompatActivity {
        private static final long START_TIME_IN_MILLIS2 = 2700000;
        private TextView mTextViewCountDown2;
        private Button mButtonStartPause2;
        private Button mButtonReset2;

        private CountDownTimer mCountDownTimer2;

        private boolean mTimerRunning2;

        private long mTimeLeftInMillis2 = START_TIME_IN_MILLIS2;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_timer2);

            mTextViewCountDown2= findViewById(R.id.text_view_countdown2);
            mButtonStartPause2=findViewById(R.id.button_start_pause2);
            mButtonReset2=findViewById(R.id.button_reset2);

            mButtonStartPause2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mTimerRunning2){
                        pauseTimer();
                    } else  {
                        startTimer();
                    }

                }
            });

            mButtonReset2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    resetTimer();

                }
            });

            updateCountDownText();
        }

    private void startTimer(){
        mCountDownTimer2= new CountDownTimer(mTimeLeftInMillis2,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis2=millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning2= false;
                mButtonStartPause2.setText("start");
                mButtonStartPause2.setVisibility(View.INVISIBLE);
                mButtonReset2.setVisibility(View.VISIBLE);

            }
        }.start();
        mTimerRunning2=true;
        mButtonStartPause2.setText("pause");
        mButtonReset2.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mCountDownTimer2.cancel();
        mTimerRunning2=false;
        mButtonStartPause2.setText("start");
        mButtonReset2.setVisibility(View.VISIBLE);

    }

    private void resetTimer() {
        mTimeLeftInMillis2=START_TIME_IN_MILLIS2;
        updateCountDownText();
        mButtonReset2.setVisibility(View.INVISIBLE);
        mButtonStartPause2.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText(){
        int minutes=(int)(mTimeLeftInMillis2 / 1000) / 60;
        int seconds=(int)(mTimeLeftInMillis2 / 1000) % 60;

        String timeLeftFormatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        mTextViewCountDown2.setText(timeLeftFormatted);
    }
}



