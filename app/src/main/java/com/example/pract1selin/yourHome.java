package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class yourHome extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_home);
    }

    public void addRoom(View v)
    {
        Intent intent1 = new Intent(this, addRoom.class);
        startActivity(intent1);
    }

    public void goKitchen(View vi)
    {
        Intent intent2 = new Intent(this, Kitchen.class);
        startActivity(intent2);
    }

    public void goProfile(View vi)
    {
        TableLayout rooms = findViewById(R.id.tableRooms);
        rooms.setVisibility(View.INVISIBLE);
    }

    public void frag(View vi)
    {
        Intent intent2 = new Intent(this, activityHome2.class);
        startActivity(intent2);
    }
}