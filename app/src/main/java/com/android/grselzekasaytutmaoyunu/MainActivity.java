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
/*
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myCountDownTimer = new MyCountDownTimer(10000, 1000);
               // myCountDownTimer.start();
            }
        });

*/

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                int time = (int) (millisUntilFinished / 1000);
                textTime.setText(String.valueOf(time));

            }

            public void onFinish() {
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
