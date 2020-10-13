package com.android.grselzekasaytutmaoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SayiGosterActivity extends AppCompatActivity {
    TextView textView;
    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayi_goster);

        textView = findViewById(R.id.textView2);
        buton=findViewById(R.id.button);

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                int time = (int) (millisUntilFinished / 1000);
                textView.setText(String.valueOf(time));
            }

            public void onFinish() {

            }
        }.start();

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}
