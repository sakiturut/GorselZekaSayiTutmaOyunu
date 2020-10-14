package com.android.grselzekasaytutmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SayiGosterActivity extends AppCompatActivity {
    TextView textView_timer;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b_Tamam;
    EditText editText_number;
    TextView textView_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi_goster);

        textView_timer = findViewById(R.id.textView_timer);
        textView_number=findViewById(R.id.editText_number);
        //editText_number=findViewById(R.id.editText_number);
        //editText_number.setFocusable(false);
        //editText_number.setFocusableInTouchMode(true);

        b1=findViewById(R.id.button_one);
        b2=findViewById(R.id.button_two);
        b3=findViewById(R.id.button_three);
        b4=findViewById(R.id.button_four);
        b5=findViewById(R.id.button_five);
        b6=findViewById(R.id.button_six);
        b7=findViewById(R.id.button_seven);
        b8=findViewById(R.id.button_eight);
        b9=findViewById(R.id.button_nine);
        b_Tamam=findViewById(R.id.button_tamam);




        new CountDownTimer(10000, 1000) {
            int time;
            public void onTick(long millisUntilFinished) {
                time = (int) (millisUntilFinished / 1000);
                textView_timer.setText(String.valueOf(time));
            }

            public void onFinish() {
                time -=1 ;
                textView_timer.setText(String.valueOf(time));
                toastMessage("-10");
                //finish();
            }
        }.start();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("1");

            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("2");
            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("4");
            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("5");
            }
        });



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("6");
            }
        });



        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("7");
            }
        });



        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("8");
            }
        });



        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_number.append("9");
            }
        });


        b_Tamam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                toastMessage("+10");
            }
        });

    }

    public void toastMessage(String msg){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence message = msg;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }


}
