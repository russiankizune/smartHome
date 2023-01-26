package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class activityHome2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        ImageView iv = findViewById(R.id.imageView15);
        ImageView iv2 = findViewById(R.id.imageView18);
        Button b = findViewById(R.id.button57);
        TextView tw = findViewById(R.id.textView4);
        TextView tw2 = findViewById(R.id.textView7);
        ImageButton ib = findViewById(R.id.imageButton3);
        iv.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        b.setVisibility(View.INVISIBLE);
        tw.setVisibility(View.VISIBLE);
        tw2.setVisibility(View.VISIBLE);
        ib.setVisibility(View.VISIBLE);
    }

    public void goSettings(View v)
    {
        ImageView iv = findViewById(R.id.imageView15);
        ImageView iv2 = findViewById(R.id.imageView18);
        Button b = findViewById(R.id.button57);
        TextView tw = findViewById(R.id.textView4);
        TextView tw2 = findViewById(R.id.textView7);
        ImageButton ib = findViewById(R.id.imageButton3);
        iv.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.VISIBLE);
        b.setVisibility(View.VISIBLE);
        tw.setVisibility(View.INVISIBLE);
        tw2.setVisibility(View.INVISIBLE);
        ib.setVisibility(View.INVISIBLE);
        SettingsFragment settingsFragment = new SettingsFragment();
        setFragment(settingsFragment);
    }

    public void goHome(View v)
    {
        ImageView iv = findViewById(R.id.imageView15);
        ImageView iv2 = findViewById(R.id.imageView18);
        Button b = findViewById(R.id.button57);
        TextView tw = findViewById(R.id.textView4);
        TextView tw2 = findViewById(R.id.textView7);
        ImageButton ib = findViewById(R.id.imageButton3);
        iv.setVisibility(View.VISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        b.setVisibility(View.INVISIBLE);
        tw.setVisibility(View.VISIBLE);
        tw2.setVisibility(View.VISIBLE);
        ib.setVisibility(View.VISIBLE);
        HomeFragment homeFragment = new HomeFragment();
        setFragment(homeFragment);
    }

    public void goKitchen(View v)
    {
        Intent intent = new Intent(this, Kitchen.class);
        startActivity(intent);
    }
    public void addRoom(View v)
    {
        Intent intent1 = new Intent(this, addRoom.class);
        startActivity(intent1);
    }
    private void setFragment(Fragment fragment)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.FR, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}