package com.example.mapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.view.View;

public class Splash extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    ImageView image;

    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        image = findViewById(R.id.splash);
        image.animate().alpha(3000).setDuration(0);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent int1 = new Intent(Splash.this,Login.class);
                startActivity(int1);
                finish();
            }
        },3000 );
    }
}
