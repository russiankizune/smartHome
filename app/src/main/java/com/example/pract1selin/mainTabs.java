package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class mainTabs extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tabs);
    }

    private void setFragment(Fragment fragment)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.tabFR, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void goHome (View v)
    {
        HomeFragment homeFragment = new HomeFragment();
        setFragment(homeFragment);
    }

    public void goSettings (View v)
    {
        SettingsFragment settingsFragment = new SettingsFragment();
        setFragment(settingsFragment);
    }


}