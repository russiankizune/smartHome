package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


public class signIn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }



    public void signIn(View v)
    {
        final EditText ETemail = findViewById(R.id.ETemail2);
        final EditText ETpassword = findViewById(R.id.ETpassword2);
        EditText ETName = findViewById(R.id.ETName);
        String email = ETemail.getText().toString();
        String password = ETpassword.getText().toString();
        String name = ETName.getText().toString();

        Intent intent = new Intent(this, addRoom.class);
        startActivity(intent);
    }

}