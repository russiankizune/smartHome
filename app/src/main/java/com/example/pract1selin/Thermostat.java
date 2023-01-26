package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Thermostat extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermostat);
    }

    public void goLight(View view)
    {
        Intent intent = new Intent(this, Kitchen.class);
        startActivity(intent);
    }

    public void goBack(View view)
    {
        Intent intent = new Intent(this, yourHome.class);
        startActivity(intent);
    }
}