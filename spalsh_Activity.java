package com.projects.prathamesh.imagecompressor;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class spalsh_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_);

    }

    @Override
    protected void onStart() {
        super.onStart();


        new CountDownTimer(4000,100) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                Intent homePage = new Intent(getApplicationContext(),Home_Activity.class);
                startActivity(homePage);
            }
        }.start();
    }
}
