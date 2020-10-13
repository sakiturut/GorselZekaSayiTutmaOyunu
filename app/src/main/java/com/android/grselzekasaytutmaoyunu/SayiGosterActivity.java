package com.android.grselzekasaytutmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SayiGosterActivity extends AppCompatActivity {
    TextView textView;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi_goster);

        textView = findViewById(R.id.textView2);
        buton=findViewById(R.id.button);

        new CountDownTimer(5000, 1000) {
            int time;
            public void onTick(long millisUntilFinished) {
                time = (int) (millisUntilFinished / 1000);
                textView.setText(String.valueOf(time-1));
            }

            public void onFinish() {
                time -=1 ;
                textView.setText(String.valueOf(time));
                toastMessage("-10");
                finish();
            }
        }.start();

        buton.setOnClickListener(new View.OnClickListener() {
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
