package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_ANIMATION = 3000;
    //Variables
    TextView text1, facebook_text;
    Animation splash;

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //For hiding the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animations
        splash = AnimationUtils.loadAnimation(this, R.anim.splash);

        //Hooks
        logo = findViewById(R.id.logo);
        text1 = findViewById(R.id.text1);
        facebook_text = findViewById(R.id.facebook_text);

        //For setting animations to our tests and images

        text1.setAnimation(splash);
        facebook_text.setAnimation(splash);
        logo.setAnimation(splash);

        //For going to new activity automatically on its own after few seconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Agree_terms.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_ANIMATION);
    }
}
