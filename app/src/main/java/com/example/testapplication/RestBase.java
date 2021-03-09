package com.example.testapplication;

import com.example.testapplication.objects.APIResponseClass;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestBase implements Serializable {
    public static RESTCallInterface call = InitializeCall();
    public static Retrofit retrofit = null;
    public static String appId = "65d00499677e59496ca2f318eb68c049";

    public static RESTCallInterface InitializeCall() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/")
                    //forecast?q={city}&appid={api key}
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RESTCallInterface.class);
    }

    public static void GetListBase(String searchString, final RestCallback restCallback, String endpoint) {
        call.GetList(endpoint, searchString, appId).enqueue(new Callback<APIResponseClass>() {
            @java.lang.Override
            public void onResponse(Call<APIResponseClass> call, Response<APIResponseClass> response) {
                if (response.code() == 200) {
                    Object responseObject = response.body();
                    APIResponseClass apiResponseClass = null;
                    if (responseObject != null) {
                        try {
                            apiResponseClass = response.body();
                            restCallback.onSuccess(apiResponseClass);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        restCallback.onSuccess(apiResponseClass);
                    }
                }
            }

            @Override
            public void onFailure(Call<APIResponseClass> call, Throwable t) {
                restCallback.onFailure(t);
            }
        });
    }
}
