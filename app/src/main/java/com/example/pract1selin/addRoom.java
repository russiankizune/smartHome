package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class addRoom extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void goBack(View view)
    {
        Intent intent = new Intent(this, yourHome.class);
        startActivity(intent);
    }

    public void roomChoise(View v)
    {
        Button btn1 = findViewById(R.id.button7); //2131231218
        Button btn2 = findViewById(R.id.button8); //2131231219
        Button btn3 = findViewById(R.id.button9); //2131231220
        Button btn4 = findViewById(R.id.button10); //2131231208
        Button btn5 = findViewById(R.id.button11); //2131231209
        Button btn6 = findViewById(R.id.button12); //2131231210
        Button btn7 = findViewById(R.id.button13); //2131231211
        Button btn8 = findViewById(R.id.button14); //2131231212
        Button btn9 = findViewById(R.id.button15); //2131231213
        TextView tw1 = findViewById(R.id.textView11);
        TextView tw2 = findViewById(R.id.textView25);
        TextView tw3 = findViewById(R.id.textView26);
        TextView tw4 = findViewById(R.id.textView27);
        TextView tw5 = findViewById(R.id.textView28);
        TextView tw6 = findViewById(R.id.textView29);
        TextView tw7 = findViewById(R.id.textView30);
        TextView tw8 = findViewById(R.id.textView31);
        TextView tw9 = findViewById(R.id.textView32);
        switch (v.getId())
        {
            case 2131231218:
            {
                tw1.setTextColor(Color.parseColor("#5E55A0"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231219:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#5E55A0"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231220:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#5E55A0"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231208:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#5E55A0"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231209:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#5E55A0"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231210:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#5E55A0"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231211:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#5E55A0"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
            case 2131231212:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#AFAFAF"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#5E55A0"));
                break;
            }
            case 2131231213:
            {
                tw1.setTextColor(Color.parseColor("#AFAFAF"));
                tw2.setTextColor(Color.parseColor("#AFAFAF"));
                tw3.setTextColor(Color.parseColor("#AFAFAF"));
                tw4.setTextColor(Color.parseColor("#AFAFAF"));
                tw5.setTextColor(Color.parseColor("#AFAFAF"));
                tw6.setTextColor(Color.parseColor("#AFAFAF"));
                tw7.setTextColor(Color.parseColor("#5E55A0"));
                tw8.setTextColor(Color.parseColor("#AFAFAF"));
                tw9.setTextColor(Color.parseColor("#AFAFAF"));
                break;
            }
        }
    }

    /*public void check(View view)
    {
        TextView textView = findViewById(R.id.textView5);
        String y = String.valueOf(view.getId());
        textView.setText(y);
    }*/

}