package com.example.prudentialfinance.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HTTPService {

//    public static final String APP_PATH = "http://192.168.25.243/source-code/";
    public static final String APP_PATH = "http://192.168.1.127/source-code/";
//    public static final String APP_PATH = "http://192.168.1.65/source-code/";
    public static final String UPLOADS_URL = APP_PATH + "assets/uploads";

    private static Retrofit retrofit;

    public static Retrofit getInstance()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(APP_PATH)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

}
