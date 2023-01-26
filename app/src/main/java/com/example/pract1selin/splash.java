package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

import java.util.TimerTask;

public class splash extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashy();
    }



    public void splashy()
    {
        ImageView myImageView = findViewById(R.id.imageView);
        Intent intent = new Intent(this, MainActivity.class);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        myImageView.startAnimation(animation);
        animation.setAnimationListener(new AnimationListener()
        {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation arg0) {

                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}