package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View v)
    {
        EditText ETemail = findViewById(R.id.ETemail);
        EditText ETpassword = findViewById(R.id.ETpassword);
        String email = ETemail.getText().toString();
        String password = ETpassword.getText().toString();

       if ((email.equals("a") ) && (password.equals("s")))
        {
            Intent intent = new Intent(this, activityHome2.class);
            startActivity(intent);

        }
    }

    public void signIn(View v)
    {
        Intent intent = new Intent(this, signIn.class);
        startActivity(intent);
    }

    public void goFragments(View v)
    {
        Intent intent = new Intent(this, mainTabs.class);
        startActivity(intent);
    }
}