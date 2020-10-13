package com.android.grselzekasaytutmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textNumber,textTime;
    //MyCountDownTimer myCountDownTimer;

    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumber = (TextView)findViewById(R.id.textView);
        textTime = (TextView)findViewById(R.id.textView2);

        buton=findViewById(R.id.button);


        new CountDownTimer(5000, 1000) {
            int time;
            public void onTick(long millisUntilFinished) {
                time = (int) (millisUntilFinished / 1000);
                textTime.setText(String.valueOf(time));

            }

            public void onFinish() {
                time -=1;
                textTime.setText(String.valueOf(time));
                Intent sayiGosterIntent = new Intent(getApplicationContext(),SayiGosterActivity.class);
                startActivity(sayiGosterIntent);


            }
        }.start();
    }

/*
    public class MyCountDownTimer extends CountDownTimer{

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            textTime.setText((int) (millisUntilFinished / 1000));
        }

        @Override
        public void onFinish() {
            Intent sayiGosterIntent = new Intent(getApplicationContext(),SayiGosterActivity.class);
            startActivity(sayiGosterIntent);
        }
    }*/
}
