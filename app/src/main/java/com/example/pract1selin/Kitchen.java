package com.example.pract1selin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Kitchen extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
    }

    public void goTherm(View view)
    {
        Intent intent = new Intent(this, Thermostat.class);
        startActivity(intent);
    }

    public void goBack(View view)
    {
        Intent intent = new Intent(this, activityHome2.class);
        startActivity(intent);
    }

    public void lightLevel(View v)
    {
        Button btn1 = findViewById(R.id.button21);
        Button btn2 = findViewById(R.id.button22);
        Button btn3 = findViewById(R.id.button23);
        Button btn4 = findViewById(R.id.button24);
        Button btn5 = findViewById(R.id.button25);
        Button btn6 = findViewById(R.id.button26);
        Button btn7 = findViewById(R.id.button27);
        Button btn8 = findViewById(R.id.button28);
        Button btn9 = findViewById(R.id.button29);
        Button btn10 = findViewById(R.id.button30);
        Button btn11 = findViewById(R.id.button32);
        Button btn12 = findViewById(R.id.button33);
        Button btn13 = findViewById(R.id.button34);
        Button btn14 = findViewById(R.id.button35);
        Button btn15 = findViewById(R.id.button38);
        Button btn16 = findViewById(R.id.button39);
        TextView tw = findViewById(R.id.textView17);

        switch (v.getId())
        {
            case 2131230836:
            {
                tw.setText("10");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230837:
            {
                tw.setText("20");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230838:
            {
                tw.setText("30");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230839:
            {
                tw.setText("40");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230840:
            {
                tw.setText("50");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230841:
            {
                tw.setText("60");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230842:
            {
                tw.setText("70");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230843:
            {
                tw.setText("80");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230844:
            {
                tw.setText("90");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230846:
            {
                tw.setText("100");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
                case 2131230848:
            {
                tw.setText("110");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230849:
            {
                tw.setText("120");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230850:
            {
                tw.setText("130");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn13.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230851:
            {
                tw.setText("140");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn13.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn14.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230854:
            {
                tw.setText("150");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn13.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn14.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn15.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
            }
            case 2131230855:
            {
                tw.setText("160");
                btn1.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn2.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn3.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn4.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn5.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn6.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn7.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn8.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn9.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn10.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn11.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn12.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn13.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn14.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn15.setBackgroundColor(Color.parseColor("#5E55A0"));
                btn16.setBackgroundColor(Color.parseColor("#5E55A0"));
                break;
            }
        }
    }

    public void info(View v)
    {
        TextView textView = findViewById(R.id.textView19);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://virtserver.swaggerhub.com/PSKWORKSHOP1/SmartLight/1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<Light> call = jsonPlaceHolderApi.getLights();

        call.enqueue(new Callback<Light>() {
            @Override
            public void onResponse(Call<Light> call, Response<Light> response)
            {
                if(!response.isSuccessful())
                {
                    textView.setText(String.valueOf(response.code()));
                    return;
                }

                Light light = response.body();

                    String content = "";
                    content += "ID: " + String.valueOf(light.getId()) + "\n";
                    content += "is ON: " + String.valueOf(light.isOn());
                    textView.setText(content);

            }

            @Override
            public void onFailure(Call<Light> call, Throwable t)
            {
                textView.setText("errror" + t.getMessage());
            }
        });
    }

    public void power(View v)
    {
        TextView textView = findViewById(R.id.textView19);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://virtserver.swaggerhub.com/PSKWORKSHOP1/SmartLight/1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<Light> call = jsonPlaceHolderApi.getPower();

        call.enqueue(new Callback<Light>()
        {
            @Override
            public void onResponse(Call<Light> call, Response<Light> response)
            {
                if(!response.isSuccessful())
                {
                    textView.setText(String.valueOf(response.code()));
                    return;
                }

                Light light = response.body();

                String content = "";
                content += "Power level: " + String.valueOf(light.getPower()) + "\n";
                textView.setText(content);

            }

            @Override
            public void onFailure(Call<Light> call, Throwable t)
            {
                textView.setText("errror" + t.getMessage());
            }
        });
    }

    public void setPowerLevel(View v)
    {
        TextView textView = findViewById(R.id.textView19);
        int id = 147;
        boolean isOn = false;
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://virtserver.swaggerhub.com/PSKWORKSHOP1/SmartLight/1/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<Void> call = jsonPlaceHolderApi.postLight();
        call.enqueue(new Callback<Void>()
        {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response)
            {
                if(!response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), String.valueOf(response.code()), Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getApplicationContext(), "New light created", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t)
            {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void petInfo(View v)
    {
        TextView level = findViewById(R.id.textView17);
        String levelS = String.valueOf(level.getText());
        TextView textView = findViewById(R.id.textView19);
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://petstore.swagger.io/v2/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        switch (levelS)
        {
            case "80":
                Call<petLight> call = jsonPlaceHolderApi.getPetE();

                call.enqueue(new Callback<petLight>()
                {
                    @Override
                    public void onResponse(Call<petLight> call, Response<petLight> response)
                    {
                        if(!response.isSuccessful())
                        {
                            textView.setText(String.valueOf(response.code()));
                            return;
                        }

                        petLight petlight = response.body();

                        String content = "";
                        content += "name " + String.valueOf(petlight.getName()) + "\n";
                        content += "state " + String.valueOf(petlight.getStatus()) + "\n";
                        content += "level " + String.valueOf(petlight.getId()) + "\n";
                        textView.setText(content);
                        Toast.makeText(getApplicationContext(), "aa", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<petLight> call, Throwable t)
                    {
                        textView.setText("errror" + t.getMessage());
                    }
                });
                break;
            case "20":
                Call<petLight> call1 = jsonPlaceHolderApi.getPetT();

                call1.enqueue(new Callback<petLight>()
                {
                    @Override
                    public void onResponse(Call<petLight> call1, Response<petLight> response)
                    {
                        if(!response.isSuccessful())
                        {
                            textView.setText(String.valueOf(response.code()));
                            return;
                        }

                        petLight petlight = response.body();

                        String content = "";
                        content += "name " + String.valueOf(petlight.getName()) + "\n";
                        content += "state " + String.valueOf(petlight.getStatus()) + "\n";
                        content += "level " + String.valueOf(petlight.getId()) + "\n";
                        textView.setText(content);
                        Toast.makeText(getApplicationContext(), "aa", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<petLight> call, Throwable t)
                    {
                        textView.setText("errror" + t.getMessage());
                    }
                });
        }

    }

    public void petUpdate(View v)
    {

        TextView textView = findViewById(R.id.textView19);
        TextView levelTW = findViewById(R.id.textView17);
        //String level = String.valueOf(levelTW.getText());
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://petstore.swagger.io/v2/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        //Call<Void> call = jsonPlaceHolderApi.postPet(147, "Kitchen", "level");
        Call<Void> call = jsonPlaceHolderApi.postPet();

        call.enqueue(new Callback<Void>()
        {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response)
            {
                if(!response.isSuccessful())
                {
                    textView.setText(String.valueOf(response.code()));
                    return;
                }

                Toast.makeText(getApplicationContext(), "Info updated", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Void> call, Throwable t)
            {
                textView.setText("errror" + t.getMessage());
            }
        });
    }

    public void hideLight(View v)
    {
        Button btn1 = findViewById(R.id.button21);
        Button btn2 = findViewById(R.id.button22);
        Button btn3 = findViewById(R.id.button23);
        Button btn4 = findViewById(R.id.button24);
        Button btn5 = findViewById(R.id.button25);
        Button btn6 = findViewById(R.id.button26);
        Button btn7 = findViewById(R.id.button27);
        Button btn8 = findViewById(R.id.button28);
        Button btn9 = findViewById(R.id.button29);
        Button btn10 = findViewById(R.id.button30);
        Button btn11 = findViewById(R.id.button32);
        Button btn12 = findViewById(R.id.button33);
        Button btn13 = findViewById(R.id.button34);
        Button btn14 = findViewById(R.id.button35);
        Button btn15 = findViewById(R.id.button38);
        Button btn16 = findViewById(R.id.button39);
        Button btn17 = findViewById(R.id.button20);
        Button btn18 = findViewById(R.id.button49);
        Button btn19 = findViewById(R.id.button18);
        Button btn20 = findViewById(R.id.button19);
        Button btn21 = findViewById(R.id.button50);
        Button btn22 = findViewById(R.id.button51);
        TextView tw1 = findViewById(R.id.textView17);
        TextView tw2 = findViewById(R.id.textView18);
        TextView tw3 = findViewById(R.id.textView19);
        TextView tw4 = findViewById(R.id.textView15);
        SeekBar sb = findViewById(R.id.seekBar3);
        Switch sw = findViewById(R.id.switch2);

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn10.setVisibility(View.INVISIBLE);
        btn11.setVisibility(View.INVISIBLE);
        btn12.setVisibility(View.INVISIBLE);
        btn13.setVisibility(View.INVISIBLE);
        btn14.setVisibility(View.INVISIBLE);
        btn15.setVisibility(View.INVISIBLE);
        btn16.setVisibility(View.INVISIBLE);
        btn17.setVisibility(View.INVISIBLE);
        btn18.setVisibility(View.INVISIBLE);
        btn19.setVisibility(View.INVISIBLE);
        btn20.setVisibility(View.INVISIBLE);
        btn21.setVisibility(View.VISIBLE);
        btn22.setVisibility(View.VISIBLE);
        tw1.setText("30");
        tw2.setText("o");
        tw3.setText("Temperature,  °C");
        tw4.setText("Thermostat");
        sb.setVisibility(View.VISIBLE);
        sw.setVisibility(View.VISIBLE);
    }

    public void hideTherm(View v)
    {
        Button btn1 = findViewById(R.id.button21);
        Button btn2 = findViewById(R.id.button22);
        Button btn3 = findViewById(R.id.button23);
        Button btn4 = findViewById(R.id.button24);
        Button btn5 = findViewById(R.id.button25);
        Button btn6 = findViewById(R.id.button26);
        Button btn7 = findViewById(R.id.button27);
        Button btn8 = findViewById(R.id.button28);
        Button btn9 = findViewById(R.id.button29);
        Button btn10 = findViewById(R.id.button30);
        Button btn11 = findViewById(R.id.button32);
        Button btn12 = findViewById(R.id.button33);
        Button btn13 = findViewById(R.id.button34);
        Button btn14 = findViewById(R.id.button35);
        Button btn15 = findViewById(R.id.button38);
        Button btn16 = findViewById(R.id.button39);
        Button btn17 = findViewById(R.id.button20);
        Button btn18 = findViewById(R.id.button49);
        Button btn19 = findViewById(R.id.button18);
        Button btn20 = findViewById(R.id.button19);
        Button btn21 = findViewById(R.id.button50);
        Button btn22 = findViewById(R.id.button51);
        TextView tw1 = findViewById(R.id.textView17);
        TextView tw2 = findViewById(R.id.textView18);
        TextView tw3 = findViewById(R.id.textView19);
        TextView tw4 = findViewById(R.id.textView15);
        SeekBar sb = findViewById(R.id.seekBar3);
        Switch sw = findViewById(R.id.switch2);


        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.VISIBLE);
        btn6.setVisibility(View.VISIBLE);
        btn7.setVisibility(View.VISIBLE);
        btn8.setVisibility(View.VISIBLE);
        btn9.setVisibility(View.VISIBLE);
        btn10.setVisibility(View.VISIBLE);
        btn11.setVisibility(View.VISIBLE);
        btn12.setVisibility(View.VISIBLE);
        btn13.setVisibility(View.VISIBLE);
        btn14.setVisibility(View.VISIBLE);
        btn15.setVisibility(View.VISIBLE);
        btn16.setVisibility(View.VISIBLE);
        btn17.setVisibility(View.VISIBLE);
        btn18.setVisibility(View.VISIBLE);
        btn19.setVisibility(View.VISIBLE);
        btn20.setVisibility(View.VISIBLE);
        btn21.setVisibility(View.INVISIBLE);
        btn22.setVisibility(View.INVISIBLE);
        tw1.setText("0");
        tw2.setText("lm");
        tw3.setText("Light strength");
        tw4.setText("Main lights");
        sb.setVisibility(View.INVISIBLE);
        sw.setVisibility(View.INVISIBLE);
    }
/*
    public void check(View view)
    {
    //https://app.swaggerhub.com/apis/PSKWORKSHOP1/SmartLight/1
        TextView textView = findViewById(R.id.textView19);
        String y = String.valueOf(view.getId());
        textView.setText(y);
    }*/
}