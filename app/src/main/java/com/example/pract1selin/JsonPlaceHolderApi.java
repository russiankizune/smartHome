package com.example.pract1selin;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi
{
    @GET("lights/147")
    Call<Light> getLights();

    @GET("lights/147/details")
    Call<Light> getPower();

    @POST("lights?id=147&isOn=false")
    Call<Void> postLight();

    @GET("pet/80")
    Call<petLight> getPetE();

    @GET("pet/20")
    Call<petLight> getPetT();

    @POST("pet/{petId}")
   // Call<Void> postPet(@Path("petId") int petId, String name, String status);
    Call<Void> postPet();
}
