package com.example.testapplication;

import com.example.testapplication.objects.APIResponseClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface RESTCallInterface {
    @GET
    Call<APIResponseClass> GetList(@Url String endpoint,
                                   @Query("forecast") String searchString,
                                   @Part("appid") String appId);
}
